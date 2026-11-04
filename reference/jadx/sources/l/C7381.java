package l;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: renamed from: l.ۜ᩶ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1HV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7381 implements Cloneable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC13259 f24297;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public EnumC5802 f24290 = EnumC5802.base;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Charset f24294 = C4398.f15826;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ThreadLocal f24295 = new ThreadLocal();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f24293 = true;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f24292 = 1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f24296 = 30;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public EnumC8872 f24291 = EnumC8872.html;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC5802 m20284() {
        return this.f24290;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20277(EnumC5802 enumC5802) {
        this.f24290 = enumC5802;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final CharsetEncoder m20282() {
        CharsetEncoder charsetEncoderNewEncoder = this.f24294.newEncoder();
        this.f24295.set(charsetEncoderNewEncoder);
        this.f24297 = EnumC13259.m32804(charsetEncoderNewEncoder.charset().name());
        return charsetEncoderNewEncoder;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final CharsetEncoder m20276() {
        CharsetEncoder charsetEncoder = (CharsetEncoder) this.f24295.get();
        return charsetEncoder != null ? charsetEncoder : m20282();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC8872 m20275() {
        return this.f24291;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20278(EnumC8872 enumC8872) {
        this.f24291 = enumC8872;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m20280() {
        return this.f24293;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m20279() {
        this.f24293 = false;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m20281() {
        return this.f24292;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m20283() {
        return this.f24296;
    }

    public final C7381 clone() {
        try {
            C7381 c7381 = (C7381) super.clone();
            String strName = this.f24294.name();
            c7381.getClass();
            c7381.f24294 = Charset.forName(strName);
            c7381.f24290 = EnumC5802.valueOf(this.f24290.name());
            return c7381;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
