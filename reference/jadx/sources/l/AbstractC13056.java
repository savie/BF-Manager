package l;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: l.۬ۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J89P */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13056 implements InterfaceC18659 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f43518;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f43519 = "";

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f43520;

    public final int hashCode() {
        return C13638.hash(Boolean.TRUE, this.f43519);
    }

    public final String toString() {
        String str = this.f43519;
        return str == null ? "null" : C16523.m38890("\"", str, "\"");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m32255() {
        return this.f43519;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32256(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Expected non-null value");
        }
        this.f43519 = str;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m32258(C21481 c21481) throws IOException {
        c21481.m48096(EnumC17953.FOUR);
        c21481.m48099(this.f43519.length() + 1);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m32259(C21481 c21481) throws IOException {
        c21481.m48096(EnumC17953.FOUR);
        c21481.m48099(0);
        c21481.m48099(this.f43519.length() + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32257(C21481 c21481) throws IOException {
        c21481.m48095(this.f43519);
        c21481.m48098(0);
    }

    @Override // l.InterfaceC18659
    /* JADX INFO: renamed from: ۨ */
    public final void mo7579(C15132 c15132) throws EOFException {
        c15132.m36284(EnumC17953.FOUR);
        c15132.m36283(4);
    }

    @Override // l.InterfaceC18659
    /* JADX INFO: renamed from: ܰ */
    public final void mo7580(C15132 c15132) {
        c15132.m36284(EnumC17953.FOUR);
        this.f43520 = m32254("Offset", c15132);
        this.f43518 = m32254("ActualCount", c15132);
    }

    @Override // l.InterfaceC18659
    /* JADX INFO: renamed from: ۙ */
    public final void mo7578(C15132 c15132) throws EOFException {
        boolean z;
        c15132.m36284(EnumC17953.TWO);
        c15132.m36283(this.f43520 * 2);
        int i = this.f43518;
        if (i > 0) {
            i--;
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(c15132.m36289());
        }
        this.f43519 = sb.toString();
        if (z) {
            c15132.m36283(2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC13056) && C13638.equals(this.f43519, ((AbstractC13056) obj).f43519);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m32254(String str, C15132 c15132) throws C22893 {
        long jM36287 = c15132.m36287();
        if (jM36287 <= 2147483647L) {
            return (int) jM36287;
        }
        throw new C22893(String.format("%s %d > %d", str, Long.valueOf(jM36287), Integer.MAX_VALUE));
    }
}
