package l;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.alipay.sdk.app.OpenAuthTask;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.datepicker.UtcDates;
import com.umeng.analytics.pro.cb;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.۠ᩴۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 057Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C8826 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final int[] f28838;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f28839;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C1369[] f28845;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final Pattern f28848;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final String[] f28849;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final byte[] f28850;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final Set f28851;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap[] f28852;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final byte[] f28853;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final Charset f28858;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static final SimpleDateFormat f28859;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final SimpleDateFormat f28860;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f28862;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final C1369 f28863;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final C1369[][] f28869;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap[] f28870;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f28871;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f28872;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f28873;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap[] f28874;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f28875;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f28876;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f28877;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public FileDescriptor f28878;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C10317 f28879;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ByteOrder f28880;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public AssetManager.AssetInputStream f28881;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashSet f28882;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f28883;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final boolean f28864 = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final List f28867 = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final List f28842 = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final int[] f28841 = {8, 8, 8};

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final int[] f28868 = {8};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final byte[] f28840 = {-1, -40, -1};

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final byte[] f28847 = {102, 116, 121, KeyFactorySpi.Ed25519_type};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final byte[] f28837 = {109, 105, 102, 49};

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final byte[] f28861 = {104, 101, 105, 99};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final byte[] f28856 = {97, 118, 105, 102};

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final byte[] f28865 = {97, 118, 105, 115};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final byte[] f28846 = {79, 76, 89, 77, UTF8.S_P4A, 0};

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final byte[] f28855 = {79, 76, 89, 77, UTF8.S_P4A, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f28866 = {-119, UTF8.S_P4A, 78, 71, cb.k, 10, 26, 10};

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f28843 = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f28854 = {82, 73, 70, 70};

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f28844 = {87, 69, 66, UTF8.S_P4A};

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f28857 = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f28849 = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f28838 = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f28853 = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C1369[] c1369Arr = {new C1369("NewSubfileType", Scalar25519.TARGET_LENGTH, 4), new C1369("SubfileType", 255, 4), new C1369("ImageWidth", 256, 3, 4), new C1369("ImageLength", 257, 3, 4), new C1369("BitsPerSample", 258, 3), new C1369("Compression", 259, 3), new C1369("PhotometricInterpretation", 262, 3), new C1369("ImageDescription", BottomAppBarTopEdgeTreatment.ANGLE_UP, 2), new C1369("Make", 271, 2), new C1369("Model", 272, 2), new C1369("StripOffsets", 273, 3, 4), new C1369("Orientation", 274, 3), new C1369("SamplesPerPixel", 277, 3), new C1369("RowsPerStrip", 278, 3, 4), new C1369("StripByteCounts", 279, 3, 4), new C1369("XResolution", 282, 5), new C1369("YResolution", 283, 5), new C1369("PlanarConfiguration", 284, 3), new C1369("ResolutionUnit", 296, 3), new C1369("TransferFunction", 301, 3), new C1369("Software", 305, 2), new C1369("DateTime", 306, 2), new C1369("Artist", 315, 2), new C1369("WhitePoint", 318, 5), new C1369("PrimaryChromaticities", 319, 5), new C1369("SubIFDPointer", 330, 4), new C1369("JPEGInterchangeFormat", 513, 4), new C1369("JPEGInterchangeFormatLength", 514, 4), new C1369("YCbCrCoefficients", 529, 5), new C1369("YCbCrSubSampling", 530, 3), new C1369("YCbCrPositioning", 531, 3), new C1369("ReferenceBlackWhite", 532, 5), new C1369("Copyright", 33432, 2), new C1369("ExifIFDPointer", 34665, 4), new C1369("GPSInfoIFDPointer", 34853, 4), new C1369("SensorTopBorder", 4, 4), new C1369("SensorLeftBorder", 5, 4), new C1369("SensorBottomBorder", 6, 4), new C1369("SensorRightBorder", 7, 4), new C1369("ISO", 23, 3), new C1369("JpgFromRaw", 46, 7), new C1369("Xmp", 700, 1)};
        C1369[] c1369Arr2 = {new C1369("ExposureTime", 33434, 5), new C1369("FNumber", 33437, 5), new C1369("ExposureProgram", 34850, 3), new C1369("SpectralSensitivity", 34852, 2), new C1369("PhotographicSensitivity", 34855, 3), new C1369("OECF", 34856, 7), new C1369("SensitivityType", 34864, 3), new C1369("StandardOutputSensitivity", 34865, 4), new C1369("RecommendedExposureIndex", 34866, 4), new C1369("ISOSpeed", 34867, 4), new C1369("ISOSpeedLatitudeyyy", 34868, 4), new C1369("ISOSpeedLatitudezzz", 34869, 4), new C1369("ExifVersion", UMModuleRegister.INNER_EVENT_VALUE_HIGH, 2), new C1369("DateTimeOriginal", 36867, 2), new C1369("DateTimeDigitized", 36868, 2), new C1369("OffsetTime", 36880, 2), new C1369("OffsetTimeOriginal", 36881, 2), new C1369("OffsetTimeDigitized", 36882, 2), new C1369("ComponentsConfiguration", UMModuleRegister.APPSTATUS_SWITCH_LOW, 7), new C1369("CompressedBitsPerPixel", 37122, 5), new C1369("ShutterSpeedValue", 37377, 10), new C1369("ApertureValue", 37378, 5), new C1369("BrightnessValue", 37379, 10), new C1369("ExposureBiasValue", 37380, 10), new C1369("MaxApertureValue", 37381, 5), new C1369("SubjectDistance", 37382, 5), new C1369("MeteringMode", 37383, 3), new C1369("LightSource", 37384, 3), new C1369("Flash", 37385, 3), new C1369("FocalLength", 37386, 5), new C1369("SubjectArea", 37396, 3), new C1369("MakerNote", 37500, 7), new C1369("UserComment", 37510, 7), new C1369("SubSecTime", 37520, 2), new C1369("SubSecTimeOriginal", 37521, 2), new C1369("SubSecTimeDigitized", 37522, 2), new C1369("FlashpixVersion", 40960, 7), new C1369("ColorSpace", 40961, 3), new C1369("PixelXDimension", 40962, 3, 4), new C1369("PixelYDimension", 40963, 3, 4), new C1369("RelatedSoundFile", 40964, 2), new C1369("InteroperabilityIFDPointer", 40965, 4), new C1369("FlashEnergy", 41483, 5), new C1369("SpatialFrequencyResponse", 41484, 7), new C1369("FocalPlaneXResolution", 41486, 5), new C1369("FocalPlaneYResolution", 41487, 5), new C1369("FocalPlaneResolutionUnit", 41488, 3), new C1369("SubjectLocation", 41492, 3), new C1369("ExposureIndex", 41493, 5), new C1369("SensingMethod", 41495, 3), new C1369("FileSource", 41728, 7), new C1369("SceneType", 41729, 7), new C1369("CFAPattern", 41730, 7), new C1369("CustomRendered", 41985, 3), new C1369("ExposureMode", 41986, 3), new C1369("WhiteBalance", 41987, 3), new C1369("DigitalZoomRatio", 41988, 5), new C1369("FocalLengthIn35mmFilm", 41989, 3), new C1369("SceneCaptureType", 41990, 3), new C1369("GainControl", 41991, 3), new C1369("Contrast", 41992, 3), new C1369("Saturation", 41993, 3), new C1369("Sharpness", 41994, 3), new C1369("DeviceSettingDescription", 41995, 7), new C1369("SubjectDistanceRange", 41996, 3), new C1369("ImageUniqueID", 42016, 2), new C1369("CameraOwnerName", 42032, 2), new C1369("BodySerialNumber", 42033, 2), new C1369("LensSpecification", 42034, 5), new C1369("LensMake", 42035, 2), new C1369("LensModel", 42036, 2), new C1369("Gamma", 42240, 5), new C1369("DNGVersion", 50706, 1), new C1369("DefaultCropSize", 50720, 3, 4)};
        C1369[] c1369Arr3 = {new C1369("GPSVersionID", 0, 1), new C1369("GPSLatitudeRef", 1, 2), new C1369("GPSLatitude", 2, 5, 10), new C1369("GPSLongitudeRef", 3, 2), new C1369("GPSLongitude", 4, 5, 10), new C1369("GPSAltitudeRef", 5, 1), new C1369("GPSAltitude", 6, 5), new C1369("GPSTimeStamp", 7, 5), new C1369("GPSSatellites", 8, 2), new C1369("GPSStatus", 9, 2), new C1369("GPSMeasureMode", 10, 2), new C1369("GPSDOP", 11, 5), new C1369("GPSSpeedRef", 12, 2), new C1369("GPSSpeed", 13, 5), new C1369("GPSTrackRef", 14, 2), new C1369("GPSTrack", 15, 5), new C1369("GPSImgDirectionRef", 16, 2), new C1369("GPSImgDirection", 17, 5), new C1369("GPSMapDatum", 18, 2), new C1369("GPSDestLatitudeRef", 19, 2), new C1369("GPSDestLatitude", 20, 5), new C1369("GPSDestLongitudeRef", 21, 2), new C1369("GPSDestLongitude", 22, 5), new C1369("GPSDestBearingRef", 23, 2), new C1369("GPSDestBearing", 24, 5), new C1369("GPSDestDistanceRef", 25, 2), new C1369("GPSDestDistance", 26, 5), new C1369("GPSProcessingMethod", 27, 7), new C1369("GPSAreaInformation", 28, 7), new C1369("GPSDateStamp", 29, 2), new C1369("GPSDifferential", 30, 3), new C1369("GPSHPositioningError", 31, 5)};
        C1369[] c1369Arr4 = {new C1369("InteroperabilityIndex", 1, 2)};
        C1369[] c1369Arr5 = {new C1369("NewSubfileType", Scalar25519.TARGET_LENGTH, 4), new C1369("SubfileType", 255, 4), new C1369("ThumbnailImageWidth", 256, 3, 4), new C1369("ThumbnailImageLength", 257, 3, 4), new C1369("BitsPerSample", 258, 3), new C1369("Compression", 259, 3), new C1369("PhotometricInterpretation", 262, 3), new C1369("ImageDescription", BottomAppBarTopEdgeTreatment.ANGLE_UP, 2), new C1369("Make", 271, 2), new C1369("Model", 272, 2), new C1369("StripOffsets", 273, 3, 4), new C1369("ThumbnailOrientation", 274, 3), new C1369("SamplesPerPixel", 277, 3), new C1369("RowsPerStrip", 278, 3, 4), new C1369("StripByteCounts", 279, 3, 4), new C1369("XResolution", 282, 5), new C1369("YResolution", 283, 5), new C1369("PlanarConfiguration", 284, 3), new C1369("ResolutionUnit", 296, 3), new C1369("TransferFunction", 301, 3), new C1369("Software", 305, 2), new C1369("DateTime", 306, 2), new C1369("Artist", 315, 2), new C1369("WhitePoint", 318, 5), new C1369("PrimaryChromaticities", 319, 5), new C1369("SubIFDPointer", 330, 4), new C1369("JPEGInterchangeFormat", 513, 4), new C1369("JPEGInterchangeFormatLength", 514, 4), new C1369("YCbCrCoefficients", 529, 5), new C1369("YCbCrSubSampling", 530, 3), new C1369("YCbCrPositioning", 531, 3), new C1369("ReferenceBlackWhite", 532, 5), new C1369("Copyright", 33432, 2), new C1369("ExifIFDPointer", 34665, 4), new C1369("GPSInfoIFDPointer", 34853, 4), new C1369("DNGVersion", 50706, 1), new C1369("DefaultCropSize", 50720, 3, 4)};
        f28863 = new C1369("StripOffsets", 273, 3);
        f28869 = new C1369[][]{c1369Arr, c1369Arr2, c1369Arr3, c1369Arr4, c1369Arr5, c1369Arr, new C1369[]{new C1369("ThumbnailImage", 256, 7), new C1369("CameraSettingsIFDPointer", 8224, 4), new C1369("ImageProcessingIFDPointer", 8256, 4)}, new C1369[]{new C1369("PreviewImageStart", 257, 4), new C1369("PreviewImageLength", 258, 4)}, new C1369[]{new C1369("AspectFrame", 4371, 3)}, new C1369[]{new C1369("ColorSpace", 55, 3)}};
        f28845 = new C1369[]{new C1369("SubIFDPointer", 330, 4), new C1369("ExifIFDPointer", 34665, 4), new C1369("GPSInfoIFDPointer", 34853, 4), new C1369("InteroperabilityIFDPointer", 40965, 4), new C1369("CameraSettingsIFDPointer", 8224, 1), new C1369("ImageProcessingIFDPointer", 8256, 1)};
        f28852 = new HashMap[10];
        f28870 = new HashMap[10];
        f28851 = C4681.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f28839 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f28858 = charsetForName;
        f28862 = "Exif\u0000\u0000".getBytes(charsetForName);
        f28850 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f28859 = simpleDateFormat;
        simpleDateFormat.setTimeZone(C10646.getTimeZone(UtcDates.UTC));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f28860 = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(C10646.getTimeZone(UtcDates.UTC));
        int i = 0;
        while (true) {
            C1369[][] c1369Arr6 = f28869;
            if (i < c1369Arr6.length) {
                f28852[i] = new HashMap();
                f28870[i] = new HashMap();
                for (C1369 c1369 : c1369Arr6[i]) {
                    f28852[i].put(Integer.valueOf(c1369.f4871), c1369);
                    f28870[i].put(c1369.f4869, c1369);
                }
                i++;
            } else {
                HashMap map = f28839;
                C1369[] c1369Arr7 = f28845;
                map.put(Integer.valueOf(c1369Arr7[0].f4871), 5);
                map.put(Integer.valueOf(c1369Arr7[1].f4871), 1);
                map.put(Integer.valueOf(c1369Arr7[2].f4871), 2);
                map.put(Integer.valueOf(c1369Arr7[3].f4871), 3);
                map.put(Integer.valueOf(c1369Arr7[4].f4871), 7);
                map.put(Integer.valueOf(c1369Arr7[5].f4871), 8);
                f28848 = Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public C8826(InputStream inputStream, int i) {
        C1369[][] c1369Arr = f28869;
        this.f28874 = new HashMap[c1369Arr.length];
        this.f28882 = new HashSet(c1369Arr.length);
        this.f28880 = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        boolean z = i == 1;
        this.f28877 = z;
        if (z) {
            this.f28881 = null;
            this.f28878 = null;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f28881 = (AssetManager.AssetInputStream) inputStream;
            this.f28878 = null;
        } else if (!(inputStream instanceof FileInputStream)) {
            this.f28881 = null;
            this.f28878 = null;
        } else {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f28881 = null;
                this.f28878 = fileInputStream.getFD();
            } catch (Exception unused) {
                this.f28881 = null;
                this.f28878 = null;
            }
        }
        boolean z2 = this.f28877;
        boolean z3 = f28864;
        for (int i2 = 0; i2 < c1369Arr.length; i2++) {
            try {
                try {
                    this.f28874[i2] = new HashMap();
                } catch (IOException | UnsupportedOperationException unused2) {
                    m23676();
                    if (!z3) {
                        return;
                    }
                }
            } catch (Throwable th) {
                m23676();
                if (z3) {
                    m23688();
                }
                throw th;
            }
        }
        if (!z2) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, OpenAuthTask.Duplex);
            this.f28876 = m23661(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i3 = this.f28876;
        if (i3 != 4 && i3 != 9 && i3 != 13 && i3 != 14) {
            C2860 c2860 = new C2860(inputStream);
            if (z2) {
                if (!m23687(c2860)) {
                    m23676();
                    if (!z3) {
                        return;
                    }
                }
                m23688();
            }
            int i4 = this.f28876;
            if (i4 == 12 || i4 == 15) {
                m23667(c2860, i4);
            } else if (i4 == 7) {
                m23666(c2860);
            } else if (i4 == 10) {
                m23673(c2860);
            } else {
                m23683(c2860);
            }
            c2860.seek(this.f28873);
            m23681((C19268) c2860);
        } else {
            C19268 c19268 = new C19268(inputStream);
            int i5 = this.f28876;
            if (i5 == 4) {
                m23669(c19268, 0, 0);
            } else if (i5 == 13) {
                m23668(c19268);
            } else if (i5 == 9) {
                m23685(c19268);
            } else if (i5 == 14) {
                m23675(c19268);
            }
        }
        m23676();
        if (!z3) {
            return;
        }
        m23688();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C10317 m23682(String str) {
        C10317 c10317;
        int i;
        C10317 c10318;
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.f28876) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (c10318 = this.f28879) != null)) {
            return c10318;
        }
        for (int i2 = 0; i2 < f28869.length; i2++) {
            C10317 c10319 = (C10317) this.f28874[i2].get(str);
            if (c10319 != null) {
                return c10319;
            }
        }
        if (!"Xmp".equals(str) || (c10317 = this.f28879) == null) {
            return null;
        }
        return c10317;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m23692(String str) {
        C10317 c10317M23682 = m23682(str);
        if (c10317M23682 != null) {
            if (str.equals("GPSTimeStamp")) {
                int i = c10317M23682.f32917;
                if (i == 5 || i == 10) {
                    C9571[] c9571Arr = (C9571[]) c10317M23682.m26591(this.f28880);
                    if (c9571Arr == null || c9571Arr.length != 3) {
                        Arrays.toString(c9571Arr);
                        return null;
                    }
                    C9571 c9571 = c9571Arr[0];
                    Integer numValueOf = Integer.valueOf((int) (c9571.f30970 / c9571.f30969));
                    C9571 c9572 = c9571Arr[1];
                    Integer numValueOf2 = Integer.valueOf((int) (c9572.f30970 / c9572.f30969));
                    C9571 c9573 = c9571Arr[2];
                    return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c9573.f30970 / c9573.f30969)));
                }
            } else if (f28851.contains(str)) {
                try {
                    return Double.toString(c10317M23682.m26588(this.f28880));
                } catch (NumberFormatException unused) {
                }
            } else {
                return c10317M23682.m26589(this.f28880);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m23690(int i, String str) {
        C10317 c10317M23682 = m23682(str);
        if (c10317M23682 == null) {
            return i;
        }
        try {
            return c10317M23682.m26590(this.f28880);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final double m23689(String str, double d) {
        C10317 c10317M23682 = m23682(str);
        if (c10317M23682 != null) {
            try {
                return c10317M23682.m26588(this.f28880);
            } catch (NumberFormatException unused) {
            }
        }
        return d;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m23688() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f28874;
            if (i >= mapArr.length) {
                return;
            }
            mapArr[i].size();
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C10317 c10317 = (C10317) entry.getValue();
                c10317.toString();
                c10317.m26589(this.f28880);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final double[] m23694() {
        String strM23692 = m23692("GPSLatitude");
        String strM23693 = m23692("GPSLatitudeRef");
        String strM23694 = m23692("GPSLongitude");
        String strM23695 = m23692("GPSLongitudeRef");
        if (strM23692 == null || strM23693 == null || strM23694 == null || strM23695 == null) {
            return null;
        }
        try {
            return new double[]{m23660(strM23692, strM23693), m23660(strM23694, strM23695)};
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Long m23691() {
        return m23662(m23692("DateTime"), m23692("SubSecTime"), m23692("OffsetTime"));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Long m23695() {
        return m23662(m23692("DateTimeDigitized"), m23692("SubSecTimeDigitized"), m23692("OffsetTimeDigitized"));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Long m23693() {
        return m23662(m23692("DateTimeOriginal"), m23692("SubSecTimeOriginal"), m23692("OffsetTimeOriginal"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Long m23662(String str, String str2, String str3) {
        long j;
        if (str != null && f28848.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date date = f28859.parse(str, parsePosition);
                if (date == null && (date = f28860.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = date.getTime();
                if (str3 != null) {
                    String strSubstring = str3.substring(0, 1);
                    int i = Integer.parseInt(str3.substring(1, 3));
                    int i2 = Integer.parseInt(str3.substring(4, 6));
                    if ((BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX.equals(strSubstring) || "-".equals(strSubstring)) && ":".equals(str3.substring(3, 4)) && i <= 14) {
                        time += (long) (C18176.m42345(i, 60, i2, 60000) * ("-".equals(strSubstring) ? 1 : -1));
                    }
                }
                if (str2 != null) {
                    try {
                        int iMin = Math.min(str2.length(), 3);
                        j = Long.parseLong(str2.substring(0, iMin));
                        while (iMin < 3) {
                            j *= 10;
                            iMin++;
                        }
                    } catch (NumberFormatException unused) {
                        j = 0;
                    }
                    time += j;
                }
                return Long.valueOf(time);
            } catch (IllegalArgumentException unused2) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Long m23696() {
        String strM23692 = m23692("GPSDateStamp");
        String strM23693 = m23692("GPSTimeStamp");
        if (strM23692 == null || strM23693 == null) {
            return null;
        }
        Pattern pattern = f28848;
        if (!pattern.matcher(strM23692).matches() && !pattern.matcher(strM23693).matches()) {
            return null;
        }
        String strM21875 = C8008.m21875(' ', strM23692, strM23693);
        ParsePosition parsePosition = new ParsePosition(0);
        try {
            Date date = f28859.parse(strM21875, parsePosition);
            if (date == null && (date = f28860.parse(strM21875, parsePosition)) == null) {
                return null;
            }
            return Long.valueOf(date.getTime());
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static double m23660(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d2 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d3 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d2 / 60.0d) + d;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d3;
            }
            return -d3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0140 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:114:0x0143  */
    /* JADX WARN: Code duplicated, block: B:117:0x0149  */
    /* JADX WARN: Code duplicated, block: B:120:0x0151 A[LOOP:2: B:115:0x0144->B:120:0x0151, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:123:0x0157 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:125:0x015a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0160  */
    /* JADX WARN: Code duplicated, block: B:131:0x0167 A[LOOP:3: B:126:0x015b->B:131:0x0167, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:135:0x0170  */
    /* JADX WARN: Code duplicated, block: B:138:0x017b A[LOOP:4: B:133:0x016b->B:138:0x017b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x0181 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:155:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x00d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0179 A[EDGE_INSN: B:168:0x0179->B:137:0x0179 BREAK  A[LOOP:3: B:126:0x015b->B:131:0x0167], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0179 A[EDGE_INSN: B:171:0x0179->B:137:0x0179 BREAK  A[LOOP:3: B:126:0x015b->B:131:0x0167], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:90:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x0124  */
    /* JADX WARN: Code duplicated, block: B:97:0x0126  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m23661(BufferedInputStream bufferedInputStream) throws Throwable {
        C19268 c19268;
        int i;
        C19268 c19269;
        boolean z;
        C19268 c192610;
        boolean z2;
        int i2;
        byte[] bArr;
        boolean z3;
        int i3;
        byte[] bArr2;
        int i4;
        byte[] bArr3;
        boolean z4;
        short s;
        long j;
        bufferedInputStream.mark(OpenAuthTask.Duplex);
        byte[] bArr4 = new byte[OpenAuthTask.Duplex];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i5 = 0;
        while (true) {
            byte[] bArr5 = f28840;
            if (i5 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i5] != bArr5[i5]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i6 = 0; i6 < bytes.length; i6++) {
                    if (bArr4[i6] != bytes[i6]) {
                        try {
                            c19268 = new C19268(bArr4);
                            try {
                                long j2 = c19268.readInt();
                                byte[] bArr6 = new byte[4];
                                c19268.readFully(bArr6);
                                if (Arrays.equals(bArr6, f28847)) {
                                    if (j2 == 1) {
                                        j2 = c19268.readLong();
                                        j = 16;
                                        if (j2 < 16) {
                                        }
                                    } else {
                                        j = 8;
                                    }
                                    long j3 = OpenAuthTask.Duplex;
                                    if (j2 > j3) {
                                        j2 = j3;
                                    }
                                    long j4 = j2 - j;
                                    if (j4 >= 8) {
                                        byte[] bArr7 = new byte[4];
                                        long j5 = 0;
                                        boolean z5 = false;
                                        boolean z6 = false;
                                        boolean z7 = false;
                                        while (true) {
                                            if (j5 < j4 / 4) {
                                                try {
                                                    c19268.readFully(bArr7);
                                                    if (j5 != 1) {
                                                        if (Arrays.equals(bArr7, f28837)) {
                                                            z5 = true;
                                                        } else if (Arrays.equals(bArr7, f28861)) {
                                                            z6 = true;
                                                        } else if (Arrays.equals(bArr7, f28856) || Arrays.equals(bArr7, f28865)) {
                                                            z7 = true;
                                                        }
                                                        if (z5) {
                                                            if (z6) {
                                                                c19268.close();
                                                                i = 12;
                                                            } else if (z7) {
                                                                c19268.close();
                                                                i = 15;
                                                            }
                                                            if (i != 0) {
                                                                return i;
                                                            }
                                                            try {
                                                                c19269 = new C19268(bArr4);
                                                                try {
                                                                    ByteOrder byteOrderM23686 = m23686(c19269);
                                                                    this.f28880 = byteOrderM23686;
                                                                    c19269.m44603(byteOrderM23686);
                                                                    s = c19269.readShort();
                                                                    if (s != 20306 || s == 21330) {
                                                                        z = true;
                                                                    } else {
                                                                        z = false;
                                                                    }
                                                                    c19269.close();
                                                                } catch (Exception unused) {
                                                                    if (c19269 != null) {
                                                                        c19269.close();
                                                                    }
                                                                    z = false;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    if (c19269 != null) {
                                                                        c19269.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception unused2) {
                                                                c19269 = null;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                c19269 = null;
                                                            }
                                                            if (z) {
                                                                return 7;
                                                            }
                                                            try {
                                                                c192610 = new C19268(bArr4);
                                                                try {
                                                                    ByteOrder byteOrderM23687 = m23686(c192610);
                                                                    this.f28880 = byteOrderM23687;
                                                                    c192610.m44603(byteOrderM23687);
                                                                    if (c192610.readShort() == 85) {
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    c192610.close();
                                                                } catch (Exception unused3) {
                                                                    if (c192610 != null) {
                                                                        c192610.close();
                                                                    }
                                                                    z2 = false;
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    if (c192610 != null) {
                                                                        c192610.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception unused4) {
                                                                c192610 = null;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                c192610 = null;
                                                            }
                                                            if (z2) {
                                                                return 10;
                                                            }
                                                            i2 = 0;
                                                            while (true) {
                                                                bArr = f28866;
                                                                if (i2 >= bArr.length) {
                                                                    z3 = true;
                                                                    break;
                                                                }
                                                                if (bArr4[i2] != bArr[i2]) {
                                                                    z3 = false;
                                                                    break;
                                                                }
                                                                i2++;
                                                            }
                                                            if (z3) {
                                                                return 13;
                                                            }
                                                            i3 = 0;
                                                            while (true) {
                                                                bArr2 = f28854;
                                                                if (i3 >= bArr2.length) {
                                                                    i4 = 0;
                                                                    while (true) {
                                                                        bArr3 = f28844;
                                                                        if (i4 >= bArr3.length) {
                                                                            z4 = true;
                                                                            break;
                                                                        }
                                                                        if (bArr4[bArr2.length + i4 + 4] != bArr3[i4]) {
                                                                            break;
                                                                        }
                                                                        i4++;
                                                                    }
                                                                    if (z4) {
                                                                        return 14;
                                                                    }
                                                                    return 0;
                                                                }
                                                                if (bArr4[i3] != bArr2[i3]) {
                                                                    break;
                                                                }
                                                                i3++;
                                                            }
                                                            z4 = false;
                                                            if (z4) {
                                                                return 14;
                                                            }
                                                            return 0;
                                                        }
                                                        continue;
                                                    }
                                                    j5++;
                                                } catch (EOFException unused5) {
                                                    c19268.close();
                                                    i = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused6) {
                                if (c19268 != null) {
                                }
                                i = 0;
                                if (i != 0) {
                                    return i;
                                }
                                c19269 = new C19268(bArr4);
                                ByteOrder byteOrderM23688 = m23686(c19269);
                                this.f28880 = byteOrderM23688;
                                c19269.m44603(byteOrderM23688);
                                s = c19269.readShort();
                                if (s != 20306) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                                c19269.close();
                                if (z) {
                                    return 7;
                                }
                                c192610 = new C19268(bArr4);
                                ByteOrder byteOrderM23689 = m23686(c192610);
                                this.f28880 = byteOrderM23689;
                                c192610.m44603(byteOrderM23689);
                                if (c192610.readShort() == 85) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                c192610.close();
                                if (z2) {
                                    return 10;
                                }
                                i2 = 0;
                                while (true) {
                                    bArr = f28866;
                                    if (i2 >= bArr.length) {
                                        z3 = true;
                                        break;
                                    }
                                    if (bArr4[i2] != bArr[i2]) {
                                        z3 = false;
                                        break;
                                    }
                                    i2++;
                                }
                                if (z3) {
                                    return 13;
                                }
                                i3 = 0;
                                while (true) {
                                    bArr2 = f28854;
                                    if (i3 >= bArr2.length) {
                                        i4 = 0;
                                        while (true) {
                                            bArr3 = f28844;
                                            if (i4 >= bArr3.length) {
                                                z4 = true;
                                                break;
                                            }
                                            if (bArr4[bArr2.length + i4 + 4] != bArr3[i4]) {
                                                break;
                                                break;
                                            }
                                            i4++;
                                        }
                                        if (z4) {
                                            return 14;
                                        }
                                        return 0;
                                    }
                                    if (bArr4[i3] != bArr2[i3]) {
                                        break;
                                        break;
                                    }
                                    i3++;
                                }
                                z4 = false;
                                if (z4) {
                                    return 14;
                                }
                                return 0;
                            } catch (Throwable th5) {
                                th = th5;
                                if (c19268 != null) {
                                    c19268.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused7) {
                            c19268 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            c19268 = null;
                        }
                        c19268.close();
                        i = 0;
                        if (i != 0) {
                            return i;
                        }
                        c19269 = new C19268(bArr4);
                        ByteOrder byteOrderM236810 = m23686(c19269);
                        this.f28880 = byteOrderM236810;
                        c19269.m44603(byteOrderM236810);
                        s = c19269.readShort();
                        if (s != 20306) {
                            z = true;
                        } else {
                            z = true;
                        }
                        c19269.close();
                        if (z) {
                            return 7;
                        }
                        c192610 = new C19268(bArr4);
                        ByteOrder byteOrderM236811 = m23686(c192610);
                        this.f28880 = byteOrderM236811;
                        c192610.m44603(byteOrderM236811);
                        if (c192610.readShort() == 85) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c192610.close();
                        if (z2) {
                            return 10;
                        }
                        i2 = 0;
                        while (true) {
                            bArr = f28866;
                            if (i2 >= bArr.length) {
                                z3 = true;
                                break;
                            }
                            if (bArr4[i2] != bArr[i2]) {
                                z3 = false;
                                break;
                            }
                            i2++;
                        }
                        if (z3) {
                            return 13;
                        }
                        i3 = 0;
                        while (true) {
                            bArr2 = f28854;
                            if (i3 >= bArr2.length) {
                                i4 = 0;
                                while (true) {
                                    bArr3 = f28844;
                                    if (i4 >= bArr3.length) {
                                        z4 = true;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i4 + 4] != bArr3[i4]) {
                                        break;
                                        break;
                                    }
                                    i4++;
                                }
                                if (z4) {
                                    return 14;
                                }
                                return 0;
                            }
                            if (bArr4[i3] != bArr2[i3]) {
                                break;
                                break;
                            }
                            i3++;
                        }
                        z4 = false;
                        if (z4) {
                            return 14;
                        }
                        return 0;
                    }
                }
                return 9;
            }
            i5++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0107 A[LOOP:0: B:10:0x0024->B:56:0x0107, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x010d A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23669(l.C19268 r18, int r19, int r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8826.m23669(l.ᩳᩴۙ, int, int):void");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m23683(C2860 c2860) throws IOException {
        m23680(c2860);
        m23684(c2860, 0);
        m23674(c2860, 0);
        m23674(c2860, 5);
        m23674(c2860, 4);
        m23679();
        if (this.f28876 == 8) {
            HashMap[] mapArr = this.f28874;
            C10317 c10317 = (C10317) mapArr[1].get("MakerNote");
            if (c10317 != null) {
                C2860 c2861 = new C2860(c10317.f32916);
                c2861.m44603(this.f28880);
                c2861.m44602(6);
                m23684(c2861, 9);
                C10317 c10318 = (C10317) mapArr[9].get("ColorSpace");
                if (c10318 != null) {
                    mapArr[1].put("ColorSpace", c10318);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m23685(C19268 c19268) throws IOException {
        if (f28864) {
            C17359.toString(c19268);
        }
        c19268.m44602(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c19268.readFully(bArr);
        c19268.readFully(bArr2);
        c19268.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c19268.m44602(i - c19268.f62307);
        c19268.readFully(bArr4);
        m23669(new C19268(bArr4), i, 5);
        c19268.m44602(i3 - c19268.f62307);
        c19268.m44603(ByteOrder.BIG_ENDIAN);
        int i4 = c19268.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c19268.readUnsignedShort();
            int unsignedShort2 = c19268.readUnsignedShort();
            if (unsignedShort == f28863.f4871) {
                short s = c19268.readShort();
                short s2 = c19268.readShort();
                C10317 c10317M26584 = C10317.m26584((int) s, this.f28880);
                C10317 c10317M26585 = C10317.m26584((int) s2, this.f28880);
                HashMap[] mapArr = this.f28874;
                mapArr[0].put("ImageLength", c10317M26584);
                mapArr[0].put("ImageWidth", c10317M26585);
                return;
            }
            c19268.m44602(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23667(C2860 c2860, int i) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i == 15 && i3 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                C7335.m20103(mediaMetadataRetriever, new C8081(c2860));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f28874;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C10317.m26584(Integer.parseInt(strExtractMetadata), this.f28880));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", C10317.m26584(Integer.parseInt(strExtractMetadata3), this.f28880));
                }
                if (strExtractMetadata2 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata2);
                    if (i4 == 90) {
                        i2 = 6;
                    } else if (i4 != 180) {
                        i2 = i4 != 270 ? 1 : 8;
                    } else {
                        i2 = 3;
                    }
                    mapArr[0].put("Orientation", C10317.m26584(i2, this.f28880));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata4);
                    int i6 = Integer.parseInt(strExtractMetadata5);
                    if (i6 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c2860.seek(i5);
                    byte[] bArr = new byte[6];
                    c2860.readFully(bArr);
                    int i7 = i5 + 6;
                    int i8 = i6 - 6;
                    if (!Arrays.equals(bArr, f28862)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i8];
                    c2860.readFully(bArr2);
                    this.f28873 = i7;
                    m23665(0, bArr2);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i9 = Integer.parseInt(strExtractMetadata8);
                    int i10 = Integer.parseInt(strExtractMetadata9);
                    long j = i9;
                    c2860.seek(j);
                    byte[] bArr3 = new byte[i10];
                    c2860.readFully(bArr3);
                    this.f28879 = new C10317(j, bArr3, 1, i10);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m23687(C2860 c2860) throws IOException {
        byte[] bArr = f28862;
        byte[] bArr2 = new byte[bArr.length];
        c2860.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            return false;
        }
        byte[] bArrCopyOf = new byte[1024];
        int i = 0;
        while (true) {
            if (i == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            int i2 = c2860.f62311.read(bArrCopyOf, i, bArrCopyOf.length - i);
            if (i2 != -1) {
                i += i2;
                c2860.f62307 += i2;
            } else {
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i);
                this.f28873 = bArr.length;
                m23665(0, bArrCopyOf2);
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23666(C2860 c2860) throws IOException {
        int i;
        int i2;
        m23683(c2860);
        HashMap[] mapArr = this.f28874;
        C10317 c10317 = (C10317) mapArr[1].get("MakerNote");
        if (c10317 != null) {
            C2860 c2861 = new C2860(c10317.f32916);
            c2861.m44603(this.f28880);
            byte[] bArr = f28846;
            byte[] bArr2 = new byte[bArr.length];
            c2861.readFully(bArr2);
            c2861.seek(0L);
            byte[] bArr3 = f28855;
            byte[] bArr4 = new byte[bArr3.length];
            c2861.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c2861.seek(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c2861.seek(12L);
            }
            m23684(c2861, 6);
            C10317 c10318 = (C10317) mapArr[7].get("PreviewImageStart");
            C10317 c10319 = (C10317) mapArr[7].get("PreviewImageLength");
            if (c10318 != null && c10319 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c10318);
                mapArr[5].put("JPEGInterchangeFormatLength", c10319);
            }
            C10317 c103110 = (C10317) mapArr[8].get("AspectFrame");
            if (c103110 != null) {
                int[] iArr = (int[]) c103110.m26591(this.f28880);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                C10317 c10317M26584 = C10317.m26584(i5, this.f28880);
                C10317 c10317M26585 = C10317.m26584(i6, this.f28880);
                mapArr[0].put("ImageWidth", c10317M26584);
                mapArr[0].put("ImageLength", c10317M26585);
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m23673(C2860 c2860) throws IOException {
        if (f28864) {
            C17359.toString(c2860);
        }
        m23683(c2860);
        HashMap[] mapArr = this.f28874;
        C10317 c10317 = (C10317) mapArr[0].get("JpgFromRaw");
        if (c10317 != null) {
            m23669(new C19268(c10317.f32916), (int) c10317.f32918, 5);
        }
        C10317 c10318 = (C10317) mapArr[0].get("ISO");
        C10317 c10319 = (C10317) mapArr[1].get("PhotographicSensitivity");
        if (c10318 == null || c10319 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c10318);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23668(C19268 c19268) throws IOException {
        if (f28864) {
            C17359.toString(c19268);
        }
        c19268.m44603(ByteOrder.BIG_ENDIAN);
        int i = c19268.f62307;
        c19268.m44602(f28866.length);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (z && z2) {
                return;
            }
            try {
                int i2 = c19268.readInt();
                int i3 = c19268.readInt();
                int i4 = c19268.f62307;
                int i5 = i4 + i2 + 4;
                int i6 = i4 - i;
                if (i6 == 16 && i3 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i3 == 1229278788) {
                    return;
                }
                if (i3 == 1700284774 && !z) {
                    this.f28873 = i6;
                    byte[] bArr = new byte[i2];
                    c19268.readFully(bArr);
                    int i7 = c19268.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i3 >>> 24);
                    crc32.update(i3 >>> 16);
                    crc32.update(i3 >>> 8);
                    crc32.update(i3);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i7) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i7 + ", calculated CRC value: " + crc32.getValue());
                    }
                    m23665(0, bArr);
                    m23679();
                    m23681(new C19268(bArr));
                    z = true;
                } else if (i3 == 1767135348 && !z2) {
                    byte[] bArr2 = f28843;
                    if (i2 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        c19268.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i8 = c19268.f62307 - i;
                            int i9 = i2 - length;
                            byte[] bArr4 = new byte[i9];
                            c19268.readFully(bArr4);
                            this.f28879 = new C10317(i8, bArr4, 1, i9);
                            z2 = true;
                        }
                    }
                }
                c19268.m44602(i5 - c19268.f62307);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m23675(C19268 c19268) throws IOException {
        if (f28864) {
            C17359.toString(c19268);
        }
        c19268.m44603(ByteOrder.LITTLE_ENDIAN);
        c19268.m44602(f28854.length);
        int i = c19268.readInt() + 8;
        byte[] bArr = f28844;
        c19268.m44602(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c19268.readFully(bArr2);
                int i2 = c19268.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f28857, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i2];
                    c19268.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f28862;
                    if (C14046.m34208(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i2);
                    }
                    this.f28873 = i3;
                    m23665(0, bArrCopyOfRange);
                    m23681(new C19268(bArrCopyOfRange));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c19268.m44602(i2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23665(int i, byte[] bArr) throws IOException {
        C2860 c2860 = new C2860(bArr);
        m23680(c2860);
        m23684(c2860, i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m23676() {
        String strM23692 = m23692("DateTimeOriginal");
        HashMap[] mapArr = this.f28874;
        if (strM23692 != null && m23692("DateTime") == null) {
            mapArr[0].put("DateTime", C10317.m26586(strM23692));
        }
        if (m23692("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C10317.m26585(0L, this.f28880));
        }
        if (m23692("ImageLength") == null) {
            mapArr[0].put("ImageLength", C10317.m26585(0L, this.f28880));
        }
        if (m23692("Orientation") == null) {
            mapArr[0].put("Orientation", C10317.m26585(0L, this.f28880));
        }
        if (m23692("LightSource") == null) {
            mapArr[1].put("LightSource", C10317.m26585(0L, this.f28880));
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static ByteOrder m23686(C19268 c19268) throws IOException {
        short s = c19268.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException(C4791.m14766(new StringBuilder("Invalid byte order: "), s));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m23680(C2860 c2860) throws IOException {
        ByteOrder byteOrderM23686 = m23686((C19268) c2860);
        this.f28880 = byteOrderM23686;
        c2860.m44603(byteOrderM23686);
        int unsignedShort = c2860.readUnsignedShort();
        int i = this.f28876;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException(C4791.m14766(new StringBuilder("Invalid start code: "), unsignedShort));
        }
        int i2 = c2860.readInt();
        if (i2 < 8) {
            throw new IOException(C13645.m33382(i2, "Invalid first Ifd offset: "));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c2860.m44602(i3);
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m23681(C19268 c19268) throws IOException {
        C10317 c10317;
        HashMap map = this.f28874[4];
        C10317 c10318 = (C10317) map.get("Compression");
        if (c10318 != null) {
            int iM26590 = c10318.m26590(this.f28880);
            if (iM26590 != 1) {
                if (iM26590 == 6) {
                    m23670(c19268, map);
                    return;
                } else if (iM26590 != 7) {
                    return;
                }
            }
            C10317 c10319 = (C10317) map.get("BitsPerSample");
            if (c10319 != null) {
                int[] iArr = (int[]) c10319.m26591(this.f28880);
                int[] iArr2 = f28841;
                if (!Arrays.equals(iArr2, iArr)) {
                    if (this.f28876 != 3 || (c10317 = (C10317) map.get("PhotometricInterpretation")) == null) {
                        return;
                    }
                    int iM26591 = c10317.m26590(this.f28880);
                    if ((iM26591 != 1 || !Arrays.equals(iArr, f28868)) && (iM26591 != 6 || !Arrays.equals(iArr, iArr2))) {
                        return;
                    }
                }
                C10317 c103110 = (C10317) map.get("StripOffsets");
                C10317 c103111 = (C10317) map.get("StripByteCounts");
                if (c103110 == null || c103111 == null) {
                    return;
                }
                long[] jArrM34209 = C14046.m34209(c103110.m26591(this.f28880));
                long[] jArrM342010 = C14046.m34209(c103111.m26591(this.f28880));
                if (jArrM34209 == null || jArrM34209.length == 0 || jArrM342010 == null || jArrM342010.length == 0 || jArrM34209.length != jArrM342010.length) {
                    return;
                }
                long j = 0;
                for (long j2 : jArrM342010) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f28872 = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrM34209.length; i3++) {
                    int i4 = (int) jArrM34209[i3];
                    int i5 = (int) jArrM342010[i3];
                    if (i3 < jArrM34209.length - 1 && i4 + i5 != jArrM34209[i3 + 1]) {
                        this.f28872 = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        return;
                    }
                    try {
                        c19268.m44602(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        c19268.readFully(bArr2);
                        i = i7 + i5;
                        System.arraycopy(bArr2, 0, bArr, i2, i5);
                        i2 += i5;
                    } catch (EOFException unused) {
                        return;
                    }
                }
                if (this.f28872) {
                    long j3 = jArrM34209[0];
                    return;
                }
                return;
            }
            return;
        }
        m23670(c19268, map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23670(C19268 c19268, HashMap map) throws IOException {
        C10317 c10317 = (C10317) map.get("JPEGInterchangeFormat");
        C10317 c10318 = (C10317) map.get("JPEGInterchangeFormatLength");
        if (c10317 == null || c10318 == null) {
            return;
        }
        int iM26590 = c10317.m26590(this.f28880);
        int iM26591 = c10318.m26590(this.f28880);
        if (this.f28876 == 7) {
            iM26590 += this.f28871;
        }
        if (iM26590 <= 0 || iM26591 <= 0 || this.f28881 != null || this.f28878 != null) {
            return;
        }
        c19268.m44602(iM26590);
        c19268.readFully(new byte[iM26591]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m23671(HashMap map) {
        C10317 c10317 = (C10317) map.get("ImageLength");
        C10317 c10318 = (C10317) map.get("ImageWidth");
        if (c10317 == null || c10318 == null) {
            return false;
        }
        return c10317.m26590(this.f28880) <= 512 && c10318.m26590(this.f28880) <= 512;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m23679() {
        m23663(0, 5);
        m23663(0, 4);
        m23663(5, 4);
        HashMap[] mapArr = this.f28874;
        C10317 c10317 = (C10317) mapArr[1].get("PixelXDimension");
        C10317 c10318 = (C10317) mapArr[1].get("PixelYDimension");
        if (c10317 != null && c10318 != null) {
            mapArr[0].put("ImageWidth", c10317);
            mapArr[0].put("ImageLength", c10318);
        }
        if (mapArr[4].isEmpty() && m23671(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        m23671(mapArr[4]);
        m23664(0, "ThumbnailOrientation", "Orientation");
        m23664(0, "ThumbnailImageLength", "ImageLength");
        m23664(0, "ThumbnailImageWidth", "ImageWidth");
        m23664(5, "ThumbnailOrientation", "Orientation");
        m23664(5, "ThumbnailImageLength", "ImageLength");
        m23664(5, "ThumbnailImageWidth", "ImageWidth");
        m23664(4, "Orientation", "ThumbnailOrientation");
        m23664(4, "ImageLength", "ThumbnailImageLength");
        m23664(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m23674(C2860 c2860, int i) throws IOException {
        C10317 c10317M26584;
        C10317 c10317M26585;
        HashMap[] mapArr = this.f28874;
        C10317 c10317 = (C10317) mapArr[i].get("DefaultCropSize");
        C10317 c10318 = (C10317) mapArr[i].get("SensorTopBorder");
        C10317 c10319 = (C10317) mapArr[i].get("SensorLeftBorder");
        C10317 c103110 = (C10317) mapArr[i].get("SensorBottomBorder");
        C10317 c103111 = (C10317) mapArr[i].get("SensorRightBorder");
        if (c10317 != null) {
            if (c10317.f32917 == 5) {
                C9571[] c9571Arr = (C9571[]) c10317.m26591(this.f28880);
                if (c9571Arr == null || c9571Arr.length != 2) {
                    Arrays.toString(c9571Arr);
                    return;
                } else {
                    c10317M26584 = C10317.m26587(c9571Arr[0], this.f28880);
                    c10317M26585 = C10317.m26587(c9571Arr[1], this.f28880);
                }
            } else {
                int[] iArr = (int[]) c10317.m26591(this.f28880);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    c10317M26584 = C10317.m26584(iArr[0], this.f28880);
                    c10317M26585 = C10317.m26584(iArr[1], this.f28880);
                }
            }
            mapArr[i].put("ImageWidth", c10317M26584);
            mapArr[i].put("ImageLength", c10317M26585);
            return;
        }
        if (c10318 == null || c10319 == null || c103110 == null || c103111 == null) {
            C10317 c103112 = (C10317) mapArr[i].get("ImageLength");
            C10317 c103113 = (C10317) mapArr[i].get("ImageWidth");
            if (c103112 == null || c103113 == null) {
                C10317 c103114 = (C10317) mapArr[i].get("JPEGInterchangeFormat");
                C10317 c103115 = (C10317) mapArr[i].get("JPEGInterchangeFormatLength");
                if (c103114 == null || c103115 == null) {
                    return;
                }
                int iM26590 = c103114.m26590(this.f28880);
                int iM26591 = c103114.m26590(this.f28880);
                c2860.seek(iM26590);
                byte[] bArr = new byte[iM26591];
                c2860.readFully(bArr);
                m23669(new C19268(bArr), iM26590, i);
                return;
            }
            return;
        }
        int iM26592 = c10318.m26590(this.f28880);
        int iM26593 = c103110.m26590(this.f28880);
        int iM26594 = c103111.m26590(this.f28880);
        int iM26595 = c10319.m26590(this.f28880);
        if (iM26593 <= iM26592 || iM26594 <= iM26595) {
            return;
        }
        C10317 c10317M26586 = C10317.m26584(iM26593 - iM26592, this.f28880);
        C10317 c10317M26587 = C10317.m26584(iM26594 - iM26595, this.f28880);
        mapArr[i].put("ImageLength", c10317M26586);
        mapArr[i].put("ImageWidth", c10317M26587);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:16:0x0077  */
    /* JADX WARN: Code duplicated, block: B:98:0x0197  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m23684(C2860 c2860, int i) throws IOException {
        boolean z;
        HashMap[] mapArr;
        short s;
        short s2;
        long j;
        int i2;
        boolean z2;
        HashSet hashSet;
        int unsignedShort;
        long j2;
        Integer numValueOf = Integer.valueOf(c2860.f62307);
        HashSet hashSet2 = this.f28882;
        hashSet2.add(numValueOf);
        short s3 = c2860.readShort();
        if (s3 <= 0) {
            return;
        }
        short s4 = 0;
        while (true) {
            z = f28864;
            mapArr = this.f28874;
            if (s4 >= s3) {
                break;
            }
            int unsignedShort2 = c2860.readUnsignedShort();
            int unsignedShort3 = c2860.readUnsignedShort();
            int i3 = c2860.readInt();
            long j3 = ((long) c2860.f62307) + 4;
            C1369 c1369 = (C1369) f28852[i].get(Integer.valueOf(unsignedShort2));
            if (z) {
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), c1369 != null ? c1369.f4869 : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i3));
            }
            if (c1369 != null && unsignedShort3 > 0) {
                int[] iArr = f28838;
                if (unsignedShort3 >= iArr.length) {
                    s = s3;
                    s2 = s4;
                } else {
                    int i4 = c1369.f4870;
                    s = s3;
                    if (i4 == 7 || unsignedShort3 == 7 || i4 == unsignedShort3 || (i2 = c1369.f4872) == unsignedShort3) {
                        s2 = s4;
                    } else {
                        s2 = s4;
                        if (((i4 != 4 && i2 != 4) || unsignedShort3 != 3) && (((i4 != 9 && i2 != 9) || unsignedShort3 != 8) && ((i4 != 12 && i2 != 12) || unsignedShort3 != 11))) {
                            if (z) {
                                String str = f28849[unsignedShort3];
                            }
                        }
                    }
                    HashSet hashSet3 = hashSet2;
                    if (unsignedShort3 == 7) {
                        unsignedShort3 = i4;
                    }
                    hashSet2 = hashSet3;
                    j = ((long) iArr[unsignedShort3]) * ((long) i3);
                    z2 = j >= 0 && j <= 2147483647L;
                }
                j = 0;
            } else {
                s = s3;
                s2 = s4;
                j = 0;
            }
            if (z2) {
                if (j > 4) {
                    int i5 = c2860.readInt();
                    if (this.f28876 == 7) {
                        if ("MakerNote".equals(c1369.f4869)) {
                            this.f28871 = i5;
                        } else if (i == 6 && "ThumbnailImage".equals(c1369.f4869)) {
                            this.f28883 = i5;
                            this.f28875 = i3;
                            C10317 c10317M26584 = C10317.m26584(6, this.f28880);
                            C10317 c10317M26585 = C10317.m26585(this.f28883, this.f28880);
                            C10317 c10317M26586 = C10317.m26585(this.f28875, this.f28880);
                            mapArr[4].put("Compression", c10317M26584);
                            mapArr[4].put("JPEGInterchangeFormat", c10317M26585);
                            mapArr[4].put("JPEGInterchangeFormatLength", c10317M26586);
                        }
                    }
                    c2860.seek(i5);
                } else {
                    j3 = j3;
                }
                Integer num = (Integer) f28839.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j2 = ((long) c2860.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            unsignedShort = c2860.readShort();
                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                            unsignedShort = c2860.readInt();
                        } else {
                            j2 = -1;
                        }
                        if (z) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(j2), c1369.f4869);
                        }
                        if (j2 > 0 || (c2860.length() != -1 && j2 >= c2860.length())) {
                            hashSet = hashSet2;
                        } else {
                            hashSet = hashSet2;
                            if (!hashSet.contains(Integer.valueOf((int) j2))) {
                                c2860.seek(j2);
                                m23684(c2860, num.intValue());
                            }
                        }
                        c2860.seek(j3);
                    } else {
                        unsignedShort = c2860.readUnsignedShort();
                    }
                    j2 = unsignedShort;
                    if (z) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(j2), c1369.f4869);
                    }
                    if (j2 > 0) {
                        hashSet = hashSet2;
                    } else {
                        hashSet = hashSet2;
                    }
                    c2860.seek(j3);
                } else {
                    hashSet = hashSet2;
                    int i6 = c2860.f62307 + this.f28873;
                    byte[] bArr = new byte[(int) j];
                    c2860.readFully(bArr);
                    long j4 = j3;
                    C10317 c10317 = new C10317(i6, bArr, unsignedShort3, i3);
                    HashMap map = mapArr[i];
                    String str2 = c1369.f4869;
                    map.put(str2, c10317);
                    if ("DNGVersion".equals(str2)) {
                        this.f28876 = 3;
                    }
                    if ((("Make".equals(str2) || "Model".equals(str2)) && c10317.m26589(this.f28880).contains("PENTAX")) || ("Compression".equals(str2) && c10317.m26590(this.f28880) == 65535)) {
                        this.f28876 = 8;
                    }
                    if (c2860.f62307 != j4) {
                        c2860.seek(j4);
                    }
                }
            } else {
                c2860.seek(j3);
                hashSet = hashSet2;
            }
            s4 = (short) (s2 + 1);
            hashSet2 = hashSet;
            s3 = s;
        }
        HashSet hashSet4 = hashSet2;
        int i7 = c2860.readInt();
        if (z) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i7));
        }
        long j5 = i7;
        if (j5 <= 0 || hashSet4.contains(Integer.valueOf(i7))) {
            return;
        }
        c2860.seek(j5);
        if (mapArr[4].isEmpty()) {
            m23684(c2860, 4);
        } else if (mapArr[5].isEmpty()) {
            m23684(c2860, 5);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23663(int i, int i2) {
        HashMap[] mapArr = this.f28874;
        if (mapArr[i].isEmpty() || mapArr[i2].isEmpty()) {
            return;
        }
        C10317 c10317 = (C10317) mapArr[i].get("ImageLength");
        C10317 c10318 = (C10317) mapArr[i].get("ImageWidth");
        C10317 c10319 = (C10317) mapArr[i2].get("ImageLength");
        C10317 c103110 = (C10317) mapArr[i2].get("ImageWidth");
        if (c10317 == null || c10318 == null || c10319 == null || c103110 == null) {
            return;
        }
        int iM26590 = c10317.m26590(this.f28880);
        int iM26591 = c10318.m26590(this.f28880);
        int iM26592 = c10319.m26590(this.f28880);
        int iM26593 = c103110.m26590(this.f28880);
        if (iM26590 >= iM26592 || iM26591 >= iM26593) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23664(int i, String str, String str2) {
        HashMap[] mapArr = this.f28874;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, (C10317) map.get(str));
        mapArr[i].remove(str);
    }
}
