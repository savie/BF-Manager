package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩵᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19783 extends AbstractC18785 {
    @Override // l.AbstractC18785, l.InterfaceC6271
    public final /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
        return super.parseDelimitedFrom(inputStream);
    }

    @Override // l.AbstractC18785, l.InterfaceC6271
    public final /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, C2701 c2701) {
        return super.parseDelimitedFrom(inputStream, c2701);
    }

    @Override // l.AbstractC18785, l.InterfaceC6271
    public final /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
        return super.parseFrom(inputStream);
    }

    @Override // l.AbstractC18785, l.InterfaceC6271
    public final /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, C2701 c2701) {
        return super.parseFrom(inputStream, c2701);
    }

    @Override // l.AbstractC18785, l.InterfaceC6271
    public final /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
        return super.parseFrom(byteBuffer);
    }

    @Override // l.AbstractC18785, l.InterfaceC6271
    public final /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, C2701 c2701) {
        return super.parseFrom(byteBuffer, c2701);
    }

    @Override // l.AbstractC18785, l.InterfaceC6271
    public final /* bridge */ /* synthetic */ Object parseFrom(AbstractC3262 abstractC3262) {
        return super.parseFrom(abstractC3262);
    }

    @Override // l.AbstractC18785, l.InterfaceC6271
    public final /* bridge */ /* synthetic */ Object parseFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        return super.parseFrom(abstractC3262, c2701);
    }

    @Override // l.AbstractC18785, l.InterfaceC6271
    public final /* bridge */ /* synthetic */ Object parseFrom(AbstractC23725 abstractC23725) {
        return super.parseFrom(abstractC23725);
    }

    @Override // l.AbstractC18785, l.InterfaceC6271
    public final /* bridge */ /* synthetic */ Object parseFrom(AbstractC23725 abstractC23725, C2701 c2701) {
        return super.parseFrom(abstractC23725, c2701);
    }

    @Override // l.AbstractC18785, l.InterfaceC6271
    public final /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
        return super.parseFrom(bArr);
    }

    @Override // l.AbstractC18785
    public final /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, int i, int i2) {
        return super.parseFrom(bArr, i, i2);
    }

    @Override // l.AbstractC18785
    public final /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, int i, int i2, C2701 c2701) {
        return super.parseFrom(bArr, i, i2, c2701);
    }

    @Override // l.AbstractC18785, l.InterfaceC6271
    public final /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, C2701 c2701) {
        return super.parseFrom(bArr, c2701);
    }

    @Override // l.AbstractC18785
    public final /* bridge */ /* synthetic */ Object parsePartialDelimitedFrom(InputStream inputStream) {
        return super.parsePartialDelimitedFrom(inputStream);
    }

    @Override // l.AbstractC18785
    public final /* bridge */ /* synthetic */ Object parsePartialDelimitedFrom(InputStream inputStream, C2701 c2701) {
        return super.parsePartialDelimitedFrom(inputStream, c2701);
    }

    @Override // l.AbstractC18785
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(InputStream inputStream) {
        return super.parsePartialFrom(inputStream);
    }

    @Override // l.AbstractC18785
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(InputStream inputStream, C2701 c2701) {
        return super.parsePartialFrom(inputStream, c2701);
    }

    @Override // l.AbstractC18785
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(AbstractC3262 abstractC3262) {
        return super.parsePartialFrom(abstractC3262);
    }

    @Override // l.AbstractC18785
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(AbstractC23725 abstractC23725) {
        return super.parsePartialFrom(abstractC23725);
    }

    @Override // l.AbstractC18785
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(AbstractC23725 abstractC23725, C2701 c2701) {
        return super.parsePartialFrom(abstractC23725, c2701);
    }

    @Override // l.AbstractC18785
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(byte[] bArr) {
        return super.parsePartialFrom(bArr);
    }

    @Override // l.AbstractC18785
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(byte[] bArr, int i, int i2) {
        return super.parsePartialFrom(bArr, i, i2);
    }

    @Override // l.AbstractC18785
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(byte[] bArr, int i, int i2, C2701 c2701) {
        return super.parsePartialFrom(bArr, i, i2, c2701);
    }

    @Override // l.AbstractC18785
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(byte[] bArr, C2701 c2701) {
        return super.parsePartialFrom(bArr, c2701);
    }

    @Override // l.InterfaceC6271
    public final Object parsePartialFrom(AbstractC3262 abstractC3262, C2701 c2701) throws C4529 {
        C9200 c9200NewBuilder = C10611.newBuilder();
        try {
            c9200NewBuilder.m23660(abstractC3262, c2701);
            return c9200NewBuilder.buildPartial();
        } catch (C2474 e) {
            C4529 c4529M7587 = e.m7587();
            c4529M7587.m12651(c9200NewBuilder.buildPartial());
            throw c4529M7587;
        } catch (C4529 e2) {
            e2.m12651(c9200NewBuilder.buildPartial());
            throw e2;
        } catch (IOException e3) {
            C4529 c4529 = new C4529(e3.getMessage(), e3);
            c4529.m12651(c9200NewBuilder.buildPartial());
            throw c4529;
        }
    }
}
