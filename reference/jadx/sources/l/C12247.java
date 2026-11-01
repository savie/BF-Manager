package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.۫ۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7VC */
/* JADX INFO: loaded from: classes4.dex */
public final class C12247 extends AbstractC0251 {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f40988 = "vt100";

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f40985 = 80;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f40984 = 24;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f40986 = 640;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f40989 = 480;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public byte[] f40987 = C8491.f29422;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30455(String str) {
        this.f40988 = str;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30454(int i, int i2, int i3, int i4) {
        this.f40985 = i;
        this.f40984 = i2;
        this.f40986 = i3;
        this.f40989 = i4;
    }

    @Override // l.AbstractC0251
    /* JADX INFO: renamed from: ۙ */
    public final void mo1688(C3073 c3073, AbstractC7848 abstractC7848) {
        super.mo1688(c3073, abstractC7848);
        C14904 c14904 = new C14904();
        C7307 c7307 = new C7307(c14904);
        c7307.m19501();
        c14904.m35630((byte) 98);
        c14904.m35644(abstractC7848.f25821);
        byte[] bArr = C8491.f29422;
        Charset charset = StandardCharsets.UTF_8;
        c14904.m35627("pty-req".getBytes(charset));
        c14904.m35630(m1691() ? (byte) 1 : (byte) 0);
        c14904.m35627(C8491.m22175(this.f40988, charset));
        c14904.m35644(this.f40985);
        c14904.m35644(this.f40984);
        c14904.m35644(this.f40986);
        c14904.m35644(this.f40989);
        c14904.m35627(this.f40987);
        m1689(c7307);
    }
}
