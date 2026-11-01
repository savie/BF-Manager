package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۚۚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: FB7W */
/* JADX INFO: loaded from: classes2.dex */
public final class C5136 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f17862;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f17863;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f17864;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f17865;

    public C5136(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2) {
        this.f17863 = byteBuffer;
        this.f17865 = byteBuffer2;
        this.f17864 = i;
        this.f17862 = i2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m14294() {
        return this.f17864;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m14296() {
        return this.f17862;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m14298() {
        return this.f17863.slice();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer m14297() {
        return this.f17865.slice();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3724 m14295() {
        return new C3724(this.f17865.slice());
    }
}
