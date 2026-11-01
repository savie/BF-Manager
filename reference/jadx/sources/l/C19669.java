package l;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: renamed from: l.᩵᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1HV */
/* JADX INFO: loaded from: classes4.dex */
public final class C19669 implements Cloneable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC16846 f63133;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC12613 f63131 = EnumC12613.base;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Charset f63130 = C2734.f10510;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f63126 = new ThreadLocal();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f63127 = true;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f63129 = 1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f63132 = 30;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC8380 f63128 = EnumC8380.html;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC12613 m44798() {
        return this.f63131;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44796(EnumC12613 enumC12613) {
        this.f63131 = enumC12613;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CharsetEncoder m44801() {
        CharsetEncoder charsetEncoderNewEncoder = this.f63130.newEncoder();
        this.f63126.set(charsetEncoderNewEncoder);
        this.f63133 = EnumC16846.m39509(charsetEncoderNewEncoder.charset().name());
        return charsetEncoderNewEncoder;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharsetEncoder m44794() {
        CharsetEncoder charsetEncoder = (CharsetEncoder) this.f63126.get();
        return charsetEncoder != null ? charsetEncoder : m44801();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final EnumC8380 m44793() {
        return this.f63128;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44795(EnumC8380 enumC8380) {
        this.f63128 = enumC8380;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m44800() {
        return this.f63127;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m44799() {
        this.f63127 = false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m44792() {
        return this.f63129;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m44797() {
        return this.f63132;
    }

    public final C19669 clone() {
        try {
            C19669 c19669 = (C19669) super.clone();
            String strName = this.f63130.name();
            c19669.getClass();
            c19669.f63130 = Charset.forName(strName);
            c19669.f63131 = EnumC12613.valueOf(this.f63131.name());
            return c19669;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
