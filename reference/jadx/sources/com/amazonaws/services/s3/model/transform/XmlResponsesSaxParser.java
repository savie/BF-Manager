package com.amazonaws.services.s3.model.transform;

import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.w.a;
import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.internal.DeleteObjectsResponse;
import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.S3HttpUtils;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.S3VersionResult;
import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.model.AbortIncompleteMultipartUpload;
import com.amazonaws.services.s3.model.AccessControlList;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.BucketAccelerateConfiguration;
import com.amazonaws.services.s3.model.BucketCrossOriginConfiguration;
import com.amazonaws.services.s3.model.BucketLifecycleConfiguration;
import com.amazonaws.services.s3.model.BucketLoggingConfiguration;
import com.amazonaws.services.s3.model.BucketReplicationConfiguration;
import com.amazonaws.services.s3.model.BucketTaggingConfiguration;
import com.amazonaws.services.s3.model.BucketVersioningConfiguration;
import com.amazonaws.services.s3.model.BucketWebsiteConfiguration;
import com.amazonaws.services.s3.model.CORSRule;
import com.amazonaws.services.s3.model.CanonicalGrantee;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyObjectResult;
import com.amazonaws.services.s3.model.DeleteObjectsResult;
import com.amazonaws.services.s3.model.EmailAddressGrantee;
import com.amazonaws.services.s3.model.GetBucketInventoryConfigurationResult;
import com.amazonaws.services.s3.model.Grant;
import com.amazonaws.services.s3.model.Grantee;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ListBucketAnalyticsConfigurationsResult;
import com.amazonaws.services.s3.model.ListBucketInventoryConfigurationsResult;
import com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsResult;
import com.amazonaws.services.s3.model.MultiObjectDeleteException;
import com.amazonaws.services.s3.model.MultipartUpload;
import com.amazonaws.services.s3.model.MultipartUploadListing;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.Owner;
import com.amazonaws.services.s3.model.PartListing;
import com.amazonaws.services.s3.model.PartSummary;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.RedirectRule;
import com.amazonaws.services.s3.model.ReplicationDestinationConfig;
import com.amazonaws.services.s3.model.ReplicationRule;
import com.amazonaws.services.s3.model.RoutingRule;
import com.amazonaws.services.s3.model.RoutingRuleCondition;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.amazonaws.services.s3.model.S3VersionSummary;
import com.amazonaws.services.s3.model.Tag;
import com.amazonaws.services.s3.model.TagSet;
import com.amazonaws.services.s3.model.analytics.AnalyticsAndOperator;
import com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration;
import com.amazonaws.services.s3.model.analytics.AnalyticsExportDestination;
import com.amazonaws.services.s3.model.analytics.AnalyticsFilter;
import com.amazonaws.services.s3.model.analytics.AnalyticsPrefixPredicate;
import com.amazonaws.services.s3.model.analytics.AnalyticsS3BucketDestination;
import com.amazonaws.services.s3.model.analytics.AnalyticsTagPredicate;
import com.amazonaws.services.s3.model.analytics.StorageClassAnalysis;
import com.amazonaws.services.s3.model.analytics.StorageClassAnalysisDataExport;
import com.amazonaws.services.s3.model.inventory.InventoryConfiguration;
import com.amazonaws.services.s3.model.inventory.InventoryDestination;
import com.amazonaws.services.s3.model.inventory.InventoryFilter;
import com.amazonaws.services.s3.model.inventory.InventoryPrefixPredicate;
import com.amazonaws.services.s3.model.inventory.InventoryS3BucketDestination;
import com.amazonaws.services.s3.model.inventory.InventorySchedule;
import com.amazonaws.services.s3.model.lifecycle.LifecycleAndOperator;
import com.amazonaws.services.s3.model.lifecycle.LifecycleFilter;
import com.amazonaws.services.s3.model.lifecycle.LifecyclePrefixPredicate;
import com.amazonaws.services.s3.model.lifecycle.LifecycleTagPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsAndOperator;
import com.amazonaws.services.s3.model.metrics.MetricsConfiguration;
import com.amazonaws.services.s3.model.metrics.MetricsFilter;
import com.amazonaws.services.s3.model.metrics.MetricsPrefixPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsTagPredicate;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import l.AbstractC0329;
import l.C10902;
import l.C24966;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

/* JADX INFO: loaded from: classes.dex */
public class XmlResponsesSaxParser {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Log f679 = LogFactory.m296(XmlResponsesSaxParser.class);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f680 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public XMLReader f681;

    public XmlResponsesSaxParser() {
        this.f681 = null;
        try {
            this.f681 = XMLReaderFactory.createXMLReader();
        } catch (SAXException e) {
            System.setProperty("org.xml.sax.driver", "org.xmlpull.v1.sax2.Driver");
            try {
                this.f681 = XMLReaderFactory.createXMLReader();
            } catch (SAXException unused) {
                throw new AmazonClientException("Couldn't initialize a sax driver for the XMLReader", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m707(DefaultHandler defaultHandler, InputStream inputStream) throws IOException {
        XMLReader xMLReader = this.f681;
        Log log = f679;
        try {
            if (log.mo287()) {
                log.mo291("Parsing XML response document with handler: " + defaultHandler.getClass());
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, a.D));
            xMLReader.setContentHandler(defaultHandler);
            xMLReader.setErrorHandler(defaultHandler);
            xMLReader.parse(new InputSource(bufferedReader));
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                if (log.mo293()) {
                    log.mo292("Unable to close response InputStream up after XML parse failure", e2);
                }
            }
            throw new AmazonClientException("Failed to parse XML document with handler " + defaultHandler.getClass(), th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m702(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m705(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            f679.mo292("Unable to parse integer value '" + str + "'", e);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static long m704(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e) {
            f679.mo292("Unable to parse long value '" + str + "'", e);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m703(String str, boolean z) {
        if (!z) {
            return str;
        }
        int i = S3HttpUtils.f490;
        if (str == null) {
            return null;
        }
        try {
            return C10902.decode(str, a.D);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ListBucketHandler m706(InputStream inputStream, boolean z) throws IOException {
        ListBucketHandler listBucketHandler = new ListBucketHandler(z);
        Log log = f679;
        if (log.mo287()) {
            log.mo291("Sanitizing XML document destined for handler " + ListBucketHandler.class);
        }
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, a.D));
            char[] cArr = new char[8192];
            while (true) {
                int i = bufferedReader.read(cArr);
                if (i == -1) {
                    bufferedReader.close();
                    m707(listBucketHandler, new ByteArrayInputStream(sb.toString().replaceAll("\r", "&#013;").getBytes(StringUtils.f834)));
                    return listBucketHandler;
                }
                sb.append(cArr, 0, i);
            }
        } catch (IOException e) {
            throw e;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                if (log.mo293()) {
                    log.mo292("Unable to close response InputStream after failure sanitizing XML document", e2);
                }
            }
            throw new AmazonClientException(C24966.m55772(ListBucketHandler.class, "Failed to sanitize XML document destined for handler "), th);
        }
    }

    public class ListBucketHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
        public final boolean f760;

        /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
        public final ObjectListing f758 = new ObjectListing();

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public S3ObjectSummary f759 = null;

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public Owner f757 = null;

        public ListBucketHandler(boolean z) {
            this.f760 = z;
        }

        /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
        public final ObjectListing m722() {
            return this.f758;
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (m692("ListBucketResult")) {
                if (str.equals("Contents")) {
                    S3ObjectSummary s3ObjectSummary = new S3ObjectSummary();
                    this.f759 = s3ObjectSummary;
                    s3ObjectSummary.m656(this.f758.m600());
                    return;
                }
                return;
            }
            if (m692("ListBucketResult", "Contents") && str.equals("Owner")) {
                this.f757 = new Owner();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            boolean zM691 = m691();
            String strM653 = null;
            ObjectListing objectListing = this.f758;
            if (zM691) {
                if (str.equals("ListBucketResult") && objectListing.m604() && objectListing.m603() == null) {
                    if (!objectListing.m607().isEmpty()) {
                        strM653 = ((S3ObjectSummary) objectListing.m607().get(objectListing.m607().size() - 1)).m653();
                    } else if (objectListing.m605().isEmpty()) {
                        XmlResponsesSaxParser.f679.mo285("S3 response indicates truncated results, but contains no object summaries or common prefixes.");
                    } else {
                        strM653 = (String) objectListing.m605().get(objectListing.m605().size() - 1);
                    }
                    objectListing.m606(strM653);
                    return;
                }
                return;
            }
            boolean zM692 = m692("ListBucketResult");
            boolean z = this.f760;
            if (zM692) {
                if (str.equals("Name")) {
                    objectListing.m601(m694());
                    if (XmlResponsesSaxParser.f679.mo287()) {
                        XmlResponsesSaxParser.f679.mo291("Examining listing for bucket: " + objectListing.m600());
                        return;
                    }
                    return;
                }
                if (str.equals("Prefix")) {
                    XmlResponsesSaxParser.m703(XmlResponsesSaxParser.m702(m694()), z);
                    objectListing.getClass();
                    return;
                }
                if (str.equals("Marker")) {
                    XmlResponsesSaxParser.m703(XmlResponsesSaxParser.m702(m694()), z);
                    objectListing.getClass();
                    return;
                }
                if (str.equals("NextMarker")) {
                    objectListing.m606(XmlResponsesSaxParser.m703(m694(), z));
                    return;
                }
                if (str.equals("MaxKeys")) {
                    XmlResponsesSaxParser.m705(m694());
                    objectListing.getClass();
                    return;
                }
                if (str.equals("Delimiter")) {
                    XmlResponsesSaxParser.m703(XmlResponsesSaxParser.m702(m694()), z);
                    objectListing.getClass();
                    return;
                }
                if (str.equals("EncodingType")) {
                    m694();
                    int i = XmlResponsesSaxParser.f680;
                    objectListing.getClass();
                    return;
                } else {
                    if (str.equals("IsTruncated")) {
                        String strM783 = StringUtils.m783(m694());
                        if (strM783.startsWith("false")) {
                            objectListing.m602(false);
                            return;
                        } else {
                            if (strM783.startsWith("true")) {
                                objectListing.m602(true);
                                return;
                            }
                            throw new IllegalStateException("Invalid value for IsTruncated field: ".concat(strM783));
                        }
                    }
                    if (str.equals("Contents")) {
                        objectListing.m607().add(this.f759);
                        this.f759 = null;
                        return;
                    }
                    return;
                }
            }
            if (m692("ListBucketResult", "Contents")) {
                if (str.equals("Key")) {
                    this.f759.m659(XmlResponsesSaxParser.m703(m694(), z));
                    return;
                }
                if (str.equals("LastModified")) {
                    S3ObjectSummary s3ObjectSummary = this.f759;
                    String strM694 = m694();
                    int i2 = ServiceUtils.f502;
                    s3ObjectSummary.m657(DateUtils.m766(strM694));
                    return;
                }
                if (str.equals("ETag")) {
                    this.f759.m661(ServiceUtils.m480(m694()));
                    return;
                }
                if (str.equals("Size")) {
                    this.f759.m654(XmlResponsesSaxParser.m704(m694()));
                    return;
                }
                if (str.equals("StorageClass")) {
                    this.f759.m662(m694());
                    return;
                } else {
                    if (str.equals("Owner")) {
                        this.f759.m655(this.f757);
                        this.f757 = null;
                        return;
                    }
                    return;
                }
            }
            if (m692("ListBucketResult", "Contents", "Owner")) {
                if (str.equals("ID")) {
                    this.f757.m636(m694());
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        this.f757.m635(m694());
                        return;
                    }
                    return;
                }
            }
            if (m692("ListBucketResult", "CommonPrefixes") && str.equals("Prefix")) {
                objectListing.m605().add(XmlResponsesSaxParser.m703(m694(), z));
            }
        }
    }

    public class ListObjectsV2Handler extends AbstractHandler {

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public Owner f775;

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public S3ObjectSummary f776;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (m692("ListBucketResult")) {
                if (str.equals("Contents")) {
                    this.f776 = new S3ObjectSummary();
                    throw null;
                }
            } else if (m692("ListBucketResult", "Contents") && str.equals("Owner")) {
                this.f775 = new Owner();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m691()) {
                if (str.equals("ListBucketResult")) {
                    throw null;
                }
                return;
            }
            if (m692("ListBucketResult")) {
                if (str.equals("Name")) {
                    m694();
                    throw null;
                }
                if (str.equals("Prefix")) {
                    m694();
                    int i = XmlResponsesSaxParser.f680;
                    throw null;
                }
                if (str.equals("MaxKeys")) {
                    XmlResponsesSaxParser.m705(m694());
                    throw null;
                }
                if (str.equals("NextContinuationToken")) {
                    m694();
                    throw null;
                }
                if (str.equals("ContinuationToken")) {
                    m694();
                    throw null;
                }
                if (str.equals("StartAfter")) {
                    m694();
                    int i2 = XmlResponsesSaxParser.f680;
                    throw null;
                }
                if (str.equals("KeyCount")) {
                    XmlResponsesSaxParser.m705(m694());
                    throw null;
                }
                if (str.equals("Delimiter")) {
                    m694();
                    int i3 = XmlResponsesSaxParser.f680;
                    throw null;
                }
                if (str.equals("EncodingType")) {
                    m694();
                    int i4 = XmlResponsesSaxParser.f680;
                    throw null;
                }
                if (str.equals("IsTruncated")) {
                    String strM783 = StringUtils.m783(m694());
                    if (strM783.startsWith("false") || strM783.startsWith("true")) {
                        throw null;
                    }
                    throw new IllegalStateException("Invalid value for IsTruncated field: ".concat(strM783));
                }
                if (str.equals("Contents")) {
                    throw null;
                }
                return;
            }
            if (m692("ListBucketResult", "Contents")) {
                if (str.equals("Key")) {
                    String strM694 = m694();
                    S3ObjectSummary s3ObjectSummary = this.f776;
                    int i5 = XmlResponsesSaxParser.f680;
                    s3ObjectSummary.m659(strM694);
                    return;
                }
                if (str.equals("LastModified")) {
                    S3ObjectSummary s3ObjectSummary2 = this.f776;
                    String strM695 = m694();
                    int i6 = ServiceUtils.f502;
                    s3ObjectSummary2.m657(DateUtils.m766(strM695));
                    return;
                }
                if (str.equals("ETag")) {
                    this.f776.m661(ServiceUtils.m480(m694()));
                    return;
                }
                if (str.equals("Size")) {
                    this.f776.m654(XmlResponsesSaxParser.m704(m694()));
                    return;
                }
                if (str.equals("StorageClass")) {
                    this.f776.m662(m694());
                    return;
                } else {
                    if (str.equals("Owner")) {
                        this.f776.m655(this.f775);
                        this.f775 = null;
                        return;
                    }
                    return;
                }
            }
            if (m692("ListBucketResult", "Contents", "Owner")) {
                if (str.equals("ID")) {
                    this.f775.m636(m694());
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        this.f775.m635(m694());
                        return;
                    }
                    return;
                }
            }
            if (m692("ListBucketResult", "CommonPrefixes") && str.equals("Prefix")) {
                throw null;
            }
        }
    }

    public class ListAllMyBucketsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public final ArrayList f748 = new ArrayList();

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public Owner f746 = null;

        /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
        public Bucket f747 = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (m692("ListAllMyBucketsResult")) {
                if (str.equals("Owner")) {
                    this.f746 = new Owner();
                }
            } else if (m692("ListAllMyBucketsResult", "Buckets") && str.equals("Bucket")) {
                Bucket bucket = new Bucket();
                this.f747 = bucket;
                bucket.m520(this.f746);
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m692("ListAllMyBucketsResult", "Owner")) {
                if (str.equals("ID")) {
                    this.f746.m636(m694());
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        this.f746.m635(m694());
                        return;
                    }
                    return;
                }
            }
            if (m692("ListAllMyBucketsResult", "Buckets")) {
                if (str.equals("Bucket")) {
                    this.f748.add(this.f747);
                    this.f747 = null;
                    return;
                }
                return;
            }
            if (m692("ListAllMyBucketsResult", "Buckets", "Bucket")) {
                if (str.equals("Name")) {
                    this.f747.m521(m694());
                } else if (str.equals("CreationDate")) {
                    this.f747.m522(DateUtils.m766(m694()));
                }
            }
        }
    }

    public class AccessControlListHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public final AccessControlList f684 = new AccessControlList();

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public Grantee f682 = null;

        /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
        public Permission f683 = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            String value;
            if (m692("AccessControlPolicy")) {
                if (str.equals("Owner")) {
                    this.f684.m515(new Owner());
                    return;
                }
                return;
            }
            if (m692("AccessControlPolicy", "AccessControlList", "Grant") && str.equals("Grantee")) {
                int i = XmlResponsesSaxParser.f680;
                Charset charset = StringUtils.f834;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 < 8) {
                        if (Character.isWhitespace("xsi:type".charAt(i3))) {
                            i3++;
                        } else {
                            if (attributes == null) {
                                break;
                            }
                            while (true) {
                                if (i2 < attributes.getLength()) {
                                    if (attributes.getQName(i2).trim().equalsIgnoreCase("xsi:type")) {
                                        value = attributes.getValue(i2);
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                    }
                    value = null;
                    break;
                }
                if ("AmazonCustomerByEmail".equals(value)) {
                    this.f682 = new EmailAddressGrantee();
                } else if ("CanonicalUser".equals(value)) {
                    this.f682 = new CanonicalGrantee();
                } else {
                    "Group".equals(value);
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            boolean zM692 = m692("AccessControlPolicy", "Owner");
            AccessControlList accessControlList = this.f684;
            if (zM692) {
                if (str.equals("ID")) {
                    accessControlList.m516().m636(m694());
                    return;
                } else {
                    if (str.equals("DisplayName")) {
                        accessControlList.m516().m635(m694());
                        return;
                    }
                    return;
                }
            }
            if (m692("AccessControlPolicy", "AccessControlList")) {
                if (str.equals("Grant")) {
                    Grantee grantee = this.f682;
                    Permission permission = this.f683;
                    ((LinkedList) accessControlList.m514()).add(new Grant(grantee, permission));
                    this.f682 = null;
                    this.f683 = null;
                    return;
                }
                return;
            }
            if (m692("AccessControlPolicy", "AccessControlList", "Grant")) {
                if (str.equals("Permission")) {
                    this.f683 = Permission.m640(m694());
                    return;
                }
                return;
            }
            if (m692("AccessControlPolicy", "AccessControlList", "Grant", "Grantee")) {
                if (str.equals("ID")) {
                    this.f682.mo533(m694());
                    return;
                }
                if (str.equals("EmailAddress")) {
                    this.f682.mo533(m694());
                    return;
                }
                if (str.equals("URI")) {
                    this.f682 = GroupGrantee.m569(m694());
                } else if (str.equals("DisplayName")) {
                    CanonicalGrantee canonicalGrantee = (CanonicalGrantee) this.f682;
                    m694();
                    canonicalGrantee.getClass();
                }
            }
        }
    }

    public class BucketLoggingConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public final BucketLoggingConfiguration f699 = new BucketLoggingConfiguration();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m692("BucketLoggingStatus", "LoggingEnabled")) {
                boolean zEquals = str.equals("TargetBucket");
                BucketLoggingConfiguration bucketLoggingConfiguration = this.f699;
                if (zEquals) {
                    bucketLoggingConfiguration.m527(m694());
                } else if (str.equals("TargetPrefix")) {
                    bucketLoggingConfiguration.m528(m694());
                }
            }
        }
    }

    public class BucketLocationHandler extends AbstractHandler {
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m691() && str.equals("LocationConstraint")) {
                m694().getClass();
            }
        }
    }

    public class CopyObjectResultHandler extends AbstractSSEHandler implements ObjectExpirationResult, S3RequesterChargedResult, S3VersionResult {

        /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
        public final CopyObjectResult f720 = new CopyObjectResult();

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public String f721 = null;

        /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
        public String f719 = null;

        /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
        public String f722 = null;

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public String f718 = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractSSEHandler
        /* JADX INFO: renamed from: ܳ */
        public final ServerSideEncryptionResult mo696() {
            return this.f720;
        }

        /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
        public final Date m715() {
            return this.f720.m546();
        }

        /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
        public final String m718() {
            return this.f720.m545();
        }

        @Override // com.amazonaws.services.s3.internal.S3VersionResult
        /* JADX INFO: renamed from: ۙ */
        public final void mo472(String str) {
            this.f720.mo472(str);
        }

        /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
        public final Date m716() {
            return this.f720.m549();
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        /* JADX INFO: renamed from: ۙ */
        public final void mo462(Date date) {
            this.f720.mo462(date);
        }

        /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
        public final String m717() {
            return this.f720.m547();
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        /* JADX INFO: renamed from: ۤ */
        public final void mo463(String str) {
            this.f720.mo463(str);
        }

        /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
        public final String m714() {
            return this.f720.m551();
        }

        /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
        public final String m712() {
            return this.f721;
        }

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final String m710() {
            return this.f718;
        }

        /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
        public final String m713() {
            return this.f719;
        }

        /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
        public final String m719() {
            return this.f722;
        }

        /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
        public final boolean m711() {
            return this.f720.m544();
        }

        @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
        /* JADX INFO: renamed from: ۙ */
        public final void mo459(boolean z) {
            this.f720.mo459(z);
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (!m691() || str.equals("CopyObjectResult") || str.equals("CopyPartResult")) {
                return;
            }
            str.equals("Error");
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m692("CopyObjectResult") || m692("CopyPartResult")) {
                boolean zEquals = str.equals("LastModified");
                CopyObjectResult copyObjectResult = this.f720;
                if (zEquals) {
                    String strM694 = m694();
                    int i = ServiceUtils.f502;
                    copyObjectResult.m550(DateUtils.m766(strM694));
                    return;
                } else {
                    if (str.equals("ETag")) {
                        copyObjectResult.m548(ServiceUtils.m480(m694()));
                        return;
                    }
                    return;
                }
            }
            if (m692("Error")) {
                if (str.equals("Code")) {
                    this.f721 = m694();
                    return;
                }
                if (str.equals("Message")) {
                    this.f719 = m694();
                } else if (str.equals("RequestId")) {
                    this.f722 = m694();
                } else if (str.equals("HostId")) {
                    this.f718 = m694();
                }
            }
        }
    }

    public class RequestPaymentConfigurationHandler extends AbstractHandler {
        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m692("RequestPaymentConfiguration") && str.equals("Payer")) {
                m694();
            }
        }
    }

    public class ListVersionsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public Owner f780;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (m692("ListVersionsResult")) {
                if (str.equals(e.g)) {
                    new S3VersionSummary();
                    throw null;
                }
                if (str.equals("DeleteMarker")) {
                    new S3VersionSummary();
                    throw null;
                }
                return;
            }
            if ((m692("ListVersionsResult", e.g) || m692("ListVersionsResult", "DeleteMarker")) && str.equals("Owner")) {
                this.f780 = new Owner();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m692("ListVersionsResult")) {
                if (str.equals("Name")) {
                    m694();
                    throw null;
                }
                if (str.equals("Prefix")) {
                    m694();
                    int i = XmlResponsesSaxParser.f680;
                    throw null;
                }
                if (str.equals("KeyMarker")) {
                    m694();
                    int i2 = XmlResponsesSaxParser.f680;
                    throw null;
                }
                if (str.equals("VersionIdMarker")) {
                    m694();
                    int i3 = XmlResponsesSaxParser.f680;
                    throw null;
                }
                if (str.equals("MaxKeys")) {
                    Integer.parseInt(m694());
                    throw null;
                }
                if (str.equals("Delimiter")) {
                    m694();
                    int i4 = XmlResponsesSaxParser.f680;
                    throw null;
                }
                if (str.equals("EncodingType")) {
                    m694();
                    int i5 = XmlResponsesSaxParser.f680;
                    throw null;
                }
                if (str.equals("NextKeyMarker")) {
                    m694();
                    int i6 = XmlResponsesSaxParser.f680;
                    throw null;
                }
                if (str.equals("NextVersionIdMarker")) {
                    m694();
                    throw null;
                }
                if (str.equals("IsTruncated")) {
                    "true".equals(m694());
                    throw null;
                }
                if (str.equals(e.g) || str.equals("DeleteMarker")) {
                    throw null;
                }
                return;
            }
            if (m692("ListVersionsResult", "CommonPrefixes")) {
                if (str.equals("Prefix")) {
                    m694();
                    int i7 = XmlResponsesSaxParser.f680;
                    throw null;
                }
                return;
            }
            if (m692("ListVersionsResult", e.g) || m692("ListVersionsResult", "DeleteMarker")) {
                if (str.equals("Key")) {
                    m694();
                    int i8 = XmlResponsesSaxParser.f680;
                    return;
                }
                if (str.equals("VersionId")) {
                    m694();
                    return;
                }
                if (str.equals("IsLatest")) {
                    "true".equals(m694());
                    return;
                }
                if (str.equals("LastModified")) {
                    String strM694 = m694();
                    int i9 = ServiceUtils.f502;
                    DateUtils.m766(strM694);
                    return;
                } else {
                    if (str.equals("ETag")) {
                        ServiceUtils.m480(m694());
                        return;
                    }
                    if (str.equals("Size")) {
                        Long.parseLong(m694());
                        return;
                    } else if (str.equals("Owner")) {
                        this.f780 = null;
                        return;
                    } else {
                        if (str.equals("StorageClass")) {
                            m694();
                            return;
                        }
                        return;
                    }
                }
            }
            if (m692("ListVersionsResult", e.g, "Owner") || m692("ListVersionsResult", "DeleteMarker", "Owner")) {
                if (str.equals("ID")) {
                    this.f780.m636(m694());
                } else if (str.equals("DisplayName")) {
                    this.f780.m635(m694());
                }
            }
        }
    }

    public class BucketWebsiteConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public final BucketWebsiteConfiguration f711 = new BucketWebsiteConfiguration();

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public RoutingRuleCondition f709 = null;

        /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
        public RedirectRule f710 = null;

        /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
        public RoutingRule f712 = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (m692("WebsiteConfiguration")) {
                if (str.equals("RedirectAllRequestsTo")) {
                    this.f710 = new RedirectRule();
                }
            } else if (m692("WebsiteConfiguration", "RoutingRules")) {
                if (str.equals("RoutingRule")) {
                    this.f712 = new RoutingRule();
                }
            } else if (m692("WebsiteConfiguration", "RoutingRules", "RoutingRule")) {
                if (str.equals("Condition")) {
                    this.f709 = new RoutingRuleCondition();
                } else if (str.equals("Redirect")) {
                    this.f710 = new RedirectRule();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            boolean zM692 = m692("WebsiteConfiguration");
            BucketWebsiteConfiguration bucketWebsiteConfiguration = this.f711;
            if (zM692) {
                if (str.equals("RedirectAllRequestsTo")) {
                    bucketWebsiteConfiguration.getClass();
                    this.f710 = null;
                    return;
                }
                return;
            }
            if (m692("WebsiteConfiguration", "IndexDocument")) {
                if (str.equals("Suffix")) {
                    m694();
                    bucketWebsiteConfiguration.getClass();
                    return;
                }
                return;
            }
            if (m692("WebsiteConfiguration", "ErrorDocument")) {
                if (str.equals("Key")) {
                    m694();
                    bucketWebsiteConfiguration.getClass();
                    return;
                }
                return;
            }
            if (m692("WebsiteConfiguration", "RoutingRules")) {
                if (str.equals("RoutingRule")) {
                    bucketWebsiteConfiguration.m531().add(this.f712);
                    this.f712 = null;
                    return;
                }
                return;
            }
            if (m692("WebsiteConfiguration", "RoutingRules", "RoutingRule")) {
                if (str.equals("Condition")) {
                    this.f712.getClass();
                    this.f709 = null;
                    return;
                } else {
                    if (str.equals("Redirect")) {
                        this.f712.getClass();
                        this.f710 = null;
                        return;
                    }
                    return;
                }
            }
            if (m692("WebsiteConfiguration", "RoutingRules", "RoutingRule", "Condition")) {
                if (str.equals("KeyPrefixEquals")) {
                    RoutingRuleCondition routingRuleCondition = this.f709;
                    m694();
                    routingRuleCondition.getClass();
                    return;
                } else {
                    if (str.equals("HttpErrorCodeReturnedEquals")) {
                        RoutingRuleCondition routingRuleCondition2 = this.f709;
                        m694();
                        routingRuleCondition2.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m692("WebsiteConfiguration", "RedirectAllRequestsTo") || m692("WebsiteConfiguration", "RoutingRules", "RoutingRule", "Redirect")) {
                if (str.equals("Protocol")) {
                    RedirectRule redirectRule = this.f710;
                    m694();
                    redirectRule.getClass();
                    return;
                }
                if (str.equals("HostName")) {
                    RedirectRule redirectRule2 = this.f710;
                    m694();
                    redirectRule2.getClass();
                    return;
                }
                if (str.equals("ReplaceKeyPrefixWith")) {
                    RedirectRule redirectRule3 = this.f710;
                    m694();
                    redirectRule3.getClass();
                } else if (str.equals("ReplaceKeyWith")) {
                    RedirectRule redirectRule4 = this.f710;
                    m694();
                    redirectRule4.getClass();
                } else if (str.equals("HttpRedirectCode")) {
                    RedirectRule redirectRule5 = this.f710;
                    m694();
                    redirectRule5.getClass();
                }
            }
        }
    }

    public class BucketVersioningConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public final BucketVersioningConfiguration f708 = new BucketVersioningConfiguration();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m692("VersioningConfiguration")) {
                boolean zEquals = str.equals("Status");
                BucketVersioningConfiguration bucketVersioningConfiguration = this.f708;
                if (zEquals) {
                    m694();
                    bucketVersioningConfiguration.getClass();
                } else if (str.equals("MfaDelete")) {
                    String strM694 = m694();
                    if (strM694.equals("Disabled")) {
                        bucketVersioningConfiguration.getClass();
                    } else if (strM694.equals("Enabled")) {
                        bucketVersioningConfiguration.getClass();
                    } else {
                        bucketVersioningConfiguration.getClass();
                    }
                }
            }
        }
    }

    public class BucketAccelerateConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public final BucketAccelerateConfiguration f685 = new BucketAccelerateConfiguration();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m692("AccelerateConfiguration") && str.equals("Status")) {
                m694();
                this.f685.getClass();
            }
        }
    }

    public class CompleteMultipartUploadHandler extends AbstractSSEHandler implements ObjectExpirationResult, S3VersionResult, S3RequesterChargedResult {

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public String f713;

        /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
        public String f714;

        /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
        public CompleteMultipartUploadResult f715;

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public AmazonS3Exception f716;

        /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
        public String f717;

        @Override // com.amazonaws.services.s3.model.transform.AbstractSSEHandler
        /* JADX INFO: renamed from: ܳ */
        public final ServerSideEncryptionResult mo696() {
            return this.f715;
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        /* JADX INFO: renamed from: ۙ */
        public final void mo462(Date date) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f715;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
        /* JADX INFO: renamed from: ۤ */
        public final void mo463(String str) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f715;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.internal.S3VersionResult
        /* JADX INFO: renamed from: ۙ */
        public final void mo472(String str) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f715;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.getClass();
            }
        }

        @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
        /* JADX INFO: renamed from: ۙ */
        public final void mo459(boolean z) {
            CompleteMultipartUploadResult completeMultipartUploadResult = this.f715;
            if (completeMultipartUploadResult != null) {
                completeMultipartUploadResult.getClass();
            }
        }

        /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
        public final CompleteMultipartUploadResult m708() {
            return this.f715;
        }

        /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
        public final AmazonS3Exception m709() {
            return this.f716;
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (m691() && str.equals("CompleteMultipartUploadResult")) {
                this.f715 = new CompleteMultipartUploadResult();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            AmazonS3Exception amazonS3Exception;
            if (m691()) {
                if (!str.equals("Error") || (amazonS3Exception = this.f716) == null) {
                    return;
                }
                amazonS3Exception.m138(this.f713);
                this.f716.m140(this.f717);
                this.f716.m519(this.f714);
                return;
            }
            if (m692("CompleteMultipartUploadResult")) {
                if (str.equals("Location")) {
                    CompleteMultipartUploadResult completeMultipartUploadResult = this.f715;
                    m694();
                    completeMultipartUploadResult.getClass();
                    return;
                }
                if (str.equals("Bucket")) {
                    CompleteMultipartUploadResult completeMultipartUploadResult2 = this.f715;
                    m694();
                    completeMultipartUploadResult2.getClass();
                    return;
                } else if (str.equals("Key")) {
                    CompleteMultipartUploadResult completeMultipartUploadResult3 = this.f715;
                    m694();
                    completeMultipartUploadResult3.getClass();
                    return;
                } else {
                    if (str.equals("ETag")) {
                        CompleteMultipartUploadResult completeMultipartUploadResult4 = this.f715;
                        ServiceUtils.m480(m694());
                        completeMultipartUploadResult4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m692("Error")) {
                if (str.equals("Code")) {
                    this.f713 = m694();
                    return;
                }
                if (str.equals("Message")) {
                    this.f716 = new AmazonS3Exception(m694());
                } else if (str.equals("RequestId")) {
                    this.f717 = m694();
                } else if (str.equals("HostId")) {
                    this.f714 = m694();
                }
            }
        }
    }

    public class InitiateMultipartUploadHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public final InitiateMultipartUploadResult f745 = new InitiateMultipartUploadResult();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
        }

        /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
        public final InitiateMultipartUploadResult m721() {
            return this.f745;
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m692("InitiateMultipartUploadResult")) {
                boolean zEquals = str.equals("Bucket");
                InitiateMultipartUploadResult initiateMultipartUploadResult = this.f745;
                if (zEquals) {
                    m694();
                    initiateMultipartUploadResult.getClass();
                } else if (str.equals("Key")) {
                    m694();
                    initiateMultipartUploadResult.getClass();
                } else if (str.equals("UploadId")) {
                    initiateMultipartUploadResult.m582(m694());
                }
            }
        }
    }

    public class ListMultipartUploadsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public Owner f772;

        /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
        public final MultipartUploadListing f773 = new MultipartUploadListing();

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public MultipartUpload f774;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (m692("ListMultipartUploadsResult")) {
                if (str.equals("Upload")) {
                    this.f774 = new MultipartUpload();
                }
            } else if (m692("ListMultipartUploadsResult", "Upload")) {
                if (str.equals("Owner") || str.equals("Initiator")) {
                    this.f772 = new Owner();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            boolean zM692 = m692("ListMultipartUploadsResult");
            MultipartUploadListing multipartUploadListing = this.f773;
            if (zM692) {
                if (str.equals("Bucket")) {
                    m694();
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("KeyMarker")) {
                    m694();
                    int i = XmlResponsesSaxParser.f680;
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("Delimiter")) {
                    m694();
                    int i2 = XmlResponsesSaxParser.f680;
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("Prefix")) {
                    m694();
                    int i3 = XmlResponsesSaxParser.f680;
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("UploadIdMarker")) {
                    m694();
                    int i4 = XmlResponsesSaxParser.f680;
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("NextKeyMarker")) {
                    m694();
                    int i5 = XmlResponsesSaxParser.f680;
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("NextUploadIdMarker")) {
                    m694();
                    int i6 = XmlResponsesSaxParser.f680;
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("MaxUploads")) {
                    Integer.parseInt(m694());
                    multipartUploadListing.getClass();
                    return;
                }
                if (str.equals("EncodingType")) {
                    m694();
                    int i7 = XmlResponsesSaxParser.f680;
                    multipartUploadListing.getClass();
                    return;
                } else if (str.equals("IsTruncated")) {
                    Boolean.parseBoolean(m694());
                    multipartUploadListing.getClass();
                    return;
                } else {
                    if (str.equals("Upload")) {
                        ((ArrayList) multipartUploadListing.m599()).add(this.f774);
                        this.f774 = null;
                        return;
                    }
                    return;
                }
            }
            if (m692("ListMultipartUploadsResult", "CommonPrefixes")) {
                if (str.equals("Prefix")) {
                    multipartUploadListing.m598().add(m694());
                    return;
                }
                return;
            }
            if (m692("ListMultipartUploadsResult", "Upload")) {
                if (str.equals("Key")) {
                    MultipartUpload multipartUpload = this.f774;
                    m694();
                    multipartUpload.getClass();
                    return;
                }
                if (str.equals("UploadId")) {
                    MultipartUpload multipartUpload2 = this.f774;
                    m694();
                    multipartUpload2.getClass();
                    return;
                }
                if (str.equals("Owner")) {
                    this.f774.getClass();
                    this.f772 = null;
                    return;
                }
                if (str.equals("Initiator")) {
                    this.f774.getClass();
                    this.f772 = null;
                    return;
                }
                if (str.equals("StorageClass")) {
                    MultipartUpload multipartUpload3 = this.f774;
                    m694();
                    multipartUpload3.getClass();
                    return;
                } else {
                    if (str.equals("Initiated")) {
                        MultipartUpload multipartUpload4 = this.f774;
                        String strM694 = m694();
                        int i8 = ServiceUtils.f502;
                        DateUtils.m766(strM694);
                        multipartUpload4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m692("ListMultipartUploadsResult", "Upload", "Owner") || m692("ListMultipartUploadsResult", "Upload", "Initiator")) {
                if (str.equals("ID")) {
                    this.f772.m636(XmlResponsesSaxParser.m702(m694()));
                } else if (str.equals("DisplayName")) {
                    this.f772.m635(XmlResponsesSaxParser.m702(m694()));
                }
            }
        }
    }

    public class ListPartsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public PartSummary f777;

        /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
        public final PartListing f778 = new PartListing();

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public Owner f779;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (m692("ListPartsResult")) {
                if (str.equals("Part")) {
                    this.f777 = new PartSummary();
                } else if (str.equals("Owner") || str.equals("Initiator")) {
                    this.f779 = new Owner();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m692("ListPartsResult")) {
                boolean zEquals = str.equals("Bucket");
                PartListing partListing = this.f778;
                if (zEquals) {
                    m694();
                    partListing.getClass();
                    return;
                }
                if (str.equals("Key")) {
                    m694();
                    partListing.getClass();
                    return;
                }
                if (str.equals("UploadId")) {
                    m694();
                    partListing.getClass();
                    return;
                }
                if (str.equals("Owner")) {
                    partListing.getClass();
                    this.f779 = null;
                    return;
                }
                if (str.equals("Initiator")) {
                    partListing.getClass();
                    this.f779 = null;
                    return;
                }
                if (str.equals("StorageClass")) {
                    m694();
                    partListing.getClass();
                    return;
                }
                if (str.equals("PartNumberMarker")) {
                    m694();
                    String strM702 = XmlResponsesSaxParser.m702(m694());
                    (strM702 != null ? Integer.valueOf(Integer.parseInt(strM702)) : null).getClass();
                    partListing.getClass();
                    return;
                }
                if (str.equals("NextPartNumberMarker")) {
                    m694();
                    String strM703 = XmlResponsesSaxParser.m702(m694());
                    (strM703 != null ? Integer.valueOf(Integer.parseInt(strM703)) : null).getClass();
                    partListing.getClass();
                    return;
                }
                if (str.equals("MaxParts")) {
                    m694();
                    String strM704 = XmlResponsesSaxParser.m702(m694());
                    (strM704 != null ? Integer.valueOf(Integer.parseInt(strM704)) : null).getClass();
                    partListing.getClass();
                    return;
                }
                if (str.equals("EncodingType")) {
                    m694();
                    int i = XmlResponsesSaxParser.f680;
                    partListing.getClass();
                    return;
                } else if (str.equals("IsTruncated")) {
                    Boolean.parseBoolean(m694());
                    partListing.getClass();
                    return;
                } else {
                    if (str.equals("Part")) {
                        ((ArrayList) partListing.m639()).add(this.f777);
                        this.f777 = null;
                        return;
                    }
                    return;
                }
            }
            if (m692("ListPartsResult", "Part")) {
                if (str.equals("PartNumber")) {
                    PartSummary partSummary = this.f777;
                    Integer.parseInt(m694());
                    partSummary.getClass();
                    return;
                }
                if (str.equals("LastModified")) {
                    PartSummary partSummary2 = this.f777;
                    String strM694 = m694();
                    int i2 = ServiceUtils.f502;
                    DateUtils.m766(strM694);
                    partSummary2.getClass();
                    return;
                }
                if (str.equals("ETag")) {
                    PartSummary partSummary3 = this.f777;
                    ServiceUtils.m480(m694());
                    partSummary3.getClass();
                    return;
                } else {
                    if (str.equals("Size")) {
                        PartSummary partSummary4 = this.f777;
                        Long.parseLong(m694());
                        partSummary4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m692("ListPartsResult", "Owner") || m692("ListPartsResult", "Initiator")) {
                if (str.equals("ID")) {
                    this.f779.m636(XmlResponsesSaxParser.m702(m694()));
                } else if (str.equals("DisplayName")) {
                    this.f779.m635(XmlResponsesSaxParser.m702(m694()));
                }
            }
        }
    }

    public class BucketReplicationConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public ReplicationRule f700;

        /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
        public String f701;

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public final BucketReplicationConfiguration f702 = new BucketReplicationConfiguration();

        /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
        public ReplicationDestinationConfig f703;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (m692("ReplicationConfiguration")) {
                if (str.equals("Rule")) {
                    this.f700 = new ReplicationRule();
                }
            } else if (m692("ReplicationConfiguration", "Rule") && str.equals("Destination")) {
                this.f703 = new ReplicationDestinationConfig();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m692("ReplicationConfiguration")) {
                boolean zEquals = str.equals("Rule");
                BucketReplicationConfiguration bucketReplicationConfiguration = this.f702;
                if (zEquals) {
                    bucketReplicationConfiguration.m529(this.f701, this.f700);
                    this.f700 = null;
                    this.f701 = null;
                    this.f703 = null;
                    return;
                }
                if (str.equals("Role")) {
                    m694();
                    bucketReplicationConfiguration.getClass();
                    return;
                }
                return;
            }
            if (m692("ReplicationConfiguration", "Rule")) {
                if (str.equals("ID")) {
                    this.f701 = m694();
                    return;
                }
                if (str.equals("Prefix")) {
                    ReplicationRule replicationRule = this.f700;
                    String strM694 = m694();
                    replicationRule.getClass();
                    if (strM694 == null) {
                        throw new IllegalArgumentException("Prefix cannot be null for a replication rule");
                    }
                    return;
                }
                if (str.equals("Status")) {
                    ReplicationRule replicationRule2 = this.f700;
                    m694();
                    replicationRule2.getClass();
                    return;
                } else {
                    if (str.equals("Destination")) {
                        ReplicationRule replicationRule3 = this.f700;
                        ReplicationDestinationConfig replicationDestinationConfig = this.f703;
                        replicationRule3.getClass();
                        if (replicationDestinationConfig == null) {
                            throw new IllegalArgumentException("Destination cannot be null in the replication rule");
                        }
                        return;
                    }
                    return;
                }
            }
            if (m692("ReplicationConfiguration", "Rule", "Destination")) {
                if (str.equals("Bucket")) {
                    ReplicationDestinationConfig replicationDestinationConfig2 = this.f703;
                    String strM695 = m694();
                    replicationDestinationConfig2.getClass();
                    if (strM695 == null) {
                        throw new IllegalArgumentException("Bucket name cannot be null");
                    }
                    return;
                }
                if (str.equals("StorageClass")) {
                    ReplicationDestinationConfig replicationDestinationConfig3 = this.f703;
                    m694();
                    replicationDestinationConfig3.getClass();
                }
            }
        }
    }

    public class BucketTaggingConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public String f704;

        /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
        public HashMap f705;

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public final BucketTaggingConfiguration f706 = new BucketTaggingConfiguration();

        /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
        public String f707;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (m692("Tagging") && str.equals("TagSet")) {
                this.f705 = new HashMap();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            String str2;
            if (m692("Tagging")) {
                if (str.equals("TagSet")) {
                    this.f706.m530().add(new TagSet(this.f705));
                    this.f705 = null;
                    return;
                }
                return;
            }
            if (m692("Tagging", "TagSet")) {
                if (str.equals("Tag")) {
                    String str3 = this.f704;
                    if (str3 != null && (str2 = this.f707) != null) {
                        this.f705.put(str3, str2);
                    }
                    this.f704 = null;
                    this.f707 = null;
                    return;
                }
                return;
            }
            if (m692("Tagging", "TagSet", "Tag")) {
                if (str.equals("Key")) {
                    this.f704 = m694();
                } else if (str.equals("Value")) {
                    this.f707 = m694();
                }
            }
        }
    }

    public class GetObjectTaggingHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public String f742;

        /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
        public ArrayList f743;

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public String f744;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (m692("Tagging") && str.equals("TagSet")) {
                this.f743 = new ArrayList();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m692("Tagging") && str.equals("TagSet")) {
                this.f743 = null;
            }
            if (m692("Tagging", "TagSet")) {
                if (str.equals("Tag")) {
                    this.f743.add(new Tag(this.f744, this.f742));
                    this.f744 = null;
                    this.f742 = null;
                    return;
                }
                return;
            }
            if (m692("Tagging", "TagSet", "Tag")) {
                if (str.equals("Key")) {
                    this.f744 = m694();
                } else if (str.equals("Value")) {
                    this.f742 = m694();
                }
            }
        }
    }

    public class DeleteObjectsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
        public final DeleteObjectsResponse f724 = new DeleteObjectsResponse();

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public DeleteObjectsResult.DeletedObject f725 = null;

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public MultiObjectDeleteException.DeleteError f723 = null;

        /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
        public final DeleteObjectsResponse m720() {
            return this.f724;
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (m692("DeleteResult")) {
                if (str.equals("Deleted")) {
                    this.f725 = new DeleteObjectsResult.DeletedObject();
                } else if (str.equals("Error")) {
                    this.f723 = new MultiObjectDeleteException.DeleteError();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m692("DeleteResult")) {
                boolean zEquals = str.equals("Deleted");
                DeleteObjectsResponse deleteObjectsResponse = this.f724;
                if (zEquals) {
                    ((ArrayList) deleteObjectsResponse.m458()).add(this.f725);
                    this.f725 = null;
                    return;
                }
                if (str.equals("Error")) {
                    ((ArrayList) deleteObjectsResponse.m460()).add(this.f723);
                    this.f723 = null;
                    return;
                }
                return;
            }
            if (m692("DeleteResult", "Deleted")) {
                if (str.equals("Key")) {
                    DeleteObjectsResult.DeletedObject deletedObject = this.f725;
                    m694();
                    deletedObject.getClass();
                    return;
                }
                if (str.equals("VersionId")) {
                    DeleteObjectsResult.DeletedObject deletedObject2 = this.f725;
                    m694();
                    deletedObject2.getClass();
                    return;
                } else if (str.equals("DeleteMarker")) {
                    DeleteObjectsResult.DeletedObject deletedObject3 = this.f725;
                    m694().equals("true");
                    deletedObject3.getClass();
                    return;
                } else {
                    if (str.equals("DeleteMarkerVersionId")) {
                        DeleteObjectsResult.DeletedObject deletedObject4 = this.f725;
                        m694();
                        deletedObject4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m692("DeleteResult", "Error")) {
                if (str.equals("Key")) {
                    this.f723.m597(m694());
                    return;
                }
                if (str.equals("VersionId")) {
                    MultiObjectDeleteException.DeleteError deleteError = this.f723;
                    m694();
                    deleteError.getClass();
                } else if (str.equals("Code")) {
                    MultiObjectDeleteException.DeleteError deleteError2 = this.f723;
                    m694();
                    deleteError2.getClass();
                } else if (str.equals("Message")) {
                    MultiObjectDeleteException.DeleteError deleteError3 = this.f723;
                    m694();
                    deleteError3.getClass();
                }
            }
        }
    }

    public class BucketLifecycleConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public ArrayList f692;

        /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
        public BucketLifecycleConfiguration.Rule f693;

        /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
        public final BucketLifecycleConfiguration f694 = new BucketLifecycleConfiguration(new ArrayList());

        /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
        public BucketLifecycleConfiguration.Transition f695;

        /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
        public BucketLifecycleConfiguration.NoncurrentVersionTransition f696;

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public AbortIncompleteMultipartUpload f697;

        /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
        public LifecycleFilter f698;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (m692("LifecycleConfiguration")) {
                if (str.equals("Rule")) {
                    this.f693 = new BucketLifecycleConfiguration.Rule();
                    return;
                }
                return;
            }
            if (m692("LifecycleConfiguration", "Rule")) {
                if (str.equals(AbstractC0329.LOG_TAG)) {
                    this.f695 = new BucketLifecycleConfiguration.Transition();
                    return;
                }
                if (str.equals("NoncurrentVersionTransition")) {
                    this.f696 = new BucketLifecycleConfiguration.NoncurrentVersionTransition();
                    return;
                } else if (str.equals("AbortIncompleteMultipartUpload")) {
                    this.f697 = new AbortIncompleteMultipartUpload();
                    return;
                } else {
                    if (str.equals("Filter")) {
                        this.f698 = new LifecycleFilter();
                        return;
                    }
                    return;
                }
            }
            if (m692("LifecycleConfiguration", "Rule", "Filter") && str.equals("And")) {
                this.f692 = new ArrayList();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m692("LifecycleConfiguration")) {
                if (str.equals("Rule")) {
                    ((ArrayList) this.f694.m524()).add(this.f693);
                    this.f693 = null;
                    return;
                }
                return;
            }
            if (m692("LifecycleConfiguration", "Rule")) {
                if (str.equals("ID")) {
                    BucketLifecycleConfiguration.Rule rule = this.f693;
                    m694();
                    rule.getClass();
                    return;
                }
                if (str.equals("Prefix")) {
                    BucketLifecycleConfiguration.Rule rule2 = this.f693;
                    m694();
                    rule2.getClass();
                    return;
                }
                if (str.equals("Status")) {
                    BucketLifecycleConfiguration.Rule rule3 = this.f693;
                    m694();
                    rule3.getClass();
                    return;
                }
                if (str.equals(AbstractC0329.LOG_TAG)) {
                    this.f693.m526(this.f695);
                    this.f695 = null;
                    return;
                }
                if (str.equals("NoncurrentVersionTransition")) {
                    this.f693.m525(this.f696);
                    this.f696 = null;
                    return;
                } else if (str.equals("AbortIncompleteMultipartUpload")) {
                    this.f693.getClass();
                    this.f697 = null;
                    return;
                } else {
                    if (str.equals("Filter")) {
                        this.f693.getClass();
                        this.f698 = null;
                        return;
                    }
                    return;
                }
            }
            if (m692("LifecycleConfiguration", "Rule", "Expiration")) {
                if (str.equals("Date")) {
                    BucketLifecycleConfiguration.Rule rule4 = this.f693;
                    String strM694 = m694();
                    int i = ServiceUtils.f502;
                    DateUtils.m766(strM694);
                    rule4.getClass();
                    return;
                }
                if (str.equals("Days")) {
                    BucketLifecycleConfiguration.Rule rule5 = this.f693;
                    Integer.parseInt(m694());
                    rule5.getClass();
                    return;
                } else {
                    if (str.equals("ExpiredObjectDeleteMarker") && "true".equals(m694())) {
                        this.f693.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m692("LifecycleConfiguration", "Rule", AbstractC0329.LOG_TAG)) {
                if (str.equals("StorageClass")) {
                    BucketLifecycleConfiguration.Transition transition = this.f695;
                    m694();
                    transition.getClass();
                    return;
                } else {
                    if (str.equals("Date")) {
                        BucketLifecycleConfiguration.Transition transition2 = this.f695;
                        String strM695 = m694();
                        int i2 = ServiceUtils.f502;
                        DateUtils.m766(strM695);
                        transition2.getClass();
                        return;
                    }
                    if (str.equals("Days")) {
                        BucketLifecycleConfiguration.Transition transition3 = this.f695;
                        Integer.parseInt(m694());
                        transition3.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m692("LifecycleConfiguration", "Rule", "NoncurrentVersionExpiration")) {
                if (str.equals("NoncurrentDays")) {
                    BucketLifecycleConfiguration.Rule rule6 = this.f693;
                    Integer.parseInt(m694());
                    rule6.getClass();
                    return;
                }
                return;
            }
            if (m692("LifecycleConfiguration", "Rule", "NoncurrentVersionTransition")) {
                if (str.equals("StorageClass")) {
                    BucketLifecycleConfiguration.NoncurrentVersionTransition noncurrentVersionTransition = this.f696;
                    m694();
                    noncurrentVersionTransition.getClass();
                    return;
                } else {
                    if (str.equals("NoncurrentDays")) {
                        BucketLifecycleConfiguration.NoncurrentVersionTransition noncurrentVersionTransition2 = this.f696;
                        Integer.parseInt(m694());
                        noncurrentVersionTransition2.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m692("LifecycleConfiguration", "Rule", "AbortIncompleteMultipartUpload")) {
                if (str.equals("DaysAfterInitiation")) {
                    this.f697.m487(Integer.parseInt(m694()));
                    return;
                }
                return;
            }
            if (m692("LifecycleConfiguration", "Rule", "Filter")) {
                if (str.equals("Prefix")) {
                    LifecycleFilter lifecycleFilter = this.f698;
                    m694();
                    new LifecyclePrefixPredicate();
                    lifecycleFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    LifecycleFilter lifecycleFilter2 = this.f698;
                    new LifecycleTagPredicate();
                    lifecycleFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        LifecycleFilter lifecycleFilter3 = this.f698;
                        new LifecycleAndOperator(this.f692);
                        lifecycleFilter3.getClass();
                        this.f692 = null;
                        return;
                    }
                    return;
                }
            }
            if (m692("LifecycleConfiguration", "Rule", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    m694();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m694();
                        return;
                    }
                    return;
                }
            }
            if (m692("LifecycleConfiguration", "Rule", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f692;
                    m694();
                    arrayList.add(new LifecyclePrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f692.add(new LifecycleTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (m692("LifecycleConfiguration", "Rule", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    m694();
                } else if (str.equals("Value")) {
                    m694();
                }
            }
        }
    }

    public class BucketCrossOriginConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
        public CORSRule f689;

        /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
        public final BucketCrossOriginConfiguration f691 = new BucketCrossOriginConfiguration(new ArrayList());

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public ArrayList f686 = null;

        /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
        public ArrayList f688 = null;

        /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
        public ArrayList f687 = null;

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public LinkedList f690 = null;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (m692("CORSConfiguration")) {
                if (str.equals("CORSRule")) {
                    this.f689 = new CORSRule();
                    return;
                }
                return;
            }
            if (m692("CORSConfiguration", "CORSRule")) {
                if (str.equals("AllowedOrigin")) {
                    if (this.f688 == null) {
                        this.f688 = new ArrayList();
                    }
                } else if (str.equals("AllowedMethod")) {
                    if (this.f686 == null) {
                        this.f686 = new ArrayList();
                    }
                } else if (str.equals("ExposeHeader")) {
                    if (this.f687 == null) {
                        this.f687 = new ArrayList();
                    }
                } else if (str.equals("AllowedHeader") && this.f690 == null) {
                    this.f690 = new LinkedList();
                }
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m692("CORSConfiguration")) {
                if (str.equals("CORSRule")) {
                    this.f689.getClass();
                    this.f689.getClass();
                    this.f689.getClass();
                    this.f689.getClass();
                    this.f690 = null;
                    this.f686 = null;
                    this.f688 = null;
                    this.f687 = null;
                    ((ArrayList) this.f691.m523()).add(this.f689);
                    this.f689 = null;
                    return;
                }
                return;
            }
            if (m692("CORSConfiguration", "CORSRule")) {
                if (str.equals("ID")) {
                    CORSRule cORSRule = this.f689;
                    m694();
                    cORSRule.getClass();
                    return;
                }
                if (str.equals("AllowedOrigin")) {
                    this.f688.add(m694());
                    return;
                }
                if (str.equals("AllowedMethod")) {
                    this.f686.add(CORSRule.AllowedMethods.m532(m694()));
                    return;
                }
                if (str.equals("MaxAgeSeconds")) {
                    CORSRule cORSRule2 = this.f689;
                    Integer.parseInt(m694());
                    cORSRule2.getClass();
                } else if (str.equals("ExposeHeader")) {
                    this.f687.add(m694());
                } else if (str.equals("AllowedHeader")) {
                    this.f690.add(m694());
                }
            }
        }
    }

    public class GetBucketMetricsConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public final MetricsConfiguration f739 = new MetricsConfiguration();

        /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
        public MetricsFilter f740;

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public ArrayList f741;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (m692("MetricsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f740 = new MetricsFilter();
                }
            } else if (m692("MetricsConfiguration", "Filter") && str.equals("And")) {
                this.f741 = new ArrayList();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m692("MetricsConfiguration")) {
                boolean zEquals = str.equals("Id");
                MetricsConfiguration metricsConfiguration = this.f739;
                if (zEquals) {
                    m694();
                    metricsConfiguration.getClass();
                    return;
                } else {
                    if (str.equals("Filter")) {
                        metricsConfiguration.getClass();
                        this.f740 = null;
                        return;
                    }
                    return;
                }
            }
            if (m692("MetricsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    MetricsFilter metricsFilter = this.f740;
                    m694();
                    new MetricsPrefixPredicate();
                    metricsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    MetricsFilter metricsFilter2 = this.f740;
                    new MetricsTagPredicate();
                    metricsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        MetricsFilter metricsFilter3 = this.f740;
                        new MetricsAndOperator(this.f741);
                        metricsFilter3.getClass();
                        this.f741 = null;
                        return;
                    }
                    return;
                }
            }
            if (m692("MetricsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    m694();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m694();
                        return;
                    }
                    return;
                }
            }
            if (m692("MetricsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f741;
                    m694();
                    arrayList.add(new MetricsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f741.add(new MetricsTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (m692("MetricsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    m694();
                } else if (str.equals("Value")) {
                    m694();
                }
            }
        }
    }

    public class ListBucketMetricsConfigurationsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public MetricsConfiguration f768;

        /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
        public MetricsFilter f769;

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public ArrayList f770;

        /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
        public final ListBucketMetricsConfigurationsResult f771 = new ListBucketMetricsConfigurationsResult();

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (m692("ListMetricsConfigurationsResult")) {
                if (str.equals("MetricsConfiguration")) {
                    this.f768 = new MetricsConfiguration();
                }
            } else if (m692("ListMetricsConfigurationsResult", "MetricsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f769 = new MetricsFilter();
                }
            } else if (m692("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter") && str.equals("And")) {
                this.f770 = new ArrayList();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m692("ListMetricsConfigurationsResult")) {
                boolean zEquals = str.equals("MetricsConfiguration");
                ListBucketMetricsConfigurationsResult listBucketMetricsConfigurationsResult = this.f771;
                if (zEquals) {
                    if (listBucketMetricsConfigurationsResult.m588() == null) {
                        listBucketMetricsConfigurationsResult.m589(new ArrayList());
                    }
                    ((ArrayList) listBucketMetricsConfigurationsResult.m588()).add(this.f768);
                    this.f768 = null;
                    return;
                }
                if (str.equals("IsTruncated")) {
                    "true".equals(m694());
                    listBucketMetricsConfigurationsResult.getClass();
                    return;
                } else if (str.equals("ContinuationToken")) {
                    m694();
                    listBucketMetricsConfigurationsResult.getClass();
                    return;
                } else {
                    if (str.equals("NextContinuationToken")) {
                        m694();
                        listBucketMetricsConfigurationsResult.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m692("ListMetricsConfigurationsResult", "MetricsConfiguration")) {
                if (str.equals("Id")) {
                    MetricsConfiguration metricsConfiguration = this.f768;
                    m694();
                    metricsConfiguration.getClass();
                    return;
                } else {
                    if (str.equals("Filter")) {
                        this.f768.getClass();
                        this.f769 = null;
                        return;
                    }
                    return;
                }
            }
            if (m692("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    MetricsFilter metricsFilter = this.f769;
                    m694();
                    new MetricsPrefixPredicate();
                    metricsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    MetricsFilter metricsFilter2 = this.f769;
                    new MetricsTagPredicate();
                    metricsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        MetricsFilter metricsFilter3 = this.f769;
                        new MetricsAndOperator(this.f770);
                        metricsFilter3.getClass();
                        this.f770 = null;
                        return;
                    }
                    return;
                }
            }
            if (m692("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    m694();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m694();
                        return;
                    }
                    return;
                }
            }
            if (m692("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f770;
                    m694();
                    arrayList.add(new MetricsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f770.add(new MetricsTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (m692("ListMetricsConfigurationsResult", "MetricsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    m694();
                } else if (str.equals("Value")) {
                    m694();
                }
            }
        }
    }

    public class GetBucketAnalyticsConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public final AnalyticsConfiguration f726 = new AnalyticsConfiguration();

        /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
        public AnalyticsS3BucketDestination f727;

        /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
        public StorageClassAnalysisDataExport f728;

        /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
        public StorageClassAnalysis f729;

        /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
        public AnalyticsFilter f730;

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public ArrayList f731;

        /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
        public AnalyticsExportDestination f732;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (m692("AnalyticsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f730 = new AnalyticsFilter();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f729 = new StorageClassAnalysis();
                        return;
                    }
                    return;
                }
            }
            if (m692("AnalyticsConfiguration", "Filter")) {
                if (str.equals("And")) {
                    this.f731 = new ArrayList();
                }
            } else if (m692("AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f728 = new StorageClassAnalysisDataExport();
                }
            } else if (m692("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("Destination")) {
                    this.f732 = new AnalyticsExportDestination();
                }
            } else if (m692("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination") && str.equals("S3BucketDestination")) {
                this.f727 = new AnalyticsS3BucketDestination();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m692("AnalyticsConfiguration")) {
                boolean zEquals = str.equals("Id");
                AnalyticsConfiguration analyticsConfiguration = this.f726;
                if (zEquals) {
                    m694();
                    analyticsConfiguration.getClass();
                    return;
                } else if (str.equals("Filter")) {
                    analyticsConfiguration.getClass();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        analyticsConfiguration.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m692("AnalyticsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    AnalyticsFilter analyticsFilter = this.f730;
                    m694();
                    new AnalyticsPrefixPredicate();
                    analyticsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    AnalyticsFilter analyticsFilter2 = this.f730;
                    new AnalyticsTagPredicate();
                    analyticsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        AnalyticsFilter analyticsFilter3 = this.f730;
                        new AnalyticsAndOperator(this.f731);
                        analyticsFilter3.getClass();
                        this.f731 = null;
                        return;
                    }
                    return;
                }
            }
            if (m692("AnalyticsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    m694();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m694();
                        return;
                    }
                    return;
                }
            }
            if (m692("AnalyticsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f731;
                    m694();
                    arrayList.add(new AnalyticsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f731.add(new AnalyticsTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (m692("AnalyticsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    m694();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m694();
                        return;
                    }
                    return;
                }
            }
            if (m692("AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f729.getClass();
                    return;
                }
                return;
            }
            if (m692("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("OutputSchemaVersion")) {
                    StorageClassAnalysisDataExport storageClassAnalysisDataExport = this.f728;
                    m694();
                    storageClassAnalysisDataExport.getClass();
                    return;
                } else {
                    if (str.equals("Destination")) {
                        this.f728.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m692("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f732.getClass();
                    return;
                }
                return;
            }
            if (m692("AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination", "S3BucketDestination")) {
                if (str.equals("Format")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination = this.f727;
                    m694();
                    analyticsS3BucketDestination.getClass();
                    return;
                }
                if (str.equals("BucketAccountId")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination2 = this.f727;
                    m694();
                    analyticsS3BucketDestination2.getClass();
                } else if (str.equals("Bucket")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination3 = this.f727;
                    m694();
                    analyticsS3BucketDestination3.getClass();
                } else if (str.equals("Prefix")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination4 = this.f727;
                    m694();
                    analyticsS3BucketDestination4.getClass();
                }
            }
        }
    }

    public class ListBucketAnalyticsConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public AnalyticsConfiguration f749;

        /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
        public final ListBucketAnalyticsConfigurationsResult f750 = new ListBucketAnalyticsConfigurationsResult();

        /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
        public StorageClassAnalysis f751;

        /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
        public AnalyticsFilter f752;

        /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
        public AnalyticsS3BucketDestination f753;

        /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
        public AnalyticsExportDestination f754;

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public ArrayList f755;

        /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
        public StorageClassAnalysisDataExport f756;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (m692("ListBucketAnalyticsConfigurationsResult")) {
                if (str.equals("AnalyticsConfiguration")) {
                    this.f749 = new AnalyticsConfiguration();
                    return;
                }
                return;
            }
            if (m692("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration")) {
                if (str.equals("Filter")) {
                    this.f752 = new AnalyticsFilter();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f751 = new StorageClassAnalysis();
                        return;
                    }
                    return;
                }
            }
            if (m692("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter")) {
                if (str.equals("And")) {
                    this.f755 = new ArrayList();
                }
            } else if (m692("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f756 = new StorageClassAnalysisDataExport();
                }
            } else if (m692("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("Destination")) {
                    this.f754 = new AnalyticsExportDestination();
                }
            } else if (m692("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination") && str.equals("S3BucketDestination")) {
                this.f753 = new AnalyticsS3BucketDestination();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m692("ListBucketAnalyticsConfigurationsResult")) {
                boolean zEquals = str.equals("AnalyticsConfiguration");
                ListBucketAnalyticsConfigurationsResult listBucketAnalyticsConfigurationsResult = this.f750;
                if (zEquals) {
                    if (listBucketAnalyticsConfigurationsResult.m584() == null) {
                        listBucketAnalyticsConfigurationsResult.m585(new ArrayList());
                    }
                    ((ArrayList) listBucketAnalyticsConfigurationsResult.m584()).add(this.f749);
                    this.f749 = null;
                    return;
                }
                if (str.equals("IsTruncated")) {
                    "true".equals(m694());
                    listBucketAnalyticsConfigurationsResult.getClass();
                    return;
                } else if (str.equals("ContinuationToken")) {
                    m694();
                    listBucketAnalyticsConfigurationsResult.getClass();
                    return;
                } else {
                    if (str.equals("NextContinuationToken")) {
                        m694();
                        listBucketAnalyticsConfigurationsResult.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m692("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration")) {
                if (str.equals("Id")) {
                    AnalyticsConfiguration analyticsConfiguration = this.f749;
                    m694();
                    analyticsConfiguration.getClass();
                    return;
                } else if (str.equals("Filter")) {
                    this.f749.getClass();
                    return;
                } else {
                    if (str.equals("StorageClassAnalysis")) {
                        this.f749.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m692("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    AnalyticsFilter analyticsFilter = this.f752;
                    m694();
                    new AnalyticsPrefixPredicate();
                    analyticsFilter.getClass();
                    return;
                }
                if (str.equals("Tag")) {
                    AnalyticsFilter analyticsFilter2 = this.f752;
                    new AnalyticsTagPredicate();
                    analyticsFilter2.getClass();
                    return;
                } else {
                    if (str.equals("And")) {
                        AnalyticsFilter analyticsFilter3 = this.f752;
                        new AnalyticsAndOperator(this.f755);
                        analyticsFilter3.getClass();
                        this.f755 = null;
                        return;
                    }
                    return;
                }
            }
            if (m692("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "Tag")) {
                if (str.equals("Key")) {
                    m694();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m694();
                        return;
                    }
                    return;
                }
            }
            if (m692("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "And")) {
                if (str.equals("Prefix")) {
                    ArrayList arrayList = this.f755;
                    m694();
                    arrayList.add(new AnalyticsPrefixPredicate());
                    return;
                } else {
                    if (str.equals("Tag")) {
                        this.f755.add(new AnalyticsTagPredicate());
                        return;
                    }
                    return;
                }
            }
            if (m692("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "Filter", "And", "Tag")) {
                if (str.equals("Key")) {
                    m694();
                    return;
                } else {
                    if (str.equals("Value")) {
                        m694();
                        return;
                    }
                    return;
                }
            }
            if (m692("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis")) {
                if (str.equals("DataExport")) {
                    this.f751.getClass();
                    return;
                }
                return;
            }
            if (m692("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport")) {
                if (str.equals("OutputSchemaVersion")) {
                    StorageClassAnalysisDataExport storageClassAnalysisDataExport = this.f756;
                    m694();
                    storageClassAnalysisDataExport.getClass();
                    return;
                } else {
                    if (str.equals("Destination")) {
                        this.f756.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m692("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f754.getClass();
                    return;
                }
                return;
            }
            if (m692("ListBucketAnalyticsConfigurationsResult", "AnalyticsConfiguration", "StorageClassAnalysis", "DataExport", "Destination", "S3BucketDestination")) {
                if (str.equals("Format")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination = this.f753;
                    m694();
                    analyticsS3BucketDestination.getClass();
                    return;
                }
                if (str.equals("BucketAccountId")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination2 = this.f753;
                    m694();
                    analyticsS3BucketDestination2.getClass();
                } else if (str.equals("Bucket")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination3 = this.f753;
                    m694();
                    analyticsS3BucketDestination3.getClass();
                } else if (str.equals("Prefix")) {
                    AnalyticsS3BucketDestination analyticsS3BucketDestination4 = this.f753;
                    m694();
                    analyticsS3BucketDestination4.getClass();
                }
            }
        }
    }

    public class GetBucketInventoryConfigurationHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public InventoryFilter f733;

        /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
        public InventoryS3BucketDestination f734;

        /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
        public InventoryDestination f735;

        /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
        public ArrayList f736;

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public final InventoryConfiguration f737;

        /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
        public InventorySchedule f738;

        public GetBucketInventoryConfigurationHandler() {
            new GetBucketInventoryConfigurationResult();
            this.f737 = new InventoryConfiguration();
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (m692("InventoryConfiguration")) {
                if (str.equals("Destination")) {
                    this.f735 = new InventoryDestination();
                    return;
                }
                if (str.equals("Filter")) {
                    this.f733 = new InventoryFilter();
                    return;
                } else if (str.equals("Schedule")) {
                    this.f738 = new InventorySchedule();
                    return;
                } else {
                    if (str.equals("OptionalFields")) {
                        this.f736 = new ArrayList();
                        return;
                    }
                    return;
                }
            }
            if (m692("InventoryConfiguration", "Destination") && str.equals("S3BucketDestination")) {
                this.f734 = new InventoryS3BucketDestination();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m692("InventoryConfiguration")) {
                boolean zEquals = str.equals("Id");
                InventoryConfiguration inventoryConfiguration = this.f737;
                if (zEquals) {
                    m694();
                    inventoryConfiguration.getClass();
                    return;
                }
                if (str.equals("Destination")) {
                    inventoryConfiguration.getClass();
                    this.f735 = null;
                    return;
                }
                if (str.equals("IsEnabled")) {
                    "true".equals(m694());
                    inventoryConfiguration.getClass();
                    return;
                }
                if (str.equals("Filter")) {
                    inventoryConfiguration.getClass();
                    this.f733 = null;
                    return;
                }
                if (str.equals("IncludedObjectVersions")) {
                    m694();
                    inventoryConfiguration.getClass();
                    return;
                } else if (str.equals("Schedule")) {
                    inventoryConfiguration.getClass();
                    this.f738 = null;
                    return;
                } else {
                    if (str.equals("OptionalFields")) {
                        inventoryConfiguration.getClass();
                        this.f736 = null;
                        return;
                    }
                    return;
                }
            }
            if (m692("InventoryConfiguration", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f735.getClass();
                    this.f734 = null;
                    return;
                }
                return;
            }
            if (m692("InventoryConfiguration", "Destination", "S3BucketDestination")) {
                if (str.equals("AccountId")) {
                    InventoryS3BucketDestination inventoryS3BucketDestination = this.f734;
                    m694();
                    inventoryS3BucketDestination.getClass();
                    return;
                }
                if (str.equals("Bucket")) {
                    InventoryS3BucketDestination inventoryS3BucketDestination2 = this.f734;
                    m694();
                    inventoryS3BucketDestination2.getClass();
                    return;
                } else if (str.equals("Format")) {
                    InventoryS3BucketDestination inventoryS3BucketDestination3 = this.f734;
                    m694();
                    inventoryS3BucketDestination3.getClass();
                    return;
                } else {
                    if (str.equals("Prefix")) {
                        InventoryS3BucketDestination inventoryS3BucketDestination4 = this.f734;
                        m694();
                        inventoryS3BucketDestination4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m692("InventoryConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    InventoryFilter inventoryFilter = this.f733;
                    m694();
                    new InventoryPrefixPredicate();
                    inventoryFilter.getClass();
                    return;
                }
                return;
            }
            if (m692("InventoryConfiguration", "Schedule")) {
                if (str.equals("Frequency")) {
                    InventorySchedule inventorySchedule = this.f738;
                    m694();
                    inventorySchedule.getClass();
                    return;
                }
                return;
            }
            if (m692("InventoryConfiguration", "OptionalFields") && str.equals("Field")) {
                this.f736.add(m694());
            }
        }
    }

    public class ListBucketInventoryConfigurationsHandler extends AbstractHandler {

        /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
        public InventoryDestination f761;

        /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
        public InventorySchedule f762;

        /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
        public InventoryFilter f763;

        /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
        public final ListBucketInventoryConfigurationsResult f764 = new ListBucketInventoryConfigurationsResult();

        /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
        public InventoryS3BucketDestination f765;

        /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public InventoryConfiguration f766;

        /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
        public ArrayList f767;

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ۙ */
        public final void mo690(String str, Attributes attributes) {
            if (m692("ListInventoryConfigurationsResult")) {
                if (str.equals("InventoryConfiguration")) {
                    this.f766 = new InventoryConfiguration();
                    return;
                }
                return;
            }
            if (m692("ListInventoryConfigurationsResult", "InventoryConfiguration")) {
                if (str.equals("Destination")) {
                    this.f761 = new InventoryDestination();
                    return;
                }
                if (str.equals("Filter")) {
                    this.f763 = new InventoryFilter();
                    return;
                } else if (str.equals("Schedule")) {
                    this.f762 = new InventorySchedule();
                    return;
                } else {
                    if (str.equals("OptionalFields")) {
                        this.f767 = new ArrayList();
                        return;
                    }
                    return;
                }
            }
            if (m692("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination") && str.equals("S3BucketDestination")) {
                this.f765 = new InventoryS3BucketDestination();
            }
        }

        @Override // com.amazonaws.services.s3.model.transform.AbstractHandler
        /* JADX INFO: renamed from: ܳ */
        public final void mo693(String str) {
            if (m692("ListInventoryConfigurationsResult")) {
                boolean zEquals = str.equals("InventoryConfiguration");
                ListBucketInventoryConfigurationsResult listBucketInventoryConfigurationsResult = this.f764;
                if (zEquals) {
                    if (listBucketInventoryConfigurationsResult.m586() == null) {
                        listBucketInventoryConfigurationsResult.m587(new ArrayList());
                    }
                    ((ArrayList) listBucketInventoryConfigurationsResult.m586()).add(this.f766);
                    this.f766 = null;
                    return;
                }
                if (str.equals("IsTruncated")) {
                    "true".equals(m694());
                    listBucketInventoryConfigurationsResult.getClass();
                    return;
                } else if (str.equals("ContinuationToken")) {
                    m694();
                    listBucketInventoryConfigurationsResult.getClass();
                    return;
                } else {
                    if (str.equals("NextContinuationToken")) {
                        m694();
                        listBucketInventoryConfigurationsResult.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m692("ListInventoryConfigurationsResult", "InventoryConfiguration")) {
                if (str.equals("Id")) {
                    InventoryConfiguration inventoryConfiguration = this.f766;
                    m694();
                    inventoryConfiguration.getClass();
                    return;
                }
                if (str.equals("Destination")) {
                    this.f766.getClass();
                    this.f761 = null;
                    return;
                }
                if (str.equals("IsEnabled")) {
                    InventoryConfiguration inventoryConfiguration2 = this.f766;
                    "true".equals(m694());
                    inventoryConfiguration2.getClass();
                    return;
                }
                if (str.equals("Filter")) {
                    this.f766.getClass();
                    this.f763 = null;
                    return;
                }
                if (str.equals("IncludedObjectVersions")) {
                    InventoryConfiguration inventoryConfiguration3 = this.f766;
                    m694();
                    inventoryConfiguration3.getClass();
                    return;
                } else if (str.equals("Schedule")) {
                    this.f766.getClass();
                    this.f762 = null;
                    return;
                } else {
                    if (str.equals("OptionalFields")) {
                        this.f766.getClass();
                        this.f767 = null;
                        return;
                    }
                    return;
                }
            }
            if (m692("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination")) {
                if (str.equals("S3BucketDestination")) {
                    this.f761.getClass();
                    this.f765 = null;
                    return;
                }
                return;
            }
            if (m692("ListInventoryConfigurationsResult", "InventoryConfiguration", "Destination", "S3BucketDestination")) {
                if (str.equals("AccountId")) {
                    InventoryS3BucketDestination inventoryS3BucketDestination = this.f765;
                    m694();
                    inventoryS3BucketDestination.getClass();
                    return;
                }
                if (str.equals("Bucket")) {
                    InventoryS3BucketDestination inventoryS3BucketDestination2 = this.f765;
                    m694();
                    inventoryS3BucketDestination2.getClass();
                    return;
                } else if (str.equals("Format")) {
                    InventoryS3BucketDestination inventoryS3BucketDestination3 = this.f765;
                    m694();
                    inventoryS3BucketDestination3.getClass();
                    return;
                } else {
                    if (str.equals("Prefix")) {
                        InventoryS3BucketDestination inventoryS3BucketDestination4 = this.f765;
                        m694();
                        inventoryS3BucketDestination4.getClass();
                        return;
                    }
                    return;
                }
            }
            if (m692("ListInventoryConfigurationsResult", "InventoryConfiguration", "Filter")) {
                if (str.equals("Prefix")) {
                    InventoryFilter inventoryFilter = this.f763;
                    m694();
                    new InventoryPrefixPredicate();
                    inventoryFilter.getClass();
                    return;
                }
                return;
            }
            if (m692("ListInventoryConfigurationsResult", "InventoryConfiguration", "Schedule")) {
                if (str.equals("Frequency")) {
                    InventorySchedule inventorySchedule = this.f762;
                    m694();
                    inventorySchedule.getClass();
                    return;
                }
                return;
            }
            if (m692("ListInventoryConfigurationsResult", "InventoryConfiguration", "OptionalFields") && str.equals("Field")) {
                this.f767.add(m694());
            }
        }
    }
}
