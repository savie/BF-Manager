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

/* JADX INFO: renamed from: l.ۗۚۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 057Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C3021 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f11281;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f11284;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final C14312 f11286;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final byte[] f11287;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap[] f11288;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C14312[][] f11289;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final byte[] f11291;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C14312[] f11293;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f11294;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final Set f11295;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final SimpleDateFormat f11300;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final byte[] f11303;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Charset f11304;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final SimpleDateFormat f11309;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap[] f11311;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final String[] f11312;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f11313;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashSet f11314;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f11315;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f11316;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ByteOrder f11317;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f11318;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap[] f11319;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f11320;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AssetManager.AssetInputStream f11321;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public FileDescriptor f11322;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23484 f11323;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f11324;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f11325;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final boolean f11306 = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final List f11282 = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final List f11308 = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final int[] f11290 = {8, 8, 8};

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final int[] f11305 = {8};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final byte[] f11299 = {-1, -40, -1};

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final byte[] f11296 = {102, 116, 121, KeyFactorySpi.Ed25519_type};

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final byte[] f11302 = {109, 105, 102, 49};

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final byte[] f11279 = {104, 101, 105, 99};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final byte[] f11301 = {97, 118, 105, 102};

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final byte[] f11307 = {97, 118, 105, 115};

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final byte[] f11292 = {79, 76, 89, 77, UTF8.S_P4A, 0};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final byte[] f11283 = {79, 76, 89, 77, UTF8.S_P4A, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f11298 = {-119, UTF8.S_P4A, 78, 71, cb.k, 10, 26, 10};

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f11285 = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f11280 = {82, 73, 70, 70};

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f11297 = {87, 69, 66, UTF8.S_P4A};

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f11310 = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f11312 = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f11294 = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f11291 = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C14312[] c14312Arr = {new C14312("NewSubfileType", Scalar25519.TARGET_LENGTH, 4), new C14312("SubfileType", 255, 4), new C14312("ImageWidth", 256, 3, 4), new C14312("ImageLength", 257, 3, 4), new C14312("BitsPerSample", 258, 3), new C14312("Compression", 259, 3), new C14312("PhotometricInterpretation", 262, 3), new C14312("ImageDescription", BottomAppBarTopEdgeTreatment.ANGLE_UP, 2), new C14312("Make", 271, 2), new C14312("Model", 272, 2), new C14312("StripOffsets", 273, 3, 4), new C14312("Orientation", 274, 3), new C14312("SamplesPerPixel", 277, 3), new C14312("RowsPerStrip", 278, 3, 4), new C14312("StripByteCounts", 279, 3, 4), new C14312("XResolution", 282, 5), new C14312("YResolution", 283, 5), new C14312("PlanarConfiguration", 284, 3), new C14312("ResolutionUnit", 296, 3), new C14312("TransferFunction", 301, 3), new C14312("Software", 305, 2), new C14312("DateTime", 306, 2), new C14312("Artist", 315, 2), new C14312("WhitePoint", 318, 5), new C14312("PrimaryChromaticities", 319, 5), new C14312("SubIFDPointer", 330, 4), new C14312("JPEGInterchangeFormat", 513, 4), new C14312("JPEGInterchangeFormatLength", 514, 4), new C14312("YCbCrCoefficients", 529, 5), new C14312("YCbCrSubSampling", 530, 3), new C14312("YCbCrPositioning", 531, 3), new C14312("ReferenceBlackWhite", 532, 5), new C14312("Copyright", 33432, 2), new C14312("ExifIFDPointer", 34665, 4), new C14312("GPSInfoIFDPointer", 34853, 4), new C14312("SensorTopBorder", 4, 4), new C14312("SensorLeftBorder", 5, 4), new C14312("SensorBottomBorder", 6, 4), new C14312("SensorRightBorder", 7, 4), new C14312("ISO", 23, 3), new C14312("JpgFromRaw", 46, 7), new C14312("Xmp", 700, 1)};
        C14312[] c14312Arr2 = {new C14312("ExposureTime", 33434, 5), new C14312("FNumber", 33437, 5), new C14312("ExposureProgram", 34850, 3), new C14312("SpectralSensitivity", 34852, 2), new C14312("PhotographicSensitivity", 34855, 3), new C14312("OECF", 34856, 7), new C14312("SensitivityType", 34864, 3), new C14312("StandardOutputSensitivity", 34865, 4), new C14312("RecommendedExposureIndex", 34866, 4), new C14312("ISOSpeed", 34867, 4), new C14312("ISOSpeedLatitudeyyy", 34868, 4), new C14312("ISOSpeedLatitudezzz", 34869, 4), new C14312("ExifVersion", UMModuleRegister.INNER_EVENT_VALUE_HIGH, 2), new C14312("DateTimeOriginal", 36867, 2), new C14312("DateTimeDigitized", 36868, 2), new C14312("OffsetTime", 36880, 2), new C14312("OffsetTimeOriginal", 36881, 2), new C14312("OffsetTimeDigitized", 36882, 2), new C14312("ComponentsConfiguration", UMModuleRegister.APPSTATUS_SWITCH_LOW, 7), new C14312("CompressedBitsPerPixel", 37122, 5), new C14312("ShutterSpeedValue", 37377, 10), new C14312("ApertureValue", 37378, 5), new C14312("BrightnessValue", 37379, 10), new C14312("ExposureBiasValue", 37380, 10), new C14312("MaxApertureValue", 37381, 5), new C14312("SubjectDistance", 37382, 5), new C14312("MeteringMode", 37383, 3), new C14312("LightSource", 37384, 3), new C14312("Flash", 37385, 3), new C14312("FocalLength", 37386, 5), new C14312("SubjectArea", 37396, 3), new C14312("MakerNote", 37500, 7), new C14312("UserComment", 37510, 7), new C14312("SubSecTime", 37520, 2), new C14312("SubSecTimeOriginal", 37521, 2), new C14312("SubSecTimeDigitized", 37522, 2), new C14312("FlashpixVersion", 40960, 7), new C14312("ColorSpace", 40961, 3), new C14312("PixelXDimension", 40962, 3, 4), new C14312("PixelYDimension", 40963, 3, 4), new C14312("RelatedSoundFile", 40964, 2), new C14312("InteroperabilityIFDPointer", 40965, 4), new C14312("FlashEnergy", 41483, 5), new C14312("SpatialFrequencyResponse", 41484, 7), new C14312("FocalPlaneXResolution", 41486, 5), new C14312("FocalPlaneYResolution", 41487, 5), new C14312("FocalPlaneResolutionUnit", 41488, 3), new C14312("SubjectLocation", 41492, 3), new C14312("ExposureIndex", 41493, 5), new C14312("SensingMethod", 41495, 3), new C14312("FileSource", 41728, 7), new C14312("SceneType", 41729, 7), new C14312("CFAPattern", 41730, 7), new C14312("CustomRendered", 41985, 3), new C14312("ExposureMode", 41986, 3), new C14312("WhiteBalance", 41987, 3), new C14312("DigitalZoomRatio", 41988, 5), new C14312("FocalLengthIn35mmFilm", 41989, 3), new C14312("SceneCaptureType", 41990, 3), new C14312("GainControl", 41991, 3), new C14312("Contrast", 41992, 3), new C14312("Saturation", 41993, 3), new C14312("Sharpness", 41994, 3), new C14312("DeviceSettingDescription", 41995, 7), new C14312("SubjectDistanceRange", 41996, 3), new C14312("ImageUniqueID", 42016, 2), new C14312("CameraOwnerName", 42032, 2), new C14312("BodySerialNumber", 42033, 2), new C14312("LensSpecification", 42034, 5), new C14312("LensMake", 42035, 2), new C14312("LensModel", 42036, 2), new C14312("Gamma", 42240, 5), new C14312("DNGVersion", 50706, 1), new C14312("DefaultCropSize", 50720, 3, 4)};
        C14312[] c14312Arr3 = {new C14312("GPSVersionID", 0, 1), new C14312("GPSLatitudeRef", 1, 2), new C14312("GPSLatitude", 2, 5, 10), new C14312("GPSLongitudeRef", 3, 2), new C14312("GPSLongitude", 4, 5, 10), new C14312("GPSAltitudeRef", 5, 1), new C14312("GPSAltitude", 6, 5), new C14312("GPSTimeStamp", 7, 5), new C14312("GPSSatellites", 8, 2), new C14312("GPSStatus", 9, 2), new C14312("GPSMeasureMode", 10, 2), new C14312("GPSDOP", 11, 5), new C14312("GPSSpeedRef", 12, 2), new C14312("GPSSpeed", 13, 5), new C14312("GPSTrackRef", 14, 2), new C14312("GPSTrack", 15, 5), new C14312("GPSImgDirectionRef", 16, 2), new C14312("GPSImgDirection", 17, 5), new C14312("GPSMapDatum", 18, 2), new C14312("GPSDestLatitudeRef", 19, 2), new C14312("GPSDestLatitude", 20, 5), new C14312("GPSDestLongitudeRef", 21, 2), new C14312("GPSDestLongitude", 22, 5), new C14312("GPSDestBearingRef", 23, 2), new C14312("GPSDestBearing", 24, 5), new C14312("GPSDestDistanceRef", 25, 2), new C14312("GPSDestDistance", 26, 5), new C14312("GPSProcessingMethod", 27, 7), new C14312("GPSAreaInformation", 28, 7), new C14312("GPSDateStamp", 29, 2), new C14312("GPSDifferential", 30, 3), new C14312("GPSHPositioningError", 31, 5)};
        C14312[] c14312Arr4 = {new C14312("InteroperabilityIndex", 1, 2)};
        C14312[] c14312Arr5 = {new C14312("NewSubfileType", Scalar25519.TARGET_LENGTH, 4), new C14312("SubfileType", 255, 4), new C14312("ThumbnailImageWidth", 256, 3, 4), new C14312("ThumbnailImageLength", 257, 3, 4), new C14312("BitsPerSample", 258, 3), new C14312("Compression", 259, 3), new C14312("PhotometricInterpretation", 262, 3), new C14312("ImageDescription", BottomAppBarTopEdgeTreatment.ANGLE_UP, 2), new C14312("Make", 271, 2), new C14312("Model", 272, 2), new C14312("StripOffsets", 273, 3, 4), new C14312("ThumbnailOrientation", 274, 3), new C14312("SamplesPerPixel", 277, 3), new C14312("RowsPerStrip", 278, 3, 4), new C14312("StripByteCounts", 279, 3, 4), new C14312("XResolution", 282, 5), new C14312("YResolution", 283, 5), new C14312("PlanarConfiguration", 284, 3), new C14312("ResolutionUnit", 296, 3), new C14312("TransferFunction", 301, 3), new C14312("Software", 305, 2), new C14312("DateTime", 306, 2), new C14312("Artist", 315, 2), new C14312("WhitePoint", 318, 5), new C14312("PrimaryChromaticities", 319, 5), new C14312("SubIFDPointer", 330, 4), new C14312("JPEGInterchangeFormat", 513, 4), new C14312("JPEGInterchangeFormatLength", 514, 4), new C14312("YCbCrCoefficients", 529, 5), new C14312("YCbCrSubSampling", 530, 3), new C14312("YCbCrPositioning", 531, 3), new C14312("ReferenceBlackWhite", 532, 5), new C14312("Copyright", 33432, 2), new C14312("ExifIFDPointer", 34665, 4), new C14312("GPSInfoIFDPointer", 34853, 4), new C14312("DNGVersion", 50706, 1), new C14312("DefaultCropSize", 50720, 3, 4)};
        f11286 = new C14312("StripOffsets", 273, 3);
        f11289 = new C14312[][]{c14312Arr, c14312Arr2, c14312Arr3, c14312Arr4, c14312Arr5, c14312Arr, new C14312[]{new C14312("ThumbnailImage", 256, 7), new C14312("CameraSettingsIFDPointer", 8224, 4), new C14312("ImageProcessingIFDPointer", 8256, 4)}, new C14312[]{new C14312("PreviewImageStart", 257, 4), new C14312("PreviewImageLength", 258, 4)}, new C14312[]{new C14312("AspectFrame", 4371, 3)}, new C14312[]{new C14312("ColorSpace", 55, 3)}};
        f11293 = new C14312[]{new C14312("SubIFDPointer", 330, 4), new C14312("ExifIFDPointer", 34665, 4), new C14312("GPSInfoIFDPointer", 34853, 4), new C14312("InteroperabilityIFDPointer", 40965, 4), new C14312("CameraSettingsIFDPointer", 8224, 1), new C14312("ImageProcessingIFDPointer", 8256, 1)};
        f11288 = new HashMap[10];
        f11311 = new HashMap[10];
        f11295 = C0561.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f11284 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f11304 = charsetForName;
        f11303 = "Exif\u0000\u0000".getBytes(charsetForName);
        f11287 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f11300 = simpleDateFormat;
        simpleDateFormat.setTimeZone(C12557.getTimeZone(UtcDates.UTC));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f11309 = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(C12557.getTimeZone(UtcDates.UTC));
        int i = 0;
        while (true) {
            C14312[][] c14312Arr6 = f11289;
            if (i < c14312Arr6.length) {
                f11288[i] = new HashMap();
                f11311[i] = new HashMap();
                for (C14312 c14312 : c14312Arr6[i]) {
                    f11288[i].put(Integer.valueOf(c14312.f46880), c14312);
                    f11311[i].put(c14312.f46878, c14312);
                }
                i++;
            } else {
                HashMap map = f11284;
                C14312[] c14312Arr7 = f11293;
                map.put(Integer.valueOf(c14312Arr7[0].f46880), 5);
                map.put(Integer.valueOf(c14312Arr7[1].f46880), 1);
                map.put(Integer.valueOf(c14312Arr7[2].f46880), 2);
                map.put(Integer.valueOf(c14312Arr7[3].f46880), 3);
                map.put(Integer.valueOf(c14312Arr7[4].f46880), 7);
                map.put(Integer.valueOf(c14312Arr7[5].f46880), 8);
                f11281 = Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public C3021(InputStream inputStream, int i) {
        C14312[][] c14312Arr = f11289;
        this.f11319 = new HashMap[c14312Arr.length];
        this.f11314 = new HashSet(c14312Arr.length);
        this.f11317 = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        boolean z = i == 1;
        this.f11324 = z;
        if (z) {
            this.f11321 = null;
            this.f11322 = null;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f11321 = (AssetManager.AssetInputStream) inputStream;
            this.f11322 = null;
        } else if (!(inputStream instanceof FileInputStream)) {
            this.f11321 = null;
            this.f11322 = null;
        } else {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f11321 = null;
                this.f11322 = fileInputStream.getFD();
            } catch (Exception unused) {
                this.f11321 = null;
                this.f11322 = null;
            }
        }
        boolean z2 = this.f11324;
        boolean z3 = f11306;
        for (int i2 = 0; i2 < c14312Arr.length; i2++) {
            try {
                try {
                    this.f11319[i2] = new HashMap();
                } catch (IOException | UnsupportedOperationException unused2) {
                    m9002();
                    if (!z3) {
                        return;
                    }
                }
            } catch (Throwable th) {
                m9002();
                if (z3) {
                    m9013();
                }
                throw th;
            }
        }
        if (!z2) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, OpenAuthTask.Duplex);
            this.f11313 = m8989(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i3 = this.f11313;
        if (i3 != 4 && i3 != 9 && i3 != 13 && i3 != 14) {
            C9373 c9373 = new C9373(inputStream);
            if (z2) {
                if (!m8987(c9373)) {
                    m9002();
                    if (!z3) {
                        return;
                    }
                }
                m9013();
            }
            int i4 = this.f11313;
            if (i4 == 12 || i4 == 15) {
                m8995(c9373, i4);
            } else if (i4 == 7) {
                m8994(c9373);
            } else if (i4 == 10) {
                m9003(c9373);
            } else {
                m9008(c9373);
            }
            c9373.seek(this.f11320);
            m9001((C10784) c9373);
        } else {
            C10784 c10784 = new C10784(inputStream);
            int i5 = this.f11313;
            if (i5 == 4) {
                m8997(c10784, 0, 0);
            } else if (i5 == 13) {
                m8996(c10784);
            } else if (i5 == 9) {
                m9010(c10784);
            } else if (i5 == 14) {
                m9005(c10784);
            }
        }
        m9002();
        if (!z3) {
            return;
        }
        m9013();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C23484 m9007(String str) {
        C23484 c23484;
        int i;
        C23484 c23485;
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.f11313) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (c23485 = this.f11323) != null)) {
            return c23485;
        }
        for (int i2 = 0; i2 < f11289.length; i2++) {
            C23484 c23486 = (C23484) this.f11319[i2].get(str);
            if (c23486 != null) {
                return c23486;
            }
        }
        if (!"Xmp".equals(str) || (c23484 = this.f11323) == null) {
            return null;
        }
        return c23484;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m9016(String str) {
        C23484 c23484M9007 = m9007(str);
        if (c23484M9007 != null) {
            if (str.equals("GPSTimeStamp")) {
                int i = c23484M9007.f76040;
                if (i == 5 || i == 10) {
                    C1610[] c1610Arr = (C1610[]) c23484M9007.m51746(this.f11317);
                    if (c1610Arr == null || c1610Arr.length != 3) {
                        Arrays.toString(c1610Arr);
                        return null;
                    }
                    C1610 c1610 = c1610Arr[0];
                    Integer numValueOf = Integer.valueOf((int) (c1610.f6503 / c1610.f6502));
                    C1610 c1611 = c1610Arr[1];
                    Integer numValueOf2 = Integer.valueOf((int) (c1611.f6503 / c1611.f6502));
                    C1610 c1612 = c1610Arr[2];
                    return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c1612.f6503 / c1612.f6502)));
                }
            } else if (f11295.contains(str)) {
                try {
                    return Double.toString(c23484M9007.m51747(this.f11317));
                } catch (NumberFormatException unused) {
                }
            } else {
                return c23484M9007.m51748(this.f11317);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m9015() {
        C23484 c23484M9007 = m9007("Orientation");
        if (c23484M9007 == null) {
            return 1;
        }
        try {
            return c23484M9007.m51749(this.f11317);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m9013() {
        int i = 0;
        while (true) {
            HashMap[] mapArr = this.f11319;
            if (i >= mapArr.length) {
                return;
            }
            mapArr[i].size();
            for (Map.Entry entry : mapArr[i].entrySet()) {
                C23484 c23484 = (C23484) entry.getValue();
                c23484.toString();
                c23484.m51748(this.f11317);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Long m9019() {
        return m8990(m9016("DateTime"), m9016("SubSecTime"), m9016("OffsetTime"));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Long m9018() {
        return m8990(m9016("DateTimeDigitized"), m9016("SubSecTimeDigitized"), m9016("OffsetTimeDigitized"));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Long m9014() {
        return m8990(m9016("DateTimeOriginal"), m9016("SubSecTimeOriginal"), m9016("OffsetTimeOriginal"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Long m8990(String str, String str2, String str3) {
        long j;
        if (str != null && f11281.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date date = f11300.parse(str, parsePosition);
                if (date == null && (date = f11309.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = date.getTime();
                if (str3 != null) {
                    String strSubstring = str3.substring(0, 1);
                    int i = Integer.parseInt(str3.substring(1, 3));
                    int i2 = Integer.parseInt(str3.substring(4, 6));
                    if ((BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX.equals(strSubstring) || "-".equals(strSubstring)) && ":".equals(str3.substring(3, 4)) && i <= 14) {
                        time += (long) (C17922.m41614(i, 60, i2, 60000) * ("-".equals(strSubstring) ? 1 : -1));
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

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Long m9017() {
        String strM9016 = m9016("GPSDateStamp");
        String strM9017 = m9016("GPSTimeStamp");
        if (strM9016 == null || strM9017 == null) {
            return null;
        }
        Pattern pattern = f11281;
        if (!pattern.matcher(strM9016).matches() && !pattern.matcher(strM9017).matches()) {
            return null;
        }
        String str = strM9016 + ' ' + strM9017;
        ParsePosition parsePosition = new ParsePosition(0);
        try {
            Date date = f11300.parse(str, parsePosition);
            if (date == null && (date = f11309.parse(str, parsePosition)) == null) {
                return null;
            }
            return Long.valueOf(date.getTime());
        } catch (IllegalArgumentException unused) {
            return null;
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
    private int m8989(BufferedInputStream bufferedInputStream) throws Throwable {
        C10784 c10784;
        int i;
        C10784 c10785;
        boolean z;
        C10784 c10786;
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
            byte[] bArr5 = f11299;
            if (i5 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i5] != bArr5[i5]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i6 = 0; i6 < bytes.length; i6++) {
                    if (bArr4[i6] != bytes[i6]) {
                        try {
                            c10784 = new C10784(bArr4);
                            try {
                                long j2 = c10784.readInt();
                                byte[] bArr6 = new byte[4];
                                c10784.readFully(bArr6);
                                if (Arrays.equals(bArr6, f11296)) {
                                    if (j2 == 1) {
                                        j2 = c10784.readLong();
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
                                                    c10784.readFully(bArr7);
                                                    if (j5 != 1) {
                                                        if (Arrays.equals(bArr7, f11302)) {
                                                            z5 = true;
                                                        } else if (Arrays.equals(bArr7, f11279)) {
                                                            z6 = true;
                                                        } else if (Arrays.equals(bArr7, f11301) || Arrays.equals(bArr7, f11307)) {
                                                            z7 = true;
                                                        }
                                                        if (z5) {
                                                            if (z6) {
                                                                c10784.close();
                                                                i = 12;
                                                            } else if (z7) {
                                                                c10784.close();
                                                                i = 15;
                                                            }
                                                            if (i != 0) {
                                                                return i;
                                                            }
                                                            try {
                                                                c10785 = new C10784(bArr4);
                                                                try {
                                                                    ByteOrder byteOrderM8986 = m8986(c10785);
                                                                    this.f11317 = byteOrderM8986;
                                                                    c10785.m27081(byteOrderM8986);
                                                                    s = c10785.readShort();
                                                                    if (s != 20306 || s == 21330) {
                                                                        z = true;
                                                                    } else {
                                                                        z = false;
                                                                    }
                                                                    c10785.close();
                                                                } catch (Exception unused) {
                                                                    if (c10785 != null) {
                                                                        c10785.close();
                                                                    }
                                                                    z = false;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    if (c10785 != null) {
                                                                        c10785.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception unused2) {
                                                                c10785 = null;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                c10785 = null;
                                                            }
                                                            if (z) {
                                                                return 7;
                                                            }
                                                            try {
                                                                c10786 = new C10784(bArr4);
                                                                try {
                                                                    ByteOrder byteOrderM8987 = m8986(c10786);
                                                                    this.f11317 = byteOrderM8987;
                                                                    c10786.m27081(byteOrderM8987);
                                                                    if (c10786.readShort() == 85) {
                                                                        z2 = true;
                                                                    } else {
                                                                        z2 = false;
                                                                    }
                                                                    c10786.close();
                                                                } catch (Exception unused3) {
                                                                    if (c10786 != null) {
                                                                        c10786.close();
                                                                    }
                                                                    z2 = false;
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    if (c10786 != null) {
                                                                        c10786.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception unused4) {
                                                                c10786 = null;
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                c10786 = null;
                                                            }
                                                            if (z2) {
                                                                return 10;
                                                            }
                                                            i2 = 0;
                                                            while (true) {
                                                                bArr = f11298;
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
                                                                bArr2 = f11280;
                                                                if (i3 >= bArr2.length) {
                                                                    i4 = 0;
                                                                    while (true) {
                                                                        bArr3 = f11297;
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
                                                    c10784.close();
                                                    i = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused6) {
                                if (c10784 != null) {
                                }
                                i = 0;
                                if (i != 0) {
                                    return i;
                                }
                                c10785 = new C10784(bArr4);
                                ByteOrder byteOrderM8988 = m8986(c10785);
                                this.f11317 = byteOrderM8988;
                                c10785.m27081(byteOrderM8988);
                                s = c10785.readShort();
                                if (s != 20306) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                                c10785.close();
                                if (z) {
                                    return 7;
                                }
                                c10786 = new C10784(bArr4);
                                ByteOrder byteOrderM8989 = m8986(c10786);
                                this.f11317 = byteOrderM8989;
                                c10786.m27081(byteOrderM8989);
                                if (c10786.readShort() == 85) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                c10786.close();
                                if (z2) {
                                    return 10;
                                }
                                i2 = 0;
                                while (true) {
                                    bArr = f11298;
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
                                    bArr2 = f11280;
                                    if (i3 >= bArr2.length) {
                                        i4 = 0;
                                        while (true) {
                                            bArr3 = f11297;
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
                                if (c10784 != null) {
                                    c10784.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused7) {
                            c10784 = null;
                        } catch (Throwable th6) {
                            th = th6;
                            c10784 = null;
                        }
                        c10784.close();
                        i = 0;
                        if (i != 0) {
                            return i;
                        }
                        c10785 = new C10784(bArr4);
                        ByteOrder byteOrderM89810 = m8986(c10785);
                        this.f11317 = byteOrderM89810;
                        c10785.m27081(byteOrderM89810);
                        s = c10785.readShort();
                        if (s != 20306) {
                            z = true;
                        } else {
                            z = true;
                        }
                        c10785.close();
                        if (z) {
                            return 7;
                        }
                        c10786 = new C10784(bArr4);
                        ByteOrder byteOrderM89811 = m8986(c10786);
                        this.f11317 = byteOrderM89811;
                        c10786.m27081(byteOrderM89811);
                        if (c10786.readShort() == 85) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c10786.close();
                        if (z2) {
                            return 10;
                        }
                        i2 = 0;
                        while (true) {
                            bArr = f11298;
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
                            bArr2 = f11280;
                            if (i3 >= bArr2.length) {
                                i4 = 0;
                                while (true) {
                                    bArr3 = f11297;
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
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
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
    private void m8997(l.C10784 r18, int r19, int r20) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3021.m8997(l.ۧۚۙ, int, int):void");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m9008(C9373 c9373) throws IOException {
        m9000(c9373);
        m9009(c9373, 0);
        m9004(c9373, 0);
        m9004(c9373, 5);
        m9004(c9373, 4);
        m9011();
        if (this.f11313 == 8) {
            HashMap[] mapArr = this.f11319;
            C23484 c23484 = (C23484) mapArr[1].get("MakerNote");
            if (c23484 != null) {
                C9373 c9374 = new C9373(c23484.f76039);
                c9374.m27081(this.f11317);
                c9374.m27080(6);
                m9009(c9374, 9);
                C23484 c23485 = (C23484) mapArr[9].get("ColorSpace");
                if (c23485 != null) {
                    mapArr[1].put("ColorSpace", c23485);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m9010(C10784 c10784) throws IOException {
        if (f11306) {
            C13638.toString(c10784);
        }
        c10784.m27080(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c10784.readFully(bArr);
        c10784.readFully(bArr2);
        c10784.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c10784.m27080(i - c10784.f36736);
        c10784.readFully(bArr4);
        m8997(new C10784(bArr4), i, 5);
        c10784.m27080(i3 - c10784.f36736);
        c10784.m27081(ByteOrder.BIG_ENDIAN);
        int i4 = c10784.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c10784.readUnsignedShort();
            int unsignedShort2 = c10784.readUnsignedShort();
            if (unsignedShort == f11286.f46880) {
                short s = c10784.readShort();
                short s2 = c10784.readShort();
                C23484 c23484M51742 = C23484.m51742((int) s, this.f11317);
                C23484 c23484M51743 = C23484.m51742((int) s2, this.f11317);
                HashMap[] mapArr = this.f11319;
                mapArr[0].put("ImageLength", c23484M51742);
                mapArr[0].put("ImageWidth", c23484M51743);
                return;
            }
            c10784.m27080(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8995(C9373 c9373, int i) {
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
                C4930.m13717(mediaMetadataRetriever, new C5844(c9373));
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
                HashMap[] mapArr = this.f11319;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C23484.m51742(Integer.parseInt(strExtractMetadata), this.f11317));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", C23484.m51742(Integer.parseInt(strExtractMetadata3), this.f11317));
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
                    mapArr[0].put("Orientation", C23484.m51742(i2, this.f11317));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata4);
                    int i6 = Integer.parseInt(strExtractMetadata5);
                    if (i6 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c9373.seek(i5);
                    byte[] bArr = new byte[6];
                    c9373.readFully(bArr);
                    int i7 = i5 + 6;
                    int i8 = i6 - 6;
                    if (!Arrays.equals(bArr, f11303)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i8];
                    c9373.readFully(bArr2);
                    this.f11320 = i7;
                    m8993(0, bArr2);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i9 = Integer.parseInt(strExtractMetadata8);
                    int i10 = Integer.parseInt(strExtractMetadata9);
                    long j = i9;
                    c9373.seek(j);
                    byte[] bArr3 = new byte[i10];
                    c9373.readFully(bArr3);
                    this.f11323 = new C23484(j, bArr3, 1, i10);
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m8987(C9373 c9373) throws IOException {
        byte[] bArr = f11303;
        byte[] bArr2 = new byte[bArr.length];
        c9373.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            return false;
        }
        byte[] bArrCopyOf = new byte[1024];
        int i = 0;
        while (true) {
            if (i == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            int i2 = c9373.f36737.read(bArrCopyOf, i, bArrCopyOf.length - i);
            if (i2 != -1) {
                i += i2;
                c9373.f36736 += i2;
            } else {
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i);
                this.f11320 = bArr.length;
                m8993(0, bArrCopyOf2);
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8994(C9373 c9373) throws IOException {
        int i;
        int i2;
        m9008(c9373);
        HashMap[] mapArr = this.f11319;
        C23484 c23484 = (C23484) mapArr[1].get("MakerNote");
        if (c23484 != null) {
            C9373 c9374 = new C9373(c23484.f76039);
            c9374.m27081(this.f11317);
            byte[] bArr = f11292;
            byte[] bArr2 = new byte[bArr.length];
            c9374.readFully(bArr2);
            c9374.seek(0L);
            byte[] bArr3 = f11283;
            byte[] bArr4 = new byte[bArr3.length];
            c9374.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c9374.seek(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c9374.seek(12L);
            }
            m9009(c9374, 6);
            C23484 c23485 = (C23484) mapArr[7].get("PreviewImageStart");
            C23484 c23486 = (C23484) mapArr[7].get("PreviewImageLength");
            if (c23485 != null && c23486 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c23485);
                mapArr[5].put("JPEGInterchangeFormatLength", c23486);
            }
            C23484 c23487 = (C23484) mapArr[8].get("AspectFrame");
            if (c23487 != null) {
                int[] iArr = (int[]) c23487.m51746(this.f11317);
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
                C23484 c23484M51742 = C23484.m51742(i5, this.f11317);
                C23484 c23484M51743 = C23484.m51742(i6, this.f11317);
                mapArr[0].put("ImageWidth", c23484M51742);
                mapArr[0].put("ImageLength", c23484M51743);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m9003(C9373 c9373) throws IOException {
        if (f11306) {
            C13638.toString(c9373);
        }
        m9008(c9373);
        HashMap[] mapArr = this.f11319;
        C23484 c23484 = (C23484) mapArr[0].get("JpgFromRaw");
        if (c23484 != null) {
            m8997(new C10784(c23484.f76039), (int) c23484.f76041, 5);
        }
        C23484 c23485 = (C23484) mapArr[0].get("ISO");
        C23484 c23486 = (C23484) mapArr[1].get("PhotographicSensitivity");
        if (c23485 == null || c23486 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c23485);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8996(C10784 c10784) throws IOException {
        if (f11306) {
            C13638.toString(c10784);
        }
        c10784.m27081(ByteOrder.BIG_ENDIAN);
        int i = c10784.f36736;
        c10784.m27080(f11298.length);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (z && z2) {
                return;
            }
            try {
                int i2 = c10784.readInt();
                int i3 = c10784.readInt();
                int i4 = c10784.f36736;
                int i5 = i4 + i2 + 4;
                int i6 = i4 - i;
                if (i6 == 16 && i3 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i3 == 1229278788) {
                    return;
                }
                if (i3 == 1700284774 && !z) {
                    this.f11320 = i6;
                    byte[] bArr = new byte[i2];
                    c10784.readFully(bArr);
                    int i7 = c10784.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i3 >>> 24);
                    crc32.update(i3 >>> 16);
                    crc32.update(i3 >>> 8);
                    crc32.update(i3);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i7) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i7 + ", calculated CRC value: " + crc32.getValue());
                    }
                    m8993(0, bArr);
                    m9011();
                    m9001(new C10784(bArr));
                    z = true;
                } else if (i3 == 1767135348 && !z2) {
                    byte[] bArr2 = f11285;
                    if (i2 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        c10784.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i8 = c10784.f36736 - i;
                            int i9 = i2 - length;
                            byte[] bArr4 = new byte[i9];
                            c10784.readFully(bArr4);
                            this.f11323 = new C23484(i8, bArr4, 1, i9);
                            z2 = true;
                        }
                    }
                }
                c10784.m27080(i5 - c10784.f36736);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m9005(C10784 c10784) throws IOException {
        if (f11306) {
            C13638.toString(c10784);
        }
        c10784.m27081(ByteOrder.LITTLE_ENDIAN);
        c10784.m27080(f11280.length);
        int i = c10784.readInt() + 8;
        byte[] bArr = f11297;
        c10784.m27080(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c10784.readFully(bArr2);
                int i2 = c10784.readInt();
                int i3 = length + 8;
                if (Arrays.equals(f11310, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i2];
                    c10784.readFully(bArrCopyOfRange);
                    byte[] bArr3 = f11303;
                    if (C14104.m34145(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i2);
                    }
                    this.f11320 = i3;
                    m8993(0, bArrCopyOfRange);
                    m9001(new C10784(bArrCopyOfRange));
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
                c10784.m27080(i2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8993(int i, byte[] bArr) throws IOException {
        C9373 c9373 = new C9373(bArr);
        m9000(c9373);
        m9009(c9373, i);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m9002() {
        String strM9016 = m9016("DateTimeOriginal");
        HashMap[] mapArr = this.f11319;
        if (strM9016 != null && m9016("DateTime") == null) {
            mapArr[0].put("DateTime", C23484.m51744(strM9016));
        }
        if (m9016("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C23484.m51743(0L, this.f11317));
        }
        if (m9016("ImageLength") == null) {
            mapArr[0].put("ImageLength", C23484.m51743(0L, this.f11317));
        }
        if (m9016("Orientation") == null) {
            mapArr[0].put("Orientation", C23484.m51743(0L, this.f11317));
        }
        if (m9016("LightSource") == null) {
            mapArr[1].put("LightSource", C23484.m51743(0L, this.f11317));
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static ByteOrder m8986(C10784 c10784) throws IOException {
        short s = c10784.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException(C9576.m24440(new StringBuilder("Invalid byte order: "), s));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m9000(C9373 c9373) throws IOException {
        ByteOrder byteOrderM8986 = m8986((C10784) c9373);
        this.f11317 = byteOrderM8986;
        c9373.m27081(byteOrderM8986);
        int unsignedShort = c9373.readUnsignedShort();
        int i = this.f11313;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            throw new IOException(C9576.m24440(new StringBuilder("Invalid start code: "), unsignedShort));
        }
        int i2 = c9373.readInt();
        if (i2 < 8) {
            throw new IOException(C8479.m22141(i2, "Invalid first Ifd offset: "));
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c9373.m27080(i3);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m9001(C10784 c10784) throws IOException {
        C23484 c23484;
        HashMap map = this.f11319[4];
        C23484 c23485 = (C23484) map.get("Compression");
        if (c23485 != null) {
            int iM51749 = c23485.m51749(this.f11317);
            if (iM51749 != 1) {
                if (iM51749 == 6) {
                    m8998(c10784, map);
                    return;
                } else if (iM51749 != 7) {
                    return;
                }
            }
            C23484 c23486 = (C23484) map.get("BitsPerSample");
            if (c23486 != null) {
                int[] iArr = (int[]) c23486.m51746(this.f11317);
                int[] iArr2 = f11290;
                if (!Arrays.equals(iArr2, iArr)) {
                    if (this.f11313 != 3 || (c23484 = (C23484) map.get("PhotometricInterpretation")) == null) {
                        return;
                    }
                    int iM517410 = c23484.m51749(this.f11317);
                    if ((iM517410 != 1 || !Arrays.equals(iArr, f11305)) && (iM517410 != 6 || !Arrays.equals(iArr, iArr2))) {
                        return;
                    }
                }
                C23484 c23487 = (C23484) map.get("StripOffsets");
                C23484 c23488 = (C23484) map.get("StripByteCounts");
                if (c23487 == null || c23488 == null) {
                    return;
                }
                long[] jArrM34146 = C14104.m34146(c23487.m51746(this.f11317));
                long[] jArrM34147 = C14104.m34146(c23488.m51746(this.f11317));
                if (jArrM34146 == null || jArrM34146.length == 0 || jArrM34147 == null || jArrM34147.length == 0 || jArrM34146.length != jArrM34147.length) {
                    return;
                }
                long j = 0;
                for (long j2 : jArrM34147) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f11316 = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jArrM34146.length; i3++) {
                    int i4 = (int) jArrM34146[i3];
                    int i5 = (int) jArrM34147[i3];
                    if (i3 < jArrM34146.length - 1 && i4 + i5 != jArrM34146[i3 + 1]) {
                        this.f11316 = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        return;
                    }
                    try {
                        c10784.m27080(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        c10784.readFully(bArr2);
                        i = i7 + i5;
                        System.arraycopy(bArr2, 0, bArr, i2, i5);
                        i2 += i5;
                    } catch (EOFException unused) {
                        return;
                    }
                }
                if (this.f11316) {
                    long j3 = jArrM34146[0];
                    return;
                }
                return;
            }
            return;
        }
        m8998(c10784, map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8998(C10784 c10784, HashMap map) throws IOException {
        C23484 c23484 = (C23484) map.get("JPEGInterchangeFormat");
        C23484 c23485 = (C23484) map.get("JPEGInterchangeFormatLength");
        if (c23484 == null || c23485 == null) {
            return;
        }
        int iM51749 = c23484.m51749(this.f11317);
        int iM517410 = c23485.m51749(this.f11317);
        if (this.f11313 == 7) {
            iM51749 += this.f11315;
        }
        if (iM51749 <= 0 || iM517410 <= 0 || this.f11321 != null || this.f11322 != null) {
            return;
        }
        c10784.m27080(iM51749);
        c10784.readFully(new byte[iM517410]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m8999(HashMap map) {
        C23484 c23484 = (C23484) map.get("ImageLength");
        C23484 c23485 = (C23484) map.get("ImageWidth");
        if (c23484 == null || c23485 == null) {
            return false;
        }
        return c23484.m51749(this.f11317) <= 512 && c23485.m51749(this.f11317) <= 512;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m9011() {
        m8991(0, 5);
        m8991(0, 4);
        m8991(5, 4);
        HashMap[] mapArr = this.f11319;
        C23484 c23484 = (C23484) mapArr[1].get("PixelXDimension");
        C23484 c23485 = (C23484) mapArr[1].get("PixelYDimension");
        if (c23484 != null && c23485 != null) {
            mapArr[0].put("ImageWidth", c23484);
            mapArr[0].put("ImageLength", c23485);
        }
        if (mapArr[4].isEmpty() && m8999(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        m8999(mapArr[4]);
        m8992(0, "ThumbnailOrientation", "Orientation");
        m8992(0, "ThumbnailImageLength", "ImageLength");
        m8992(0, "ThumbnailImageWidth", "ImageWidth");
        m8992(5, "ThumbnailOrientation", "Orientation");
        m8992(5, "ThumbnailImageLength", "ImageLength");
        m8992(5, "ThumbnailImageWidth", "ImageWidth");
        m8992(4, "Orientation", "ThumbnailOrientation");
        m8992(4, "ImageLength", "ThumbnailImageLength");
        m8992(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m9004(C9373 c9373, int i) throws IOException {
        C23484 c23484M51742;
        C23484 c23484M51743;
        HashMap[] mapArr = this.f11319;
        C23484 c23484 = (C23484) mapArr[i].get("DefaultCropSize");
        C23484 c23485 = (C23484) mapArr[i].get("SensorTopBorder");
        C23484 c23486 = (C23484) mapArr[i].get("SensorLeftBorder");
        C23484 c23487 = (C23484) mapArr[i].get("SensorBottomBorder");
        C23484 c23488 = (C23484) mapArr[i].get("SensorRightBorder");
        if (c23484 != null) {
            if (c23484.f76040 == 5) {
                C1610[] c1610Arr = (C1610[]) c23484.m51746(this.f11317);
                if (c1610Arr == null || c1610Arr.length != 2) {
                    Arrays.toString(c1610Arr);
                    return;
                } else {
                    c23484M51742 = C23484.m51745(c1610Arr[0], this.f11317);
                    c23484M51743 = C23484.m51745(c1610Arr[1], this.f11317);
                }
            } else {
                int[] iArr = (int[]) c23484.m51746(this.f11317);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    c23484M51742 = C23484.m51742(iArr[0], this.f11317);
                    c23484M51743 = C23484.m51742(iArr[1], this.f11317);
                }
            }
            mapArr[i].put("ImageWidth", c23484M51742);
            mapArr[i].put("ImageLength", c23484M51743);
            return;
        }
        if (c23485 == null || c23486 == null || c23487 == null || c23488 == null) {
            C23484 c23489 = (C23484) mapArr[i].get("ImageLength");
            C23484 c234810 = (C23484) mapArr[i].get("ImageWidth");
            if (c23489 == null || c234810 == null) {
                C23484 c234811 = (C23484) mapArr[i].get("JPEGInterchangeFormat");
                C23484 c234812 = (C23484) mapArr[i].get("JPEGInterchangeFormatLength");
                if (c234811 == null || c234812 == null) {
                    return;
                }
                int iM51749 = c234811.m51749(this.f11317);
                int iM517410 = c234811.m51749(this.f11317);
                c9373.seek(iM51749);
                byte[] bArr = new byte[iM517410];
                c9373.readFully(bArr);
                m8997(new C10784(bArr), iM51749, i);
                return;
            }
            return;
        }
        int iM517411 = c23485.m51749(this.f11317);
        int iM517412 = c23487.m51749(this.f11317);
        int iM517413 = c23488.m51749(this.f11317);
        int iM517414 = c23486.m51749(this.f11317);
        if (iM517412 <= iM517411 || iM517413 <= iM517414) {
            return;
        }
        C23484 c23484M51744 = C23484.m51742(iM517412 - iM517411, this.f11317);
        C23484 c23484M51745 = C23484.m51742(iM517413 - iM517414, this.f11317);
        mapArr[i].put("ImageLength", c23484M51744);
        mapArr[i].put("ImageWidth", c23484M51745);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:16:0x0077  */
    /* JADX WARN: Code duplicated, block: B:98:0x0197  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m9009(C9373 c9373, int i) throws IOException {
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
        Integer numValueOf = Integer.valueOf(c9373.f36736);
        HashSet hashSet2 = this.f11314;
        hashSet2.add(numValueOf);
        short s3 = c9373.readShort();
        if (s3 <= 0) {
            return;
        }
        short s4 = 0;
        while (true) {
            z = f11306;
            mapArr = this.f11319;
            if (s4 >= s3) {
                break;
            }
            int unsignedShort2 = c9373.readUnsignedShort();
            int unsignedShort3 = c9373.readUnsignedShort();
            int i3 = c9373.readInt();
            long j3 = ((long) c9373.f36736) + 4;
            C14312 c14312 = (C14312) f11288[i].get(Integer.valueOf(unsignedShort2));
            if (z) {
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), c14312 != null ? c14312.f46878 : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i3));
            }
            if (c14312 != null && unsignedShort3 > 0) {
                int[] iArr = f11294;
                if (unsignedShort3 >= iArr.length) {
                    s = s3;
                    s2 = s4;
                } else {
                    int i4 = c14312.f46879;
                    s = s3;
                    if (i4 == 7 || unsignedShort3 == 7 || i4 == unsignedShort3 || (i2 = c14312.f46877) == unsignedShort3) {
                        s2 = s4;
                    } else {
                        s2 = s4;
                        if (((i4 != 4 && i2 != 4) || unsignedShort3 != 3) && (((i4 != 9 && i2 != 9) || unsignedShort3 != 8) && ((i4 != 12 && i2 != 12) || unsignedShort3 != 11))) {
                            if (z) {
                                String str = f11312[unsignedShort3];
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
                    int i5 = c9373.readInt();
                    if (this.f11313 == 7) {
                        if ("MakerNote".equals(c14312.f46878)) {
                            this.f11315 = i5;
                        } else if (i == 6 && "ThumbnailImage".equals(c14312.f46878)) {
                            this.f11325 = i5;
                            this.f11318 = i3;
                            C23484 c23484M51742 = C23484.m51742(6, this.f11317);
                            C23484 c23484M51743 = C23484.m51743(this.f11325, this.f11317);
                            C23484 c23484M51744 = C23484.m51743(this.f11318, this.f11317);
                            mapArr[4].put("Compression", c23484M51742);
                            mapArr[4].put("JPEGInterchangeFormat", c23484M51743);
                            mapArr[4].put("JPEGInterchangeFormatLength", c23484M51744);
                        }
                    }
                    c9373.seek(i5);
                } else {
                    j3 = j3;
                }
                Integer num = (Integer) f11284.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j2 = ((long) c9373.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            unsignedShort = c9373.readShort();
                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                            unsignedShort = c9373.readInt();
                        } else {
                            j2 = -1;
                        }
                        if (z) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(j2), c14312.f46878);
                        }
                        if (j2 > 0 || (c9373.length() != -1 && j2 >= c9373.length())) {
                            hashSet = hashSet2;
                        } else {
                            hashSet = hashSet2;
                            if (!hashSet.contains(Integer.valueOf((int) j2))) {
                                c9373.seek(j2);
                                m9009(c9373, num.intValue());
                            }
                        }
                        c9373.seek(j3);
                    } else {
                        unsignedShort = c9373.readUnsignedShort();
                    }
                    j2 = unsignedShort;
                    if (z) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(j2), c14312.f46878);
                    }
                    if (j2 > 0) {
                        hashSet = hashSet2;
                    } else {
                        hashSet = hashSet2;
                    }
                    c9373.seek(j3);
                } else {
                    hashSet = hashSet2;
                    int i6 = c9373.f36736 + this.f11320;
                    byte[] bArr = new byte[(int) j];
                    c9373.readFully(bArr);
                    long j4 = j3;
                    C23484 c23484 = new C23484(i6, bArr, unsignedShort3, i3);
                    HashMap map = mapArr[i];
                    String str2 = c14312.f46878;
                    map.put(str2, c23484);
                    if ("DNGVersion".equals(str2)) {
                        this.f11313 = 3;
                    }
                    if ((("Make".equals(str2) || "Model".equals(str2)) && c23484.m51748(this.f11317).contains("PENTAX")) || ("Compression".equals(str2) && c23484.m51749(this.f11317) == 65535)) {
                        this.f11313 = 8;
                    }
                    if (c9373.f36736 != j4) {
                        c9373.seek(j4);
                    }
                }
            } else {
                c9373.seek(j3);
                hashSet = hashSet2;
            }
            s4 = (short) (s2 + 1);
            hashSet2 = hashSet;
            s3 = s;
        }
        HashSet hashSet4 = hashSet2;
        int i7 = c9373.readInt();
        if (z) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i7));
        }
        long j5 = i7;
        if (j5 <= 0 || hashSet4.contains(Integer.valueOf(i7))) {
            return;
        }
        c9373.seek(j5);
        if (mapArr[4].isEmpty()) {
            m9009(c9373, 4);
        } else if (mapArr[5].isEmpty()) {
            m9009(c9373, 5);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8991(int i, int i2) {
        HashMap[] mapArr = this.f11319;
        if (mapArr[i].isEmpty() || mapArr[i2].isEmpty()) {
            return;
        }
        C23484 c23484 = (C23484) mapArr[i].get("ImageLength");
        C23484 c23485 = (C23484) mapArr[i].get("ImageWidth");
        C23484 c23486 = (C23484) mapArr[i2].get("ImageLength");
        C23484 c23487 = (C23484) mapArr[i2].get("ImageWidth");
        if (c23484 == null || c23485 == null || c23486 == null || c23487 == null) {
            return;
        }
        int iM51749 = c23484.m51749(this.f11317);
        int iM517410 = c23485.m51749(this.f11317);
        int iM517411 = c23486.m51749(this.f11317);
        int iM517412 = c23487.m51749(this.f11317);
        if (iM51749 >= iM517411 || iM517410 >= iM517412) {
            return;
        }
        HashMap map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m8992(int i, String str, String str2) {
        HashMap[] mapArr = this.f11319;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i];
        map.put(str2, (C23484) map.get(str));
        mapArr[i].remove(str);
    }
}
