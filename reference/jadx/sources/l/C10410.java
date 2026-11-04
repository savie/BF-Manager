package l;

import net.sf.sevenzipjbinding.PropID;

/* JADX INFO: renamed from: l.ۢ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: YB6A */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10410 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int[] f33098;

    static {
        int[] iArr = new int[PropID.values().length];
        f33098 = iArr;
        try {
            iArr[PropID.SIZE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f33098[PropID.PACKED_SIZE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f33098[PropID.IS_FOLDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f33098[PropID.ENCRYPTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f33098[PropID.TIME_TYPE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
