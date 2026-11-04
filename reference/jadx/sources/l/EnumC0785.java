package l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.֡᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59EU */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC0785 implements InterfaceC22896 {
    FILE_SHARE_READ(1),
    FILE_SHARE_WRITE(2),
    FILE_SHARE_DELETE(4);


    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Set f2811 = C4681.unmodifiableSet(EnumSet.allOf(EnumC0785.class));

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f2814;

    EnumC0785(long j) {
        this.f2814 = j;
    }

    @Override // l.InterfaceC22896
    public long getValue() {
        return this.f2814;
    }
}
