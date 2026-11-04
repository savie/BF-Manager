package l;

import java.util.Date;
import net.sf.sevenzipjbinding.ArchiveFormat;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.PropID;

/* JADX INFO: renamed from: l.֫ܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: KAXC */
/* JADX INFO: loaded from: classes2.dex */
public final class C1997 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f6658;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f6659;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f6660;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f6661;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f6662;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f6663;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f6664;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f6665;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Integer f6666;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f6667;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f6668;

    public C1997(int i, String str, String str2, String str3, boolean z, boolean z2, long j, long j2, long j3, Integer num, String str4) {
        this.f6661 = i;
        this.f6663 = str;
        this.f6658 = str2;
        this.f6660 = str3;
        this.f6667 = z;
        this.f6665 = z2;
        this.f6662 = j;
        this.f6659 = j2;
        this.f6668 = j3;
        this.f6666 = num;
        this.f6664 = str4;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m6835() {
        return this.f6661;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m6840() {
        return this.f6663;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m6838() {
        return this.f6658;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m6839() {
        return this.f6660;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m6837() {
        return this.f6667;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m6844() {
        return this.f6665;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m6834() {
        return this.f6662;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m6842(long j) {
        this.f6662 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m6832() {
        return this.f6659;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6833(long j) {
        this.f6659 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m6831() {
        return this.f6668;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m6836(long j) {
        this.f6668 = j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Integer m6841() {
        return this.f6666;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m6843() {
        return this.f6664;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C1997 m6830(IInArchive iInArchive, int i) {
        String fileName;
        long time;
        long j;
        long j2;
        boolean z;
        ArchiveFormat archiveFormat = iInArchive.getArchiveFormat();
        if (archiveFormat != null && archiveFormat.supportMultipleFiles()) {
            Object property = iInArchive.getProperty(i, PropID.IS_FOLDER);
            C15243.m36587(property, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) property).booleanValue();
            String stringProperty = iInArchive.getStringProperty(i, PropID.PATH);
            C15243.m36591(stringProperty, "getStringProperty(...)");
            String strReplace = stringProperty.replace('\\', '/');
            C15243.m36591(strReplace, "replace(...)");
            if (zBooleanValue && !C0878.m3579(strReplace, "/", false)) {
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
            C15243.m36591(fileName, "getFileName(...)");
            int iM3583 = C0878.m3583(fileName);
            if (iM3583 != -1) {
                fileName = fileName.substring(0, iM3583);
                C15243.m36591(fileName, "substring(...)");
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
        C8002 c8002 = new C8002(fileName);
        String strM21843 = c8002.m21843();
        int i2 = C2494.f7991;
        String parent = c8002.getParent();
        String strConcat = parent != null ? "/".concat(parent) : "/";
        Boolean bool = (Boolean) iInArchive.getProperty(i, PropID.ENCRYPTED);
        boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
        Integer num = (Integer) iInArchive.getProperty(i, PropID.CRC);
        String stringProperty2 = iInArchive.getStringProperty(i, PropID.SYM_LINK);
        if (stringProperty2 != null && stringProperty2.length() == 0) {
            stringProperty2 = null;
        }
        C15243.m36586((Object) strM21843);
        C15243.m36586((Object) strConcat);
        return new C1997(i, fileName, strM21843, strConcat, z, zBooleanValue2, j2, j, time, num, stringProperty2);
    }
}
