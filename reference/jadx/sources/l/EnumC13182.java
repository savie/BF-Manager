package l;

import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: renamed from: l.۬ܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 59EU */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC13182 implements InterfaceC15861 {
    FILE_SHARE_READ(1),
    FILE_SHARE_WRITE(2),
    FILE_SHARE_DELETE(4);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Set f43879 = C0561.unmodifiableSet(EnumSet.allOf(EnumC13182.class));

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f43884;

    EnumC13182(long j) {
        this.f43884 = j;
    }

    @Override // l.InterfaceC15861
    public long getValue() {
        return this.f43884;
    }
}
