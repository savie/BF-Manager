package com.amazonaws.services.s3;

import com.alipay.sdk.m.p.a;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Protocol;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.auth.Signer;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.event.ProgressListenerCallbackExecutor;
import com.amazonaws.event.ProgressReportingInputStream;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.services.s3.internal.AWSS3V4Signer;
import com.amazonaws.services.s3.internal.AbstractS3ResponseHandler;
import com.amazonaws.services.s3.internal.BucketNameUtils;
import com.amazonaws.services.s3.internal.CompleteMultipartUploadRetryCondition;
import com.amazonaws.services.s3.internal.DeleteObjectsResponse;
import com.amazonaws.services.s3.internal.InputSubstream;
import com.amazonaws.services.s3.internal.ObjectExpirationHeaderHandler;
import com.amazonaws.services.s3.internal.RepeatableFileInputStream;
import com.amazonaws.services.s3.internal.ResponseHeaderHandlerChain;
import com.amazonaws.services.s3.internal.S3ErrorResponseHandler;
import com.amazonaws.services.s3.internal.S3ExecutionContext;
import com.amazonaws.services.s3.internal.S3HttpUtils;
import com.amazonaws.services.s3.internal.S3MetadataResponseHandler;
import com.amazonaws.services.s3.internal.S3ObjectResponseHandler;
import com.amazonaws.services.s3.internal.S3RequesterChargedHeaderHandler;
import com.amazonaws.services.s3.internal.S3Signer;
import com.amazonaws.services.s3.internal.S3VersionHeaderHandler;
import com.amazonaws.services.s3.internal.S3XmlResponseHandler;
import com.amazonaws.services.s3.internal.ServerSideEncryptionHeaderHandler;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.internal.XmlWriter;
import com.amazonaws.services.s3.metrics.S3ServiceMetric;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.CopyObjectResult;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.DeleteObjectsRequest;
import com.amazonaws.services.s3.model.GetObjectMetadataRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.HeadBucketRequest;
import com.amazonaws.services.s3.model.HeadBucketResult;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.MultiObjectDeleteException;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.ObjectTagging;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.SSEAlgorithm;
import com.amazonaws.services.s3.model.SSEAwsKeyManagementParams;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import com.amazonaws.services.s3.model.transform.BucketConfigurationXmlFactory;
import com.amazonaws.services.s3.model.transform.HeadBucketResultHandler;
import com.amazonaws.services.s3.model.transform.MultiObjectDeleteXmlFactory;
import com.amazonaws.services.s3.model.transform.RequestPaymentConfigurationXmlFactory;
import com.amazonaws.services.s3.model.transform.RequestXmlFactory;
import com.amazonaws.services.s3.model.transform.XmlResponsesSaxParser;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.Base64;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.LengthCheckInputStream;
import com.amazonaws.util.Md5Utils;
import com.amazonaws.util.ServiceClientHolderInputStream;
import com.amazonaws.util.ValidationUtils;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import l.C10732;
import l.C14483;
import l.C16076;
import l.C25272;
import l.C3188;
import l.C4681;

/* JADX INFO: loaded from: classes.dex */
public class AmazonS3Client extends AmazonWebServiceClient implements AmazonS3 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static Log f452 = LogFactory.m296(AmazonS3Client.class);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Map f453;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public S3ClientOptions f454;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AWSCredentialsProvider f455;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile String f456;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final S3XmlResponseHandler f457;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final S3ErrorResponseHandler f458;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f459;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final CompleteMultipartUploadRetryCondition f460;

    static {
        AwsSdkMetrics.m310(Arrays.asList(S3ServiceMetric.m486()));
        SignerFactory.m217(AWSS3V4Signer.class, "AWSS3V4SignerType");
        new BucketConfigurationXmlFactory();
        new RequestPaymentConfigurationXmlFactory();
        f453 = C4681.synchronizedMap(new AnonymousClass1(300, 1.1f, true));
    }

    /* JADX INFO: renamed from: com.amazonaws.services.s3.AmazonS3Client$1, reason: invalid class name */
    public final class AnonymousClass1 extends LinkedHashMap {
        public static final long serialVersionUID = 23453;

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry entry) {
            return size() > 300;
        }
    }

    @Deprecated
    public AmazonS3Client() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    @Deprecated
    public AmazonS3Client(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration, new UrlHttpClient(clientConfiguration));
        this.f458 = new S3ErrorResponseHandler();
        this.f457 = new S3XmlResponseHandler(null);
        this.f454 = new S3ClientOptions();
        this.f459 = 1024;
        this.f460 = new CompleteMultipartUploadRetryCondition();
        this.f455 = aWSCredentialsProvider;
        mo151("s3.amazonaws.com");
        HandlerChainFactory handlerChainFactory = new HandlerChainFactory();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f75;
        copyOnWriteArrayList.addAll(handlerChainFactory.m231());
        copyOnWriteArrayList.addAll(handlerChainFactory.m230());
    }

    @Override // com.amazonaws.AmazonWebServiceClient
    /* JADX INFO: renamed from: ۙ */
    public void mo151(String str) {
        if (str.endsWith("s3-accelerate.amazonaws.com")) {
            throw new IllegalStateException("To enable accelerate mode, please use AmazonS3Client.setS3ClientOptions(S3ClientOptions.builder().setAccelerateModeEnabled(true).build());");
        }
        super.mo151(str);
        if (str.endsWith("s3.amazonaws.com")) {
            return;
        }
        this.f456 = AwsHostNameUtils.m733(this.f71.getHost(), "s3");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ObjectListing m442(ListObjectsRequest listObjectsRequest) {
        ValidationUtils.m791(listObjectsRequest.m592(), "The bucket name parameter must be specified when listing objects in a bucket");
        final boolean zEquals = "url".equals(null);
        DefaultRequest defaultRequestM440 = m440(listObjectsRequest.m592(), null, listObjectsRequest, HttpMethodName.GET, null);
        String strM590 = listObjectsRequest.m590();
        if (strM590 != null) {
            defaultRequestM440.m188("prefix", strM590);
        }
        String strM594 = listObjectsRequest.m594();
        if (strM594 != null) {
            defaultRequestM440.m188("delimiter", strM594);
        }
        String strM593 = listObjectsRequest.m593();
        if (strM593 != null) {
            defaultRequestM440.m188("marker", strM593);
        }
        if (listObjectsRequest.m591() != null && listObjectsRequest.m591().intValue() >= 0) {
            defaultRequestM440.m188("max-keys", listObjectsRequest.m591().toString());
        }
        Unmarshaller unmarshaller = new Unmarshaller(zEquals) { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$ListObjectsUnmarshaller

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final boolean f678;

            {
                this.f678 = zEquals;
            }

            @Override // com.amazonaws.transform.Unmarshaller
            /* JADX INFO: renamed from: ۙ */
            public final Object mo700(InputStream inputStream) {
                return new XmlResponsesSaxParser().m706(inputStream, this.f678).m722();
            }
        };
        return (ObjectListing) m434(defaultRequestM440, new S3XmlResponseHandler(unmarshaller), listObjectsRequest.m592(), (String) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m447(String str, String str2) {
        try {
            GetObjectMetadataRequest getObjectMetadataRequest = new GetObjectMetadataRequest(str, str2);
            String strM560 = getObjectMetadataRequest.m560();
            String strM561 = getObjectMetadataRequest.m561();
            ValidationUtils.m791(strM560, "The bucket name parameter must be specified when requesting an object's metadata");
            ValidationUtils.m791(strM561, "The key parameter must be specified when requesting an object's metadata");
            return true;
        } catch (AmazonS3Exception e) {
            if (e.m143() == 404) {
                return false;
            }
            throw e;
        }
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    /* JADX INFO: renamed from: ۙ */
    public final S3Object mo431(GetObjectRequest getObjectRequest) {
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor;
        ValidationUtils.m791(getObjectRequest.m565(), "The bucket name parameter must be specified when requesting an object");
        ValidationUtils.m791(getObjectRequest.m568(), "The key parameter must be specified when requesting an object");
        DefaultRequest defaultRequestM440 = m440(getObjectRequest.m565(), getObjectRequest.m568(), getObjectRequest, HttpMethodName.GET, null);
        getObjectRequest.m566();
        long[] jArrM562 = getObjectRequest.m562();
        if (jArrM562 != null) {
            String string = "bytes=" + Long.toString(jArrM562[0]) + "-";
            if (jArrM562[1] >= 0) {
                StringBuilder sbM27333 = C10732.m27333(string);
                sbM27333.append(Long.toString(jArrM562[1]));
                string = sbM27333.toString();
            }
            defaultRequestM440.m177("Range", string);
        }
        m437(defaultRequestM440, "If-Match", getObjectRequest.m567());
        m437(defaultRequestM440, "If-None-Match", getObjectRequest.m564());
        ProgressListener progressListenerMo152 = getObjectRequest.mo152();
        if (progressListenerMo152 == null) {
            int i = ProgressListenerCallbackExecutor.f159;
            progressListenerCallbackExecutor = null;
        } else {
            progressListenerCallbackExecutor = new ProgressListenerCallbackExecutor(progressListenerMo152);
        }
        try {
            S3Object s3Object = (S3Object) m434(defaultRequestM440, new S3ObjectResponseHandler(), getObjectRequest.m565(), getObjectRequest.m568());
            s3Object.m646(getObjectRequest.m565());
            s3Object.m648(getObjectRequest.m568());
            FilterInputStream serviceClientHolderInputStream = new ServiceClientHolderInputStream(s3Object.m644());
            if (progressListenerCallbackExecutor != null) {
                ProgressReportingInputStream progressReportingInputStream = new ProgressReportingInputStream(serviceClientHolderInputStream, progressListenerCallbackExecutor);
                progressReportingInputStream.m227();
                progressReportingInputStream.m226(this.f459);
                m438(progressListenerCallbackExecutor, 2);
                serviceClientHolderInputStream = progressReportingInputStream;
            }
            s3Object.m645(new S3ObjectInputStream(new LengthCheckInputStream(serviceClientHolderInputStream, s3Object.m647().m611(), true)));
            return s3Object;
        } catch (AmazonS3Exception e) {
            if (e.m143() == 412 || e.m143() == 304) {
                m438(progressListenerCallbackExecutor, 16);
                return null;
            }
            m438(progressListenerCallbackExecutor, 8);
            throw e;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x022e */
    /* JADX WARN: Code restructure failed: missing block: B:128:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:?, code lost:
    
        throw r0;
     */
    @Override // com.amazonaws.services.s3.AmazonS3
    /* JADX INFO: renamed from: ۙ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazonaws.services.s3.model.PutObjectResult mo430(com.amazonaws.services.s3.model.PutObjectRequest r18) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.s3.AmazonS3Client.mo430(com.amazonaws.services.s3.model.PutObjectRequest):com.amazonaws.services.s3.model.PutObjectResult");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m444(CopyObjectRequest copyObjectRequest) {
        ValidationUtils.m791(copyObjectRequest.m538(), "The source bucket name must be specified when copying an object");
        ValidationUtils.m791(copyObjectRequest.m541(), "The source object key must be specified when copying an object");
        ValidationUtils.m791(copyObjectRequest.m540(), "The destination bucket name must be specified when copying an object");
        ValidationUtils.m791(copyObjectRequest.m543(), "The destination object key must be specified when copying an object");
        String strM543 = copyObjectRequest.m543();
        String strM540 = copyObjectRequest.m540();
        DefaultRequest defaultRequestM440 = m440(strM540, strM543, copyObjectRequest, HttpMethodName.PUT, null);
        defaultRequestM440.m177("x-amz-copy-source", "/" + copyObjectRequest.m538() + "/" + copyObjectRequest.m541());
        m437(defaultRequestM440, "x-amz-copy-source-if-match", copyObjectRequest.m542());
        m437(defaultRequestM440, "x-amz-copy-source-if-none-match", copyObjectRequest.m539());
        defaultRequestM440.m177("Content-Length", String.valueOf(0));
        try {
            XmlResponsesSaxParser.CopyObjectResultHandler copyObjectResultHandler = (XmlResponsesSaxParser.CopyObjectResultHandler) m434(defaultRequestM440, new ResponseHeaderHandlerChain(new Unmarshaller() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$CopyObjectUnmarshaller
                @Override // com.amazonaws.transform.Unmarshaller
                /* JADX INFO: renamed from: ۙ */
                public final Object mo700(InputStream inputStream) throws IOException {
                    XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                    XmlResponsesSaxParser.CopyObjectResultHandler copyObjectResultHandler2 = new XmlResponsesSaxParser.CopyObjectResultHandler();
                    xmlResponsesSaxParser.m707(copyObjectResultHandler2, inputStream);
                    return copyObjectResultHandler2;
                }
            }, new ServerSideEncryptionHeaderHandler(), new S3VersionHeaderHandler(), new ObjectExpirationHeaderHandler(), new S3RequesterChargedHeaderHandler()), strM540, strM543);
            if (copyObjectResultHandler.m712() != null) {
                String strM712 = copyObjectResultHandler.m712();
                String strM713 = copyObjectResultHandler.m713();
                String strM719 = copyObjectResultHandler.m719();
                String strM710 = copyObjectResultHandler.m710();
                AmazonS3Exception amazonS3Exception = new AmazonS3Exception(strM713);
                amazonS3Exception.m138(strM712);
                AmazonServiceException.ErrorType errorType = AmazonServiceException.ErrorType.Client;
                amazonS3Exception.m140(strM719);
                amazonS3Exception.m519(strM710);
                amazonS3Exception.m144(defaultRequestM440.m181());
                amazonS3Exception.m137(200);
                throw amazonS3Exception;
            }
            CopyObjectResult copyObjectResult = new CopyObjectResult();
            copyObjectResult.m548(copyObjectResultHandler.m714());
            copyObjectResult.m550(copyObjectResultHandler.m715());
            copyObjectResult.mo472(copyObjectResultHandler.m718());
            copyObjectResult.mo479(copyObjectResultHandler.m695());
            copyObjectResult.mo478(copyObjectResultHandler.m698());
            copyObjectResult.mo476(copyObjectResultHandler.m697());
            copyObjectResult.mo462(copyObjectResultHandler.m716());
            copyObjectResult.mo463(copyObjectResultHandler.m717());
            copyObjectResult.mo459(copyObjectResultHandler.m711());
        } catch (AmazonS3Exception e) {
            if (e.m143() != 412) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m445(DeleteObjectRequest deleteObjectRequest) {
        ValidationUtils.m791(deleteObjectRequest.m552(), "The bucket name must be specified when deleting an object");
        ValidationUtils.m791(deleteObjectRequest.m553(), "The key must be specified when deleting an object");
        m434(m440(deleteObjectRequest.m552(), deleteObjectRequest.m553(), deleteObjectRequest, HttpMethodName.DELETE, null), this.f457, deleteObjectRequest.m552(), deleteObjectRequest.m553());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m446(DeleteObjectsRequest deleteObjectsRequest) {
        DefaultRequest defaultRequestM440 = m440(deleteObjectsRequest.m556(), null, deleteObjectsRequest, HttpMethodName.POST, null);
        defaultRequestM440.m188("delete", null);
        new MultiObjectDeleteXmlFactory();
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.m483("Delete");
        if (deleteObjectsRequest.m557()) {
            xmlWriter.m483("Quiet");
            xmlWriter.m484("true");
            xmlWriter.m482();
        }
        for (DeleteObjectsRequest.KeyVersion keyVersion : deleteObjectsRequest.m558()) {
            xmlWriter.m483("Object");
            xmlWriter.m483("Key");
            xmlWriter.m484(keyVersion.m559());
            xmlWriter.m482();
            xmlWriter.m482();
        }
        xmlWriter.m482();
        byte[] bArrM485 = xmlWriter.m485();
        defaultRequestM440.m177("Content-Length", String.valueOf(bArrM485.length));
        defaultRequestM440.m177("Content-Type", "application/xml");
        defaultRequestM440.m175(new ByteArrayInputStream(bArrM485));
        try {
            try {
                defaultRequestM440.m177("Content-MD5", Base64.m737(MessageDigest.getInstance("MD5").digest(bArrM485)));
                ResponseHeaderHandlerChain responseHeaderHandlerChain = new ResponseHeaderHandlerChain(new Unmarshaller() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$DeleteObjectsResultUnmarshaller
                    @Override // com.amazonaws.transform.Unmarshaller
                    /* JADX INFO: renamed from: ۙ */
                    public final Object mo700(InputStream inputStream) throws IOException {
                        XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                        XmlResponsesSaxParser.DeleteObjectsHandler deleteObjectsHandler = new XmlResponsesSaxParser.DeleteObjectsHandler();
                        xmlResponsesSaxParser.m707(deleteObjectsHandler, inputStream);
                        return deleteObjectsHandler.m720();
                    }
                }, new S3RequesterChargedHeaderHandler());
                DeleteObjectsResponse deleteObjectsResponse = (DeleteObjectsResponse) m434(defaultRequestM440, responseHeaderHandlerChain, deleteObjectsRequest.m556(), (String) null);
                if (((ArrayList) deleteObjectsResponse.m460()).isEmpty()) {
                    new ArrayList().addAll(deleteObjectsResponse.m458());
                    return;
                }
                Map mapM473 = responseHeaderHandlerChain.m473();
                MultiObjectDeleteException multiObjectDeleteException = new MultiObjectDeleteException(deleteObjectsResponse.m460(), deleteObjectsResponse.m458());
                multiObjectDeleteException.m137(200);
                multiObjectDeleteException.m140((String) mapM473.get("x-amz-request-id"));
                multiObjectDeleteException.m519((String) mapM473.get("x-amz-id-2"));
                throw multiObjectDeleteException;
            } catch (NoSuchAlgorithmException e) {
                throw new IllegalStateException(e);
            }
        } catch (Exception e2) {
            throw new AmazonClientException("Couldn't compute md5 sum", e2);
        }
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    /* JADX INFO: renamed from: ۙ */
    public final void mo433(AbortMultipartUploadRequest abortMultipartUploadRequest) {
        ValidationUtils.m791(abortMultipartUploadRequest.m488(), "The bucket name parameter must be specified when aborting a multipart upload");
        ValidationUtils.m791(abortMultipartUploadRequest.m490(), "The key parameter must be specified when aborting a multipart upload");
        ValidationUtils.m791(abortMultipartUploadRequest.m489(), "The upload ID parameter must be specified when aborting a multipart upload");
        String strM488 = abortMultipartUploadRequest.m488();
        String strM490 = abortMultipartUploadRequest.m490();
        DefaultRequest defaultRequestM440 = m440(strM488, strM490, abortMultipartUploadRequest, HttpMethodName.DELETE, null);
        defaultRequestM440.m188("uploadId", abortMultipartUploadRequest.m489());
        m434(defaultRequestM440, this.f457, strM488, strM490);
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    /* JADX INFO: renamed from: ۙ */
    public final CompleteMultipartUploadResult mo428(CompleteMultipartUploadRequest completeMultipartUploadRequest) {
        String strM535 = completeMultipartUploadRequest.m535();
        String strM537 = completeMultipartUploadRequest.m537();
        String strM534 = completeMultipartUploadRequest.m534();
        ValidationUtils.m791(strM535, "The bucket name parameter must be specified when completing a multipart upload");
        ValidationUtils.m791(strM537, "The key parameter must be specified when completing a multipart upload");
        ValidationUtils.m791(strM534, "The upload ID parameter must be specified when completing a multipart upload");
        ValidationUtils.m791(completeMultipartUploadRequest.m536(), "The part ETags parameter must be specified when completing a multipart upload");
        int i = 0;
        while (true) {
            DefaultRequest defaultRequestM440 = m440(strM535, strM537, completeMultipartUploadRequest, HttpMethodName.POST, null);
            defaultRequestM440.m188("uploadId", strM534);
            byte[] bArrM699 = RequestXmlFactory.m699(completeMultipartUploadRequest.m536());
            defaultRequestM440.m177("Content-Type", "application/xml");
            defaultRequestM440.m177("Content-Length", String.valueOf(bArrM699.length));
            defaultRequestM440.m175(new ByteArrayInputStream(bArrM699));
            XmlResponsesSaxParser.CompleteMultipartUploadHandler completeMultipartUploadHandler = (XmlResponsesSaxParser.CompleteMultipartUploadHandler) m434(defaultRequestM440, new ResponseHeaderHandlerChain(new Unmarshaller() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$CompleteMultipartUploadResultUnmarshaller
                @Override // com.amazonaws.transform.Unmarshaller
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final Object mo700(InputStream inputStream) throws IOException {
                    XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                    XmlResponsesSaxParser.CompleteMultipartUploadHandler completeMultipartUploadHandler2 = new XmlResponsesSaxParser.CompleteMultipartUploadHandler();
                    xmlResponsesSaxParser.m707(completeMultipartUploadHandler2, inputStream);
                    return completeMultipartUploadHandler2;
                }
            }, new ServerSideEncryptionHeaderHandler(), new ObjectExpirationHeaderHandler(), new S3VersionHeaderHandler(), new S3RequesterChargedHeaderHandler()), strM535, strM537);
            if (completeMultipartUploadHandler.m708() != null) {
                return completeMultipartUploadHandler.m708();
            }
            AmazonS3Exception amazonS3ExceptionM709 = completeMultipartUploadHandler.m709();
            int i2 = i + 1;
            RetryPolicy retryPolicyM165 = this.f74.m165();
            if (!((retryPolicyM165 == null || retryPolicyM165.m424() == null || retryPolicyM165 == PredefinedRetryPolicies.f443) ? false : this.f460.mo422(amazonS3ExceptionM709, i))) {
                throw completeMultipartUploadHandler.m709();
            }
            i = i2;
        }
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    /* JADX INFO: renamed from: ۙ */
    public final InitiateMultipartUploadResult mo429(InitiateMultipartUploadRequest initiateMultipartUploadRequest) {
        ValidationUtils.m791(initiateMultipartUploadRequest.m579(), "The bucket name parameter must be specified when initiating a multipart upload");
        ValidationUtils.m791(initiateMultipartUploadRequest.m580(), "The key parameter must be specified when initiating a multipart upload");
        DefaultRequest defaultRequestM440 = m440(initiateMultipartUploadRequest.m579(), initiateMultipartUploadRequest.m580(), initiateMultipartUploadRequest, HttpMethodName.POST, null);
        defaultRequestM440.m188("uploads", null);
        if (initiateMultipartUploadRequest.m581() != null) {
            defaultRequestM440.m177("x-amz-acl", initiateMultipartUploadRequest.m581().toString());
        }
        ObjectMetadata objectMetadata = initiateMultipartUploadRequest.f601;
        if (objectMetadata != null) {
            m436(defaultRequestM440, objectMetadata);
        }
        String strM435 = m435(initiateMultipartUploadRequest.m574());
        if (strM435 != null) {
            defaultRequestM440.m177("x-amz-tagging", strM435);
        }
        SSEAwsKeyManagementParams sSEAwsKeyManagementParamsM578 = initiateMultipartUploadRequest.m578();
        if (sSEAwsKeyManagementParamsM578 != null) {
            String algorithm = SSEAlgorithm.KMS.getAlgorithm();
            if (algorithm != null) {
                defaultRequestM440.m177("x-amz-server-side-encryption", algorithm);
            }
            String strM665 = sSEAwsKeyManagementParamsM578.m665();
            if (strM665 != null) {
                defaultRequestM440.m177("x-amz-server-side-encryption-aws-kms-key-id", strM665);
            }
        }
        defaultRequestM440.m177("Content-Length", String.valueOf(0));
        defaultRequestM440.m175(new ByteArrayInputStream(new byte[0]));
        return (InitiateMultipartUploadResult) m434(defaultRequestM440, new ResponseHeaderHandlerChain(new Unmarshaller() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$InitiateMultipartUploadResultUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            /* JADX INFO: renamed from: ۙ */
            public final Object mo700(InputStream inputStream) throws IOException {
                XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                XmlResponsesSaxParser.InitiateMultipartUploadHandler initiateMultipartUploadHandler = new XmlResponsesSaxParser.InitiateMultipartUploadHandler();
                xmlResponsesSaxParser.m707(initiateMultipartUploadHandler, inputStream);
                return initiateMultipartUploadHandler.m721();
            }
        }, new ServerSideEncryptionHeaderHandler()), initiateMultipartUploadRequest.m579(), initiateMultipartUploadRequest.m580());
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    /* JADX INFO: renamed from: ۙ */
    public final UploadPartResult mo432(UploadPartRequest uploadPartRequest) {
        InputStream inputSubstream;
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor;
        String strM676 = uploadPartRequest.m676();
        String strM668 = uploadPartRequest.m668();
        String strM681 = uploadPartRequest.m681();
        int iM679 = uploadPartRequest.m679();
        long jM685 = uploadPartRequest.m685();
        ValidationUtils.m791(strM676, "The bucket name parameter must be specified when uploading a part");
        ValidationUtils.m791(strM668, "The key parameter must be specified when uploading a part");
        ValidationUtils.m791(strM681, "The upload ID parameter must be specified when uploading a part");
        DefaultRequest defaultRequestM440 = m440(strM676, strM668, uploadPartRequest, HttpMethodName.PUT, null);
        defaultRequestM440.m188("uploadId", strM681);
        defaultRequestM440.m188("partNumber", Integer.toString(iM679));
        defaultRequestM440.m177("Content-Length", Long.toString(jM685));
        if (uploadPartRequest.m675() != null) {
            inputSubstream = uploadPartRequest.m675();
        } else {
            if (uploadPartRequest.m669() == null) {
                throw new IllegalArgumentException("A File or InputStream must be specified when uploading part");
            }
            try {
                inputSubstream = new InputSubstream(new RepeatableFileInputStream(uploadPartRequest.m669()), uploadPartRequest.m682(), jM685);
            } catch (FileNotFoundException e) {
                throw new IllegalArgumentException("The specified file doesn't exist", e);
            }
        }
        if (!ServiceUtils.m481(uploadPartRequest) && inputSubstream.markSupported()) {
            try {
                String strM737 = Base64.m737(Md5Utils.m778(inputSubstream));
                if (strM737 != null) {
                    defaultRequestM440.m177("Content-MD5", strM737);
                }
                inputSubstream.reset();
            } catch (Exception e2) {
                throw new AmazonClientException(C16076.m38224(e2, new StringBuilder("Unable to calculate MD5 hash: ")), e2);
            }
        }
        ProgressListener progressListenerMo152 = uploadPartRequest.mo152();
        if (progressListenerMo152 == null) {
            int i = ProgressListenerCallbackExecutor.f159;
            progressListenerCallbackExecutor = null;
        } else {
            progressListenerCallbackExecutor = new ProgressListenerCallbackExecutor(progressListenerMo152);
        }
        if (progressListenerCallbackExecutor != null) {
            ProgressReportingInputStream progressReportingInputStream = new ProgressReportingInputStream(inputSubstream, progressListenerCallbackExecutor);
            progressReportingInputStream.m226(this.f459);
            m438(progressListenerCallbackExecutor, 1024);
            inputSubstream = progressReportingInputStream;
        }
        try {
            try {
                defaultRequestM440.m175(inputSubstream);
                ObjectMetadata objectMetadata = (ObjectMetadata) m434(defaultRequestM440, new S3MetadataResponseHandler(), strM676, strM668);
                m438(progressListenerCallbackExecutor, 2048);
                UploadPartResult uploadPartResult = new UploadPartResult();
                uploadPartResult.m687(objectMetadata.m629());
                uploadPartResult.m686(iM679);
                uploadPartResult.mo479(objectMetadata.m627());
                uploadPartResult.mo478(objectMetadata.m628());
                uploadPartResult.mo476(objectMetadata.m626());
                objectMetadata.m622();
                if (inputSubstream != null) {
                    try {
                        inputSubstream.close();
                    } catch (Exception unused) {
                    }
                }
                return uploadPartResult;
            } catch (AmazonClientException e3) {
                m438(progressListenerCallbackExecutor, 4096);
                throw e3;
            }
        } catch (Throwable th) {
            if (inputSubstream != null) {
                try {
                    inputSubstream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m438(ProgressListenerCallbackExecutor progressListenerCallbackExecutor, int i) {
        if (progressListenerCallbackExecutor == null) {
            return;
        }
        ProgressEvent progressEvent = new ProgressEvent(0L);
        progressEvent.m221(i);
        progressListenerCallbackExecutor.m225(progressEvent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Signer m441(DefaultRequest defaultRequest, String str, String str2) {
        this.f454.getClass();
        Signer signerM147 = m147(defaultRequest.m187());
        if (this.f74.m170() == null) {
            if ((signerM147 instanceof AWSS3V4Signer) && defaultRequest.m187().getHost().endsWith("s3.amazonaws.com") && this.f456 == null) {
                String str3 = this.f456 == null ? (String) f453.get(str) : this.f456;
                if (str3 != null) {
                    String strM412 = RegionUtils.m417(str3).m412();
                    Protocol protocolM169 = this.f74.m169();
                    if (strM412 == null) {
                        throw new IllegalArgumentException("endpoint cannot be null");
                    }
                    if (!strM412.contains("://")) {
                        strM412 = protocolM169.toString() + "://" + strM412;
                    }
                    try {
                        mo443(defaultRequest, str, str2, new URI(strM412));
                        AWSS3V4Signer aWSS3V4Signer = (AWSS3V4Signer) signerM147;
                        aWSS3V4Signer.setServiceName(m148());
                        aWSS3V4Signer.setRegionName(str3);
                        return aWSS3V4Signer;
                    } catch (URISyntaxException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
            }
            String str4 = this.f456 == null ? (String) f453.get(str) : this.f456;
            if (str4 != null) {
                AWSS3V4Signer aWSS3V4Signer2 = new AWSS3V4Signer();
                aWSS3V4Signer2.setServiceName(m148());
                aWSS3V4Signer2.setRegionName(str4);
                return aWSS3V4Signer2;
            }
        }
        if (!(signerM147 instanceof S3Signer)) {
            return signerM147;
        }
        StringBuilder sb = new StringBuilder("/");
        sb.append(str != null ? str.concat("/") : "");
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        return new S3Signer(defaultRequest.m189().toString(), sb.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m436(DefaultRequest defaultRequest, ObjectMetadata objectMetadata) {
        Map mapM621 = objectMetadata.m621();
        if (mapM621.get("x-amz-server-side-encryption-aws-kms-key-id") != null && !ObjectMetadata.f620.equals(mapM621.get("x-amz-server-side-encryption"))) {
            throw new IllegalArgumentException("If you specify a KMS key id for server side encryption, you must also set the SSEAlgorithm to ObjectMetadata.KMS_SERVER_SIDE_ENCRYPTION");
        }
        for (Map.Entry entry : mapM621.entrySet()) {
            defaultRequest.m177((String) entry.getKey(), entry.getValue().toString());
        }
        Date dateM617 = objectMetadata.m617();
        if (dateM617 != null) {
            defaultRequest.m177("Expires", DateUtils.m761("EEE, dd MMM yyyy HH:mm:ss z", dateM617));
        }
        Map mapM610 = objectMetadata.m610();
        if (mapM610 != null) {
            for (Map.Entry entry2 : mapM610.entrySet()) {
                String strTrim = (String) entry2.getKey();
                String strTrim2 = (String) entry2.getValue();
                if (strTrim != null) {
                    strTrim = strTrim.trim();
                }
                if (strTrim2 != null) {
                    strTrim2 = strTrim2.trim();
                }
                if (!"x-amz-tagging".equals(strTrim)) {
                    defaultRequest.m177("x-amz-meta-" + strTrim, strTrim2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m437(DefaultRequest defaultRequest, String str, ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int i = ServiceUtils.f502;
        Iterator it = arrayList.iterator();
        String strM34972 = "";
        boolean z = true;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!z) {
                strM34972 = C14483.m34972(strM34972, ", ");
            }
            strM34972 = C14483.m34972(strM34972, str2);
            z = false;
        }
        defaultRequest.m177(str, strM34972);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DefaultRequest m440(String str, String str2, AmazonWebServiceRequest amazonWebServiceRequest, HttpMethodName httpMethodName, URI uri) {
        DefaultRequest defaultRequest = new DefaultRequest(amazonWebServiceRequest);
        this.f454.getClass();
        defaultRequest.m173(httpMethodName);
        mo443(defaultRequest, str, str2, uri);
        return defaultRequest;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m434(DefaultRequest defaultRequest, AbstractS3ResponseHandler abstractS3ResponseHandler, String str, String str2) {
        m149(defaultRequest.m186());
        boolean z = false;
        S3ExecutionContext s3ExecutionContext = new S3ExecutionContext(this.f75, System.getProperty("com.amazonaws.sdk.enableRuntimeProfiling") != null);
        AWSRequestMetrics aWSRequestMetricsM248 = s3ExecutionContext.m248();
        defaultRequest.m174(aWSRequestMetricsM248);
        aWSRequestMetricsM248.mo729(AWSRequestMetrics.Field.ClientExecuteTime);
        try {
            try {
                if (!defaultRequest.m182().containsKey("Content-Type")) {
                    defaultRequest.m177("Content-Type", "application/octet-stream");
                }
                if (str != null) {
                    if (defaultRequest.m187().getHost().endsWith("s3.amazonaws.com") && this.f456 == null) {
                        z = true;
                    }
                    if (z) {
                        m439(str);
                    }
                }
                AWSCredentials aWSCredentialsMo202 = this.f455.mo202();
                s3ExecutionContext.m469(m441(defaultRequest, str, str2));
                s3ExecutionContext.m249(aWSCredentialsMo202);
                Object objM192 = this.f70.m246(defaultRequest, abstractS3ResponseHandler, this.f458, s3ExecutionContext).m192();
                m150(aWSRequestMetricsM248, defaultRequest);
                return objM192;
            } catch (AmazonS3Exception e) {
                if (e.m143() == 301 && e.m518() != null) {
                    String str3 = (String) ((HashMap) e.m518()).get("x-amz-bucket-region");
                    f453.put(str, str3);
                    e.m142("The bucket is in this region: " + str3 + ". Please use this region to retry the request");
                }
                throw e;
            }
        } catch (Throwable th) {
            m150(aWSRequestMetricsM248, defaultRequest);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m435(ObjectTagging objectTagging) {
        if (objectTagging == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) objectTagging.m634()).iterator();
        while (it.hasNext()) {
            Tag tag = (Tag) it.next();
            sb.append(S3HttpUtils.m471(tag.m666()));
            sb.append(a.h);
            sb.append(S3HttpUtils.m471(tag.m667()));
            if (it.hasNext()) {
                sb.append(com.alipay.sdk.m.w.a.p);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m439(String str) {
        Map map = f453;
        String strM572 = (String) map.get(str);
        Log log = f452;
        if (strM572 == null) {
            if (log.mo287()) {
                log.mo291("Bucket region cache doesn't have an entry for " + str + ". Trying to get bucket region from Amazon S3.");
            }
            strM572 = null;
            try {
                strM572 = ((HeadBucketResult) m434(m440(str, null, new HeadBucketRequest(), HttpMethodName.HEAD, new URI("https://s3-us-west-1.amazonaws.com")), new HeadBucketResultHandler(), str, (String) null)).m572();
            } catch (AmazonS3Exception e) {
                if (e.m518() != null) {
                    strM572 = (String) ((HashMap) e.m518()).get("x-amz-bucket-region");
                }
            } catch (URISyntaxException unused) {
                log.mo294("Error while creating URI");
            }
            if (strM572 == null && log.mo287()) {
                log.mo291("Not able to derive region of the " + str + " from the HEAD Bucket requests.");
            }
            if (strM572 != null) {
                map.put(str, strM572);
            }
        }
        if (log.mo287()) {
            log.mo291("Region for " + str + " is " + strM572);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo443(DefaultRequest defaultRequest, String str, String str2, URI uri) {
        String str3;
        if (uri == null) {
            uri = this.f71;
        }
        if (this.f454.m449() || !BucketNameUtils.m452(str)) {
            f452.mo291("Using path style addressing. Endpoint = " + uri);
            defaultRequest.m178(uri);
            if (str != null) {
                StringBuilder sbM10405 = C3188.m10405(str, "/");
                if (str2 != null) {
                    str3 = str2;
                } else {
                    str3 = "";
                }
                sbM10405.append(str3);
                defaultRequest.m176(sbM10405.toString());
            }
        } else {
            String host = uri.getHost();
            if (host != null) {
                String[] strArrSplit = host.split("\\.");
                if (strArrSplit.length == 4) {
                    int length = strArrSplit.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            try {
                                int i2 = Integer.parseInt(strArrSplit[i]);
                                if (i2 >= 0 && i2 <= 255) {
                                    i++;
                                }
                            } catch (NumberFormatException unused) {
                            }
                        } else {
                            f452.mo291("Using path style addressing. Endpoint = " + uri);
                            defaultRequest.m178(uri);
                            if (str != null) {
                                StringBuilder sbM10406 = C3188.m10405(str, "/");
                                if (str2 != null) {
                                    str3 = str2;
                                } else {
                                    str3 = "";
                                }
                                sbM10406.append(str3);
                                defaultRequest.m176(sbM10406.toString());
                            }
                        }
                    }
                }
            }
            f452.mo291("Using virtual style addressing. Endpoint = " + uri);
            try {
                defaultRequest.m178(new URI(uri.getScheme() + "://" + str + "." + uri.getAuthority()));
                defaultRequest.m176((str2 == null || !str2.startsWith("/")) ? str2 : "/".concat(str2));
            } catch (URISyntaxException e) {
                throw new IllegalArgumentException(C25272.m56409("Invalid bucket name: ", str), e);
            }
        }
        f452.mo291("Key: " + str2 + "; Request: " + defaultRequest);
    }
}
