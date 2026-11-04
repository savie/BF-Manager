package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۤܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11029 extends AbstractC2716 {
    @Override // l.AbstractC2716, l.InterfaceC11490
    public final /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream) {
        return super.parseDelimitedFrom(inputStream);
    }

    @Override // l.AbstractC2716, l.InterfaceC11490
    public final /* bridge */ /* synthetic */ Object parseDelimitedFrom(InputStream inputStream, C24215 c24215) {
        return super.parseDelimitedFrom(inputStream, c24215);
    }

    @Override // l.AbstractC2716, l.InterfaceC11490
    public final /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream) {
        return super.parseFrom(inputStream);
    }

    @Override // l.AbstractC2716, l.InterfaceC11490
    public final /* bridge */ /* synthetic */ Object parseFrom(InputStream inputStream, C24215 c24215) {
        return super.parseFrom(inputStream, c24215);
    }

    @Override // l.AbstractC2716, l.InterfaceC11490
    public final /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer) {
        return super.parseFrom(byteBuffer);
    }

    @Override // l.AbstractC2716, l.InterfaceC11490
    public final /* bridge */ /* synthetic */ Object parseFrom(ByteBuffer byteBuffer, C24215 c24215) {
        return super.parseFrom(byteBuffer, c24215);
    }

    @Override // l.AbstractC2716, l.InterfaceC11490
    public final /* bridge */ /* synthetic */ Object parseFrom(AbstractC3660 abstractC3660) {
        return super.parseFrom(abstractC3660);
    }

    @Override // l.AbstractC2716, l.InterfaceC11490
    public final /* bridge */ /* synthetic */ Object parseFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        return super.parseFrom(abstractC3660, c24215);
    }

    @Override // l.AbstractC2716, l.InterfaceC11490
    public final /* bridge */ /* synthetic */ Object parseFrom(AbstractC17084 abstractC17084) {
        return super.parseFrom(abstractC17084);
    }

    @Override // l.AbstractC2716, l.InterfaceC11490
    public final /* bridge */ /* synthetic */ Object parseFrom(AbstractC17084 abstractC17084, C24215 c24215) {
        return super.parseFrom(abstractC17084, c24215);
    }

    @Override // l.AbstractC2716, l.InterfaceC11490
    public final /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr) {
        return super.parseFrom(bArr);
    }

    @Override // l.AbstractC2716
    public final /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, int i, int i2) {
        return super.parseFrom(bArr, i, i2);
    }

    @Override // l.AbstractC2716
    public final /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, int i, int i2, C24215 c24215) {
        return super.parseFrom(bArr, i, i2, c24215);
    }

    @Override // l.AbstractC2716, l.InterfaceC11490
    public final /* bridge */ /* synthetic */ Object parseFrom(byte[] bArr, C24215 c24215) {
        return super.parseFrom(bArr, c24215);
    }

    @Override // l.AbstractC2716
    public final /* bridge */ /* synthetic */ Object parsePartialDelimitedFrom(InputStream inputStream) {
        return super.parsePartialDelimitedFrom(inputStream);
    }

    @Override // l.AbstractC2716
    public final /* bridge */ /* synthetic */ Object parsePartialDelimitedFrom(InputStream inputStream, C24215 c24215) {
        return super.parsePartialDelimitedFrom(inputStream, c24215);
    }

    @Override // l.AbstractC2716
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(InputStream inputStream) {
        return super.parsePartialFrom(inputStream);
    }

    @Override // l.AbstractC2716
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(InputStream inputStream, C24215 c24215) {
        return super.parsePartialFrom(inputStream, c24215);
    }

    @Override // l.AbstractC2716
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(AbstractC3660 abstractC3660) {
        return super.parsePartialFrom(abstractC3660);
    }

    @Override // l.AbstractC2716
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(AbstractC17084 abstractC17084) {
        return super.parsePartialFrom(abstractC17084);
    }

    @Override // l.AbstractC2716
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(AbstractC17084 abstractC17084, C24215 c24215) {
        return super.parsePartialFrom(abstractC17084, c24215);
    }

    @Override // l.AbstractC2716
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(byte[] bArr) {
        return super.parsePartialFrom(bArr);
    }

    @Override // l.AbstractC2716
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(byte[] bArr, int i, int i2) {
        return super.parsePartialFrom(bArr, i, i2);
    }

    @Override // l.AbstractC2716
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(byte[] bArr, int i, int i2, C24215 c24215) {
        return super.parsePartialFrom(bArr, i, i2, c24215);
    }

    @Override // l.AbstractC2716
    public final /* bridge */ /* synthetic */ Object parsePartialFrom(byte[] bArr, C24215 c24215) {
        return super.parsePartialFrom(bArr, c24215);
    }

    @Override // l.InterfaceC11490
    public final Object parsePartialFrom(AbstractC3660 abstractC3660, C24215 c24215) throws C20463 {
        C22964 c22964NewBuilder = C19980.newBuilder();
        try {
            c22964NewBuilder.m51822mergeFrom(abstractC3660, c24215);
            return c22964NewBuilder.buildPartial();
        } catch (C20463 e) {
            e.m46972(c22964NewBuilder.buildPartial());
            throw e;
        } catch (IOException e2) {
            C20463 c20463 = new C20463(e2.getMessage(), e2);
            c20463.m46972(c22964NewBuilder.buildPartial());
            throw c20463;
        } catch (C24128 e3) {
            C20463 c20463M53671 = e3.m53671();
            c20463M53671.m46972(c22964NewBuilder.buildPartial());
            throw c20463M53671;
        }
    }
}
