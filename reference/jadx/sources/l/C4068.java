package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۘۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6JG */
/* JADX INFO: loaded from: classes2.dex */
public final class C4068 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f13884;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Predicate f13885;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f13886;

    public C4068(Predicate predicate) {
        this.f13885 = predicate;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13142(String str, int i, byte[] bArr) {
        if (this.f13884) {
            return;
        }
        if ((this.f13886 == null || i == 3) && !"-->".equals(str) && bArr.length != 0 && bArr.length <= 8388608 && this.f13885.test(bArr)) {
            this.f13886 = bArr;
            this.f13884 = i == 3;
        }
    }
}
