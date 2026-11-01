package l;

import java.util.Date;
import net.sf.sevenzipjbinding.ArchiveFormat;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.PropID;

/* JADX INFO: renamed from: l.ᩳ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAXC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18334 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f58479;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f58480;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f58481;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f58482;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f58483;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f58484;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f58485;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f58486;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Integer f58487;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f58488;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f58489;

    public C18334(int i, String str, String str2, String str3, boolean z, boolean z2, long j, long j2, long j3, Integer num, String str4) {
        this.f58485 = i;
        this.f58479 = str;
        this.f58481 = str2;
        this.f58486 = str3;
        this.f58480 = z;
        this.f58483 = z2;
        this.f58484 = j;
        this.f58482 = j2;
        this.f58489 = j3;
        this.f58487 = num;
        this.f58488 = str4;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m42575() {
        return this.f58485;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m42573() {
        return this.f58479;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m42568() {
        return this.f58481;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m42580() {
        return this.f58486;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m42574() {
        return this.f58480;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m42581() {
        return this.f58483;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long m42577() {
        return this.f58484;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42579(long j) {
        this.f58484 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m42571() {
        return this.f58482;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42572(long j) {
        this.f58482 = j;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m42570() {
        return this.f58489;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m42576(long j) {
        this.f58489 = j;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Integer m42578() {
        return this.f58487;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m42569() {
        return this.f58488;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C18334 m42567(IInArchive iInArchive, int i) {
        String fileName;
        long time;
        long j;
        long j2;
        boolean z;
        ArchiveFormat archiveFormat = iInArchive.getArchiveFormat();
        if (archiveFormat != null && archiveFormat.supportMultipleFiles()) {
            Object property = iInArchive.getProperty(i, PropID.IS_FOLDER);
            C13465.m32963(property, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) property).booleanValue();
            String stringProperty = iInArchive.getStringProperty(i, PropID.PATH);
            C13465.m32967(stringProperty, "getStringProperty(...)");
            String strReplace = stringProperty.replace('\\', '/');
            C13465.m32967(strReplace, "replace(...)");
            if (zBooleanValue && !C12529.m31139(strReplace, "/", false)) {
                strReplace = strReplace.concat("/");
            }
            Long l2 = (Long) iInArchive.getProperty(i, PropID.SIZE);
            long jLongValue = l2 != null ? l2.longValue() : -1L;
            Long l3 = (Long) iInArchive.getProperty(i, PropID.PACKED_SIZE);
            long jLongValue2 = l3 != null ? l3.longValue() : -1L;
            Date date = (Date) iInArchive.getProperty(i, PropID.LAST_MODIFICATION_TIME);
            z = zBooleanValue;
            fileName = strReplace;
            j2 = jLongValue;
            j = jLongValue2;
            time = date != null ? date.getTime() : -1L;
        } else {
            fileName = iInArchive.getFileName();
            C13465.m32967(fileName, "getFileName(...)");
            int iM31144 = C12529.m31144(fileName);
            if (iM31144 != -1) {
                fileName = fileName.substring(0, iM31144);
                C13465.m32967(fileName, "substring(...)");
            }
            Long l4 = (Long) iInArchive.getProperty(i, PropID.SIZE);
            long jLongValue3 = l4 != null ? l4.longValue() : -1L;
            Long l5 = (Long) iInArchive.getProperty(i, PropID.PACKED_SIZE);
            long jLongValue4 = l5 != null ? l5.longValue() : iInArchive.getFileSize();
            Date date2 = (Date) iInArchive.getProperty(i, PropID.LAST_MODIFICATION_TIME);
            time = date2 != null ? date2.getTime() : iInArchive.getFileTime();
            j = jLongValue4;
            j2 = jLongValue3;
            z = false;
        }
        C12107 c12107 = new C12107(fileName);
        String strM30093 = c12107.m30093();
        int i2 = C5696.f19430;
        String parent = c12107.getParent();
        String strConcat = parent != null ? "/".concat(parent) : "/";
        Boolean bool = (Boolean) iInArchive.getProperty(i, PropID.ENCRYPTED);
        boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
        Integer num = (Integer) iInArchive.getProperty(i, PropID.CRC);
        String stringProperty2 = iInArchive.getStringProperty(i, PropID.SYM_LINK);
        if (stringProperty2 != null && stringProperty2.length() == 0) {
            stringProperty2 = null;
        }
        C13465.m32962((Object) strM30093);
        C13465.m32962((Object) strConcat);
        return new C18334(i, fileName, strM30093, strConcat, z, zBooleanValue2, j2, j, time, num, stringProperty2);
    }
}
