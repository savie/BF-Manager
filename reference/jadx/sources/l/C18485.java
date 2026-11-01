package l;

import java.io.Closeable;

/* JADX INFO: renamed from: l.ᩴۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: O5QJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18485 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C18485 f58906;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f58907;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f58908;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String f58909;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C22719 f58910;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18485 f58911;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C17261 f58912;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC22013 f58913;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC19191 f58914;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f58915;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C10912 f58916;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile C13734 f58917;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C18485 f58918;

    public C18485(C17779 c17779) {
        this.f58910 = c17779.f56381;
        this.f58913 = c17779.f56372;
        this.f58915 = c17779.f56376;
        this.f58909 = c17779.f56380;
        this.f58912 = c17779.f56371;
        C5972 c5972 = c17779.f56374;
        c5972.getClass();
        this.f58916 = new C10912(c5972);
        this.f58914 = c17779.f56373;
        this.f58911 = c17779.f56370;
        this.f58906 = c17779.f56378;
        this.f58918 = c17779.f56377;
        this.f58908 = c17779.f56379;
        this.f58907 = c17779.f56375;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C22719 m42866() {
        return this.f58910;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m42858() {
        return this.f58915;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m42863() {
        int i = this.f58915;
        return i >= 200 && i < 300;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String m42868() {
        return this.f58909;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C17261 m42869() {
        return this.f58912;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m42859(String str) {
        String strM27345 = this.f58916.m27345(str);
        if (strM27345 != null) {
            return strM27345;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C10912 m42857() {
        return this.f58916;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19191 m42860() {
        return this.f58914;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17779 m42864() {
        C17779 c17779 = new C17779();
        c17779.f56381 = this.f58910;
        c17779.f56372 = this.f58913;
        c17779.f56376 = this.f58915;
        c17779.f56380 = this.f58909;
        c17779.f56371 = this.f58912;
        c17779.f56374 = this.f58916.m27346();
        c17779.f56373 = this.f58914;
        c17779.f56370 = this.f58911;
        c17779.f56378 = this.f58906;
        c17779.f56377 = this.f58918;
        c17779.f56379 = this.f58908;
        c17779.f56375 = this.f58907;
        return c17779;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C18485 m42865() {
        return this.f58918;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C13734 m42862() {
        C13734 c13734 = this.f58917;
        if (c13734 != null) {
            return c13734;
        }
        C13734 c13734M33476 = C13734.m33476(this.f58916);
        this.f58917 = c13734M33476;
        return c13734M33476;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m42867() {
        return this.f58908;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final long m42861() {
        return this.f58907;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC19191 abstractC19191 = this.f58914;
        if (abstractC19191 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC19191.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f58913 + ", code=" + this.f58915 + ", message=" + this.f58909 + ", url=" + this.f58910.f74015 + '}';
    }
}
