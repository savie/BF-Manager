package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۬᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: FB7W */
/* JADX INFO: loaded from: classes4.dex */
public final class C14148 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f44735;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f44736;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f44737;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f44738;

    public C14148(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2) {
        this.f44735 = byteBuffer;
        this.f44737 = byteBuffer2;
        this.f44736 = i;
        this.f44738 = i2;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m34368() {
        return this.f44736;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m34366() {
        return this.f44738;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m34367() {
        return this.f44735.slice();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m34365() {
        return this.f44737.slice();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23012 m34364() {
        return new C23012(this.f44737.slice());
    }
}
