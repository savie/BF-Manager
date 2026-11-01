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
import l.C0252;
import l.C0561;
import l.C15489;
import l.C3012;
import l.C8479;
import l.C9023;

/* JADX INFO: loaded from: classes.dex */
public class AmazonS3Client extends AmazonWebServiceClient implements AmazonS3 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static Log f462 = LogFactory.m302(AmazonS3Client.class);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Map f463;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public S3ClientOptions f464;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile String f465;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AWSCredentialsProvider f466;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final S3ErrorResponseHandler f467;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final S3XmlResponseHandler f468;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f469;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final CompleteMultipartUploadRetryCondition f470;

    static {
        AwsSdkMetrics.m317(Arrays.asList(S3ServiceMetric.m492()));
        SignerFactory.m223(AWSS3V4Signer.class, "AWSS3V4SignerType");
        new BucketConfigurationXmlFactory();
        new RequestPaymentConfigurationXmlFactory();
        f463 = C0561.synchronizedMap(new AnonymousClass1(300, 1.1f, true));
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
        this.f467 = new S3ErrorResponseHandler();
        this.f468 = new S3XmlResponseHandler(null);
        this.f464 = new S3ClientOptions();
        this.f469 = 1024;
        this.f470 = new CompleteMultipartUploadRetryCondition();
        this.f466 = aWSCredentialsProvider;
        mo157("s3.amazonaws.com");
        HandlerChainFactory handlerChainFactory = new HandlerChainFactory();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f80;
        copyOnWriteArrayList.addAll(handlerChainFactory.m237());
        copyOnWriteArrayList.addAll(handlerChainFactory.m236());
    }

    @Override // com.amazonaws.AmazonWebServiceClient
    /* JADX INFO: renamed from: ۙ */
    public void mo157(String str) {
        if (str.endsWith("s3-accelerate.amazonaws.com")) {
            throw new IllegalStateException("To enable accelerate mode, please use AmazonS3Client.setS3ClientOptions(S3ClientOptions.builder().setAccelerateModeEnabled(true).build());");
        }
        super.mo157(str);
        if (str.endsWith("s3.amazonaws.com")) {
            return;
        }
        this.f465 = AwsHostNameUtils.m739(this.f83.getHost(), "s3");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ObjectListing m448(ListObjectsRequest listObjectsRequest) {
        ValidationUtils.m797(listObjectsRequest.m596(), "The bucket name parameter must be specified when listing objects in a bucket");
        final boolean zEquals = "url".equals(null);
        DefaultRequest defaultRequestM446 = m446(listObjectsRequest.m596(), null, listObjectsRequest, HttpMethodName.GET, null);
        String strM597 = listObjectsRequest.m597();
        if (strM597 != null) {
            defaultRequestM446.m194("prefix", strM597);
        }
        String strM598 = listObjectsRequest.m598();
        if (strM598 != null) {
            defaultRequestM446.m194("delimiter", strM598);
        }
        String strM600 = listObjectsRequest.m600();
        if (strM600 != null) {
            defaultRequestM446.m194("marker", strM600);
        }
        if (listObjectsRequest.m599() != null && listObjectsRequest.m599().intValue() >= 0) {
            defaultRequestM446.m194("max-keys", listObjectsRequest.m599().toString());
        }
        Unmarshaller unmarshaller = new Unmarshaller(zEquals) { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$ListObjectsUnmarshaller

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final boolean f688;

            {
                this.f688 = zEquals;
            }

            @Override // com.amazonaws.transform.Unmarshaller
            /* JADX INFO: renamed from: ۙ */
            public final Object mo706(InputStream inputStream) {
                return new XmlResponsesSaxParser().m712(inputStream, this.f688).m728();
            }
        };
        return (ObjectListing) m440(defaultRequestM446, new S3XmlResponseHandler(unmarshaller), listObjectsRequest.m596(), (String) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m453(String str, String str2) {
        try {
            GetObjectMetadataRequest getObjectMetadataRequest = new GetObjectMetadataRequest(str, str2);
            String strM566 = getObjectMetadataRequest.m566();
            String strM567 = getObjectMetadataRequest.m567();
            ValidationUtils.m797(strM566, "The bucket name parameter must be specified when requesting an object's metadata");
            ValidationUtils.m797(strM567, "The key parameter must be specified when requesting an object's metadata");
            return true;
        } catch (AmazonS3Exception e) {
            if (e.m142() == 404) {
                return false;
            }
            throw e;
        }
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    /* JADX INFO: renamed from: ۙ */
    public final S3Object mo437(GetObjectRequest getObjectRequest) {
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor;
        ValidationUtils.m797(getObjectRequest.m568(), "The bucket name parameter must be specified when requesting an object");
        ValidationUtils.m797(getObjectRequest.m571(), "The key parameter must be specified when requesting an object");
        DefaultRequest defaultRequestM446 = m446(getObjectRequest.m568(), getObjectRequest.m571(), getObjectRequest, HttpMethodName.GET, null);
        getObjectRequest.m572();
        long[] jArrM569 = getObjectRequest.m569();
        if (jArrM569 != null) {
            String string = "bytes=" + Long.toString(jArrM569[0]) + "-";
            if (jArrM569[1] >= 0) {
                StringBuilder sbM23356 = C9023.m23356(string);
                sbM23356.append(Long.toString(jArrM569[1]));
                string = sbM23356.toString();
            }
            defaultRequestM446.m185("Range", string);
        }
        m443(defaultRequestM446, "If-Match", getObjectRequest.m574());
        m443(defaultRequestM446, "If-None-Match", getObjectRequest.m573());
        ProgressListener progressListenerMo158 = getObjectRequest.mo158();
        if (progressListenerMo158 == null) {
            int i = ProgressListenerCallbackExecutor.f169;
            progressListenerCallbackExecutor = null;
        } else {
            progressListenerCallbackExecutor = new ProgressListenerCallbackExecutor(progressListenerMo158);
        }
        try {
            S3Object s3Object = (S3Object) m440(defaultRequestM446, new S3ObjectResponseHandler(), getObjectRequest.m568(), getObjectRequest.m571());
            s3Object.m652(getObjectRequest.m568());
            s3Object.m654(getObjectRequest.m571());
            FilterInputStream serviceClientHolderInputStream = new ServiceClientHolderInputStream(s3Object.m650());
            if (progressListenerCallbackExecutor != null) {
                ProgressReportingInputStream progressReportingInputStream = new ProgressReportingInputStream(serviceClientHolderInputStream, progressListenerCallbackExecutor);
                progressReportingInputStream.m233();
                progressReportingInputStream.m232(this.f469);
                m444(progressListenerCallbackExecutor, 2);
                serviceClientHolderInputStream = progressReportingInputStream;
            }
            s3Object.m651(new S3ObjectInputStream(new LengthCheckInputStream(serviceClientHolderInputStream, s3Object.m653().m618(), true)));
            return s3Object;
        } catch (AmazonS3Exception e) {
            if (e.m142() == 412 || e.m142() == 304) {
                m444(progressListenerCallbackExecutor, 16);
                return null;
            }
            m444(progressListenerCallbackExecutor, 8);
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
    public final com.amazonaws.services.s3.model.PutObjectResult mo436(com.amazonaws.services.s3.model.PutObjectRequest r18) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.s3.AmazonS3Client.mo436(com.amazonaws.services.s3.model.PutObjectRequest):com.amazonaws.services.s3.model.PutObjectResult");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m450(CopyObjectRequest copyObjectRequest) {
        ValidationUtils.m797(copyObjectRequest.m545(), "The source bucket name must be specified when copying an object");
        ValidationUtils.m797(copyObjectRequest.m547(), "The source object key must be specified when copying an object");
        ValidationUtils.m797(copyObjectRequest.m544(), "The destination bucket name must be specified when copying an object");
        ValidationUtils.m797(copyObjectRequest.m546(), "The destination object key must be specified when copying an object");
        String strM546 = copyObjectRequest.m546();
        String strM544 = copyObjectRequest.m544();
        DefaultRequest defaultRequestM446 = m446(strM544, strM546, copyObjectRequest, HttpMethodName.PUT, null);
        defaultRequestM446.m185("x-amz-copy-source", "/" + copyObjectRequest.m545() + "/" + copyObjectRequest.m547());
        m443(defaultRequestM446, "x-amz-copy-source-if-match", copyObjectRequest.m549());
        m443(defaultRequestM446, "x-amz-copy-source-if-none-match", copyObjectRequest.m548());
        defaultRequestM446.m185("Content-Length", String.valueOf(0));
        try {
            XmlResponsesSaxParser.CopyObjectResultHandler copyObjectResultHandler = (XmlResponsesSaxParser.CopyObjectResultHandler) m440(defaultRequestM446, new ResponseHeaderHandlerChain(new Unmarshaller() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$CopyObjectUnmarshaller
                @Override // com.amazonaws.transform.Unmarshaller
                /* JADX INFO: renamed from: ۙ */
                public final Object mo706(InputStream inputStream) throws IOException {
                    XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                    XmlResponsesSaxParser.CopyObjectResultHandler copyObjectResultHandler2 = new XmlResponsesSaxParser.CopyObjectResultHandler();
                    xmlResponsesSaxParser.m713(copyObjectResultHandler2, inputStream);
                    return copyObjectResultHandler2;
                }
            }, new ServerSideEncryptionHeaderHandler(), new S3VersionHeaderHandler(), new ObjectExpirationHeaderHandler(), new S3RequesterChargedHeaderHandler()), strM544, strM546);
            if (copyObjectResultHandler.m720() != null) {
                String strM720 = copyObjectResultHandler.m720();
                String strM718 = copyObjectResultHandler.m718();
                String strM725 = copyObjectResultHandler.m725();
                String strM717 = copyObjectResultHandler.m717();
                AmazonS3Exception amazonS3Exception = new AmazonS3Exception(strM718);
                amazonS3Exception.m146(strM720);
                AmazonServiceException.ErrorType errorType = AmazonServiceException.ErrorType.Client;
                amazonS3Exception.m148(strM725);
                amazonS3Exception.m525(strM717);
                amazonS3Exception.m143(defaultRequestM446.m192());
                amazonS3Exception.m145(200);
                throw amazonS3Exception;
            }
            CopyObjectResult copyObjectResult = new CopyObjectResult();
            copyObjectResult.m557(copyObjectResultHandler.m716());
            copyObjectResult.m555(copyObjectResultHandler.m722());
            copyObjectResult.mo478(copyObjectResultHandler.m723());
            copyObjectResult.mo480(copyObjectResultHandler.m703());
            copyObjectResult.mo485(copyObjectResultHandler.m701());
            copyObjectResult.mo482(copyObjectResultHandler.m702());
            copyObjectResult.mo468(copyObjectResultHandler.m721());
            copyObjectResult.mo469(copyObjectResultHandler.m724());
            copyObjectResult.mo465(copyObjectResultHandler.m719());
        } catch (AmazonS3Exception e) {
            if (e.m142() != 412) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m451(DeleteObjectRequest deleteObjectRequest) {
        ValidationUtils.m797(deleteObjectRequest.m558(), "The bucket name must be specified when deleting an object");
        ValidationUtils.m797(deleteObjectRequest.m559(), "The key must be specified when deleting an object");
        m440(m446(deleteObjectRequest.m558(), deleteObjectRequest.m559(), deleteObjectRequest, HttpMethodName.DELETE, null), this.f468, deleteObjectRequest.m558(), deleteObjectRequest.m559());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m452(DeleteObjectsRequest deleteObjectsRequest) {
        DefaultRequest defaultRequestM446 = m446(deleteObjectsRequest.m560(), null, deleteObjectsRequest, HttpMethodName.POST, null);
        defaultRequestM446.m194("delete", null);
        new MultiObjectDeleteXmlFactory();
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.m489("Delete");
        if (deleteObjectsRequest.m564()) {
            xmlWriter.m489("Quiet");
            xmlWriter.m490("true");
            xmlWriter.m488();
        }
        for (DeleteObjectsRequest.KeyVersion keyVersion : deleteObjectsRequest.m562()) {
            xmlWriter.m489("Object");
            xmlWriter.m489("Key");
            xmlWriter.m490(keyVersion.m565());
            xmlWriter.m488();
            xmlWriter.m488();
        }
        xmlWriter.m488();
        byte[] bArrM491 = xmlWriter.m491();
        defaultRequestM446.m185("Content-Length", String.valueOf(bArrM491.length));
        defaultRequestM446.m185("Content-Type", "application/xml");
        defaultRequestM446.m183(new ByteArrayInputStream(bArrM491));
        try {
            try {
                defaultRequestM446.m185("Content-MD5", Base64.m743(MessageDigest.getInstance("MD5").digest(bArrM491)));
                ResponseHeaderHandlerChain responseHeaderHandlerChain = new ResponseHeaderHandlerChain(new Unmarshaller() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$DeleteObjectsResultUnmarshaller
                    @Override // com.amazonaws.transform.Unmarshaller
                    /* JADX INFO: renamed from: ۙ */
                    public final Object mo706(InputStream inputStream) throws IOException {
                        XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                        XmlResponsesSaxParser.DeleteObjectsHandler deleteObjectsHandler = new XmlResponsesSaxParser.DeleteObjectsHandler();
                        xmlResponsesSaxParser.m713(deleteObjectsHandler, inputStream);
                        return deleteObjectsHandler.m726();
                    }
                }, new S3RequesterChargedHeaderHandler());
                DeleteObjectsResponse deleteObjectsResponse = (DeleteObjectsResponse) m440(defaultRequestM446, responseHeaderHandlerChain, deleteObjectsRequest.m560(), (String) null);
                if (((ArrayList) deleteObjectsResponse.m466()).isEmpty()) {
                    new ArrayList().addAll(deleteObjectsResponse.m464());
                    return;
                }
                Map mapM479 = responseHeaderHandlerChain.m479();
                MultiObjectDeleteException multiObjectDeleteException = new MultiObjectDeleteException(deleteObjectsResponse.m466(), deleteObjectsResponse.m464());
                multiObjectDeleteException.m145(200);
                multiObjectDeleteException.m148((String) mapM479.get("x-amz-request-id"));
                multiObjectDeleteException.m525((String) mapM479.get("x-amz-id-2"));
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
    public final void mo439(AbortMultipartUploadRequest abortMultipartUploadRequest) {
        ValidationUtils.m797(abortMultipartUploadRequest.m494(), "The bucket name parameter must be specified when aborting a multipart upload");
        ValidationUtils.m797(abortMultipartUploadRequest.m495(), "The key parameter must be specified when aborting a multipart upload");
        ValidationUtils.m797(abortMultipartUploadRequest.m496(), "The upload ID parameter must be specified when aborting a multipart upload");
        String strM494 = abortMultipartUploadRequest.m494();
        String strM495 = abortMultipartUploadRequest.m495();
        DefaultRequest defaultRequestM446 = m446(strM494, strM495, abortMultipartUploadRequest, HttpMethodName.DELETE, null);
        defaultRequestM446.m194("uploadId", abortMultipartUploadRequest.m496());
        m440(defaultRequestM446, this.f468, strM494, strM495);
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    /* JADX INFO: renamed from: ۙ */
    public final CompleteMultipartUploadResult mo434(CompleteMultipartUploadRequest completeMultipartUploadRequest) {
        String strM540 = completeMultipartUploadRequest.m540();
        String strM541 = completeMultipartUploadRequest.m541();
        String strM542 = completeMultipartUploadRequest.m542();
        ValidationUtils.m797(strM540, "The bucket name parameter must be specified when completing a multipart upload");
        ValidationUtils.m797(strM541, "The key parameter must be specified when completing a multipart upload");
        ValidationUtils.m797(strM542, "The upload ID parameter must be specified when completing a multipart upload");
        ValidationUtils.m797(completeMultipartUploadRequest.m543(), "The part ETags parameter must be specified when completing a multipart upload");
        int i = 0;
        while (true) {
            DefaultRequest defaultRequestM446 = m446(strM540, strM541, completeMultipartUploadRequest, HttpMethodName.POST, null);
            defaultRequestM446.m194("uploadId", strM542);
            byte[] bArrM705 = RequestXmlFactory.m705(completeMultipartUploadRequest.m543());
            defaultRequestM446.m185("Content-Type", "application/xml");
            defaultRequestM446.m185("Content-Length", String.valueOf(bArrM705.length));
            defaultRequestM446.m183(new ByteArrayInputStream(bArrM705));
            XmlResponsesSaxParser.CompleteMultipartUploadHandler completeMultipartUploadHandler = (XmlResponsesSaxParser.CompleteMultipartUploadHandler) m440(defaultRequestM446, new ResponseHeaderHandlerChain(new Unmarshaller() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$CompleteMultipartUploadResultUnmarshaller
                @Override // com.amazonaws.transform.Unmarshaller
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final Object mo706(InputStream inputStream) throws IOException {
                    XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                    XmlResponsesSaxParser.CompleteMultipartUploadHandler completeMultipartUploadHandler2 = new XmlResponsesSaxParser.CompleteMultipartUploadHandler();
                    xmlResponsesSaxParser.m713(completeMultipartUploadHandler2, inputStream);
                    return completeMultipartUploadHandler2;
                }
            }, new ServerSideEncryptionHeaderHandler(), new ObjectExpirationHeaderHandler(), new S3VersionHeaderHandler(), new S3RequesterChargedHeaderHandler()), strM540, strM541);
            if (completeMultipartUploadHandler.m715() != null) {
                return completeMultipartUploadHandler.m715();
            }
            AmazonS3Exception amazonS3ExceptionM714 = completeMultipartUploadHandler.m714();
            int i2 = i + 1;
            RetryPolicy retryPolicyM173 = this.f84.m173();
            if (!((retryPolicyM173 == null || retryPolicyM173.m430() == null || retryPolicyM173 == PredefinedRetryPolicies.f450) ? false : this.f470.mo428(amazonS3ExceptionM714, i))) {
                throw completeMultipartUploadHandler.m714();
            }
            i = i2;
        }
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    /* JADX INFO: renamed from: ۙ */
    public final InitiateMultipartUploadResult mo435(InitiateMultipartUploadRequest initiateMultipartUploadRequest) {
        ValidationUtils.m797(initiateMultipartUploadRequest.m580(), "The bucket name parameter must be specified when initiating a multipart upload");
        ValidationUtils.m797(initiateMultipartUploadRequest.m587(), "The key parameter must be specified when initiating a multipart upload");
        DefaultRequest defaultRequestM446 = m446(initiateMultipartUploadRequest.m580(), initiateMultipartUploadRequest.m587(), initiateMultipartUploadRequest, HttpMethodName.POST, null);
        defaultRequestM446.m194("uploads", null);
        if (initiateMultipartUploadRequest.m585() != null) {
            defaultRequestM446.m185("x-amz-acl", initiateMultipartUploadRequest.m585().toString());
        }
        ObjectMetadata objectMetadata = initiateMultipartUploadRequest.f611;
        if (objectMetadata != null) {
            m442(defaultRequestM446, objectMetadata);
        }
        String strM441 = m441(initiateMultipartUploadRequest.m581());
        if (strM441 != null) {
            defaultRequestM446.m185("x-amz-tagging", strM441);
        }
        SSEAwsKeyManagementParams sSEAwsKeyManagementParamsM586 = initiateMultipartUploadRequest.m586();
        if (sSEAwsKeyManagementParamsM586 != null) {
            String algorithm = SSEAlgorithm.KMS.getAlgorithm();
            if (algorithm != null) {
                defaultRequestM446.m185("x-amz-server-side-encryption", algorithm);
            }
            String strM671 = sSEAwsKeyManagementParamsM586.m671();
            if (strM671 != null) {
                defaultRequestM446.m185("x-amz-server-side-encryption-aws-kms-key-id", strM671);
            }
        }
        defaultRequestM446.m185("Content-Length", String.valueOf(0));
        defaultRequestM446.m183(new ByteArrayInputStream(new byte[0]));
        return (InitiateMultipartUploadResult) m440(defaultRequestM446, new ResponseHeaderHandlerChain(new Unmarshaller() { // from class: com.amazonaws.services.s3.model.transform.Unmarshallers$InitiateMultipartUploadResultUnmarshaller
            @Override // com.amazonaws.transform.Unmarshaller
            /* JADX INFO: renamed from: ۙ */
            public final Object mo706(InputStream inputStream) throws IOException {
                XmlResponsesSaxParser xmlResponsesSaxParser = new XmlResponsesSaxParser();
                XmlResponsesSaxParser.InitiateMultipartUploadHandler initiateMultipartUploadHandler = new XmlResponsesSaxParser.InitiateMultipartUploadHandler();
                xmlResponsesSaxParser.m713(initiateMultipartUploadHandler, inputStream);
                return initiateMultipartUploadHandler.m727();
            }
        }, new ServerSideEncryptionHeaderHandler()), initiateMultipartUploadRequest.m580(), initiateMultipartUploadRequest.m587());
    }

    @Override // com.amazonaws.services.s3.AmazonS3
    /* JADX INFO: renamed from: ۙ */
    public final UploadPartResult mo438(UploadPartRequest uploadPartRequest) {
        InputStream inputSubstream;
        ProgressListenerCallbackExecutor progressListenerCallbackExecutor;
        String strM674 = uploadPartRequest.m674();
        String strM675 = uploadPartRequest.m675();
        String strM688 = uploadPartRequest.m688();
        int iM682 = uploadPartRequest.m682();
        long jM691 = uploadPartRequest.m691();
        ValidationUtils.m797(strM674, "The bucket name parameter must be specified when uploading a part");
        ValidationUtils.m797(strM675, "The key parameter must be specified when uploading a part");
        ValidationUtils.m797(strM688, "The upload ID parameter must be specified when uploading a part");
        DefaultRequest defaultRequestM446 = m446(strM674, strM675, uploadPartRequest, HttpMethodName.PUT, null);
        defaultRequestM446.m194("uploadId", strM688);
        defaultRequestM446.m194("partNumber", Integer.toString(iM682));
        defaultRequestM446.m185("Content-Length", Long.toString(jM691));
        if (uploadPartRequest.m685() != null) {
            inputSubstream = uploadPartRequest.m685();
        } else {
            if (uploadPartRequest.m689() == null) {
                throw new IllegalArgumentException("A File or InputStream must be specified when uploading part");
            }
            try {
                inputSubstream = new InputSubstream(new RepeatableFileInputStream(uploadPartRequest.m689()), uploadPartRequest.m681(), jM691);
            } catch (FileNotFoundException e) {
                throw new IllegalArgumentException("The specified file doesn't exist", e);
            }
        }
        if (!ServiceUtils.m487(uploadPartRequest) && inputSubstream.markSupported()) {
            try {
                String strM743 = Base64.m743(Md5Utils.m784(inputSubstream));
                if (strM743 != null) {
                    defaultRequestM446.m185("Content-MD5", strM743);
                }
                inputSubstream.reset();
            } catch (Exception e2) {
                throw new AmazonClientException(C8479.m22142(e2, new StringBuilder("Unable to calculate MD5 hash: ")), e2);
            }
        }
        ProgressListener progressListenerMo158 = uploadPartRequest.mo158();
        if (progressListenerMo158 == null) {
            int i = ProgressListenerCallbackExecutor.f169;
            progressListenerCallbackExecutor = null;
        } else {
            progressListenerCallbackExecutor = new ProgressListenerCallbackExecutor(progressListenerMo158);
        }
        if (progressListenerCallbackExecutor != null) {
            ProgressReportingInputStream progressReportingInputStream = new ProgressReportingInputStream(inputSubstream, progressListenerCallbackExecutor);
            progressReportingInputStream.m232(this.f469);
            m444(progressListenerCallbackExecutor, 1024);
            inputSubstream = progressReportingInputStream;
        }
        try {
            try {
                defaultRequestM446.m183(inputSubstream);
                ObjectMetadata objectMetadata = (ObjectMetadata) m440(defaultRequestM446, new S3MetadataResponseHandler(), strM674, strM675);
                m444(progressListenerCallbackExecutor, 2048);
                UploadPartResult uploadPartResult = new UploadPartResult();
                uploadPartResult.m695(objectMetadata.m624());
                uploadPartResult.m693(iM682);
                uploadPartResult.mo480(objectMetadata.m632());
                uploadPartResult.mo485(objectMetadata.m635());
                uploadPartResult.mo482(objectMetadata.m633());
                objectMetadata.m627();
                if (inputSubstream != null) {
                    try {
                        inputSubstream.close();
                    } catch (Exception unused) {
                    }
                }
                return uploadPartResult;
            } catch (AmazonClientException e3) {
                m444(progressListenerCallbackExecutor, 4096);
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
    public static void m444(ProgressListenerCallbackExecutor progressListenerCallbackExecutor, int i) {
        if (progressListenerCallbackExecutor == null) {
            return;
        }
        ProgressEvent progressEvent = new ProgressEvent(0L);
        progressEvent.m227(i);
        progressListenerCallbackExecutor.m231(progressEvent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Signer m447(DefaultRequest defaultRequest, String str, String str2) {
        this.f464.getClass();
        Signer signerM153 = m153(defaultRequest.m193());
        if (this.f84.m168() == null) {
            if ((signerM153 instanceof AWSS3V4Signer) && defaultRequest.m193().getHost().endsWith("s3.amazonaws.com") && this.f465 == null) {
                String str3 = this.f465 == null ? (String) f463.get(str) : this.f465;
                if (str3 != null) {
                    String strM414 = RegionUtils.m423(str3).m414();
                    Protocol protocolM175 = this.f84.m175();
                    if (strM414 == null) {
                        throw new IllegalArgumentException("endpoint cannot be null");
                    }
                    if (!strM414.contains("://")) {
                        strM414 = protocolM175.toString() + "://" + strM414;
                    }
                    try {
                        mo449(defaultRequest, str, str2, new URI(strM414));
                        AWSS3V4Signer aWSS3V4Signer = (AWSS3V4Signer) signerM153;
                        aWSS3V4Signer.setServiceName(m154());
                        aWSS3V4Signer.setRegionName(str3);
                        return aWSS3V4Signer;
                    } catch (URISyntaxException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
            }
            String str4 = this.f465 == null ? (String) f463.get(str) : this.f465;
            if (str4 != null) {
                AWSS3V4Signer aWSS3V4Signer2 = new AWSS3V4Signer();
                aWSS3V4Signer2.setServiceName(m154());
                aWSS3V4Signer2.setRegionName(str4);
                return aWSS3V4Signer2;
            }
        }
        if (!(signerM153 instanceof S3Signer)) {
            return signerM153;
        }
        StringBuilder sb = new StringBuilder("/");
        sb.append(str != null ? str.concat("/") : "");
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        return new S3Signer(defaultRequest.m178().toString(), sb.toString());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m442(DefaultRequest defaultRequest, ObjectMetadata objectMetadata) {
        Map mapM625 = objectMetadata.m625();
        if (mapM625.get("x-amz-server-side-encryption-aws-kms-key-id") != null && !ObjectMetadata.f630.equals(mapM625.get("x-amz-server-side-encryption"))) {
            throw new IllegalArgumentException("If you specify a KMS key id for server side encryption, you must also set the SSEAlgorithm to ObjectMetadata.KMS_SERVER_SIDE_ENCRYPTION");
        }
        for (Map.Entry entry : mapM625.entrySet()) {
            defaultRequest.m185((String) entry.getKey(), entry.getValue().toString());
        }
        Date dateM630 = objectMetadata.m630();
        if (dateM630 != null) {
            defaultRequest.m185("Expires", DateUtils.m767("EEE, dd MMM yyyy HH:mm:ss z", dateM630));
        }
        Map mapM626 = objectMetadata.m626();
        if (mapM626 != null) {
            for (Map.Entry entry2 : mapM626.entrySet()) {
                String strTrim = (String) entry2.getKey();
                String strTrim2 = (String) entry2.getValue();
                if (strTrim != null) {
                    strTrim = strTrim.trim();
                }
                if (strTrim2 != null) {
                    strTrim2 = strTrim2.trim();
                }
                if (!"x-amz-tagging".equals(strTrim)) {
                    defaultRequest.m185("x-amz-meta-" + strTrim, strTrim2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m443(DefaultRequest defaultRequest, String str, ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int i = ServiceUtils.f512;
        Iterator it = arrayList.iterator();
        String strM37076 = "";
        boolean z = true;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!z) {
                strM37076 = C15489.m37076(strM37076, ", ");
            }
            strM37076 = C15489.m37076(strM37076, str2);
            z = false;
        }
        defaultRequest.m185(str, strM37076);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DefaultRequest m446(String str, String str2, AmazonWebServiceRequest amazonWebServiceRequest, HttpMethodName httpMethodName, URI uri) {
        DefaultRequest defaultRequest = new DefaultRequest(amazonWebServiceRequest);
        this.f464.getClass();
        defaultRequest.m181(httpMethodName);
        mo449(defaultRequest, str, str2, uri);
        return defaultRequest;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m440(DefaultRequest defaultRequest, AbstractS3ResponseHandler abstractS3ResponseHandler, String str, String str2) {
        m155(defaultRequest.m189());
        boolean z = false;
        S3ExecutionContext s3ExecutionContext = new S3ExecutionContext(this.f80, System.getProperty("com.amazonaws.sdk.enableRuntimeProfiling") != null);
        AWSRequestMetrics aWSRequestMetricsM254 = s3ExecutionContext.m254();
        defaultRequest.m182(aWSRequestMetricsM254);
        aWSRequestMetricsM254.mo735(AWSRequestMetrics.Field.ClientExecuteTime);
        try {
            try {
                if (!defaultRequest.m191().containsKey("Content-Type")) {
                    defaultRequest.m185("Content-Type", "application/octet-stream");
                }
                if (str != null) {
                    if (defaultRequest.m193().getHost().endsWith("s3.amazonaws.com") && this.f465 == null) {
                        z = true;
                    }
                    if (z) {
                        m445(str);
                    }
                }
                AWSCredentials aWSCredentialsMo208 = this.f466.mo208();
                s3ExecutionContext.m476(m447(defaultRequest, str, str2));
                s3ExecutionContext.m255(aWSCredentialsMo208);
                Object objM198 = this.f81.m252(defaultRequest, abstractS3ResponseHandler, this.f467, s3ExecutionContext).m198();
                m156(aWSRequestMetricsM254, defaultRequest);
                return objM198;
            } catch (AmazonS3Exception e) {
                if (e.m142() == 301 && e.m524() != null) {
                    String str3 = (String) ((HashMap) e.m524()).get("x-amz-bucket-region");
                    f463.put(str, str3);
                    e.m150("The bucket is in this region: " + str3 + ". Please use this region to retry the request");
                }
                throw e;
            }
        } catch (Throwable th) {
            m156(aWSRequestMetricsM254, defaultRequest);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m441(ObjectTagging objectTagging) {
        if (objectTagging == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) objectTagging.m640()).iterator();
        while (it.hasNext()) {
            Tag tag = (Tag) it.next();
            sb.append(S3HttpUtils.m477(tag.m672()));
            sb.append(a.h);
            sb.append(S3HttpUtils.m477(tag.m673()));
            if (it.hasNext()) {
                sb.append(com.alipay.sdk.m.w.a.p);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m445(String str) {
        Map map = f463;
        String strM578 = (String) map.get(str);
        Log log = f462;
        if (strM578 == null) {
            if (log.mo294()) {
                log.mo298("Bucket region cache doesn't have an entry for " + str + ". Trying to get bucket region from Amazon S3.");
            }
            strM578 = null;
            try {
                strM578 = ((HeadBucketResult) m440(m446(str, null, new HeadBucketRequest(), HttpMethodName.HEAD, new URI("https://s3-us-west-1.amazonaws.com")), new HeadBucketResultHandler(), str, (String) null)).m578();
            } catch (AmazonS3Exception e) {
                if (e.m524() != null) {
                    strM578 = (String) ((HashMap) e.m524()).get("x-amz-bucket-region");
                }
            } catch (URISyntaxException unused) {
                log.mo291("Error while creating URI");
            }
            if (strM578 == null && log.mo294()) {
                log.mo298("Not able to derive region of the " + str + " from the HEAD Bucket requests.");
            }
            if (strM578 != null) {
                map.put(str, strM578);
            }
        }
        if (log.mo294()) {
            log.mo298("Region for " + str + " is " + strM578);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo449(DefaultRequest defaultRequest, String str, String str2, URI uri) {
        String str3;
        if (uri == null) {
            uri = this.f83;
        }
        if (this.f464.m455() || !BucketNameUtils.m458(str)) {
            f462.mo298("Using path style addressing. Endpoint = " + uri);
            defaultRequest.m186(uri);
            if (str != null) {
                StringBuilder sbM8976 = C3012.m8976(str, "/");
                if (str2 != null) {
                    str3 = str2;
                } else {
                    str3 = "";
                }
                sbM8976.append(str3);
                defaultRequest.m184(sbM8976.toString());
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
                            f462.mo298("Using path style addressing. Endpoint = " + uri);
                            defaultRequest.m186(uri);
                            if (str != null) {
                                StringBuilder sbM8977 = C3012.m8976(str, "/");
                                if (str2 != null) {
                                    str3 = str2;
                                } else {
                                    str3 = "";
                                }
                                sbM8977.append(str3);
                                defaultRequest.m184(sbM8977.toString());
                            }
                        }
                    }
                }
            }
            f462.mo298("Using virtual style addressing. Endpoint = " + uri);
            try {
                defaultRequest.m186(new URI(uri.getScheme() + "://" + str + "." + uri.getAuthority()));
                defaultRequest.m184((str2 == null || !str2.startsWith("/")) ? str2 : "/".concat(str2));
            } catch (URISyntaxException e) {
                throw new IllegalArgumentException(C0252.m1693("Invalid bucket name: ", str), e);
            }
        }
        f462.mo298("Key: " + str2 + "; Request: " + defaultRequest);
    }
}
