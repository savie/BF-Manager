package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۖܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9P0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2716 implements InterfaceC11490 {
    public static final C24215 EMPTY_REGISTRY = C24215.m54206();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C24128 m9039(InterfaceC18775 interfaceC18775) {
        if (interfaceC18775 instanceof AbstractC9427) {
            return ((AbstractC9427) interfaceC18775).newUninitializedMessageException();
        }
        return new C24128();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC18775 m9038(InterfaceC18775 interfaceC18775) throws C20463 {
        if (interfaceC18775 == null || interfaceC18775.isInitialized()) {
            return interfaceC18775;
        }
        C20463 c20463M53671 = m9039(interfaceC18775).m53671();
        c20463M53671.m46972(interfaceC18775);
        throw c20463M53671;
    }

    @Override // 
    public InterfaceC18775 parsePartialFrom(AbstractC3660 abstractC3660) {
        return (InterfaceC18775) parsePartialFrom(abstractC3660, EMPTY_REGISTRY);
    }

    @Override // l.InterfaceC11490
    public InterfaceC18775 parseFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        return m9038((InterfaceC18775) parsePartialFrom(abstractC3660, c24215));
    }

    @Override // l.InterfaceC11490
    public InterfaceC18775 parseFrom(AbstractC3660 abstractC3660) {
        return parseFrom(abstractC3660, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC18775 parsePartialFrom(AbstractC17084 abstractC17084, C24215 c24215) throws C20463 {
        AbstractC3660 abstractC3660Mo29725 = abstractC17084.mo29725();
        InterfaceC18775 interfaceC18775 = (InterfaceC18775) parsePartialFrom(abstractC3660Mo29725, c24215);
        try {
            abstractC3660Mo29725.mo11879(0);
            return interfaceC18775;
        } catch (C20463 e) {
            e.m46972(interfaceC18775);
            throw e;
        }
    }

    @Override // 
    public InterfaceC18775 parsePartialFrom(AbstractC17084 abstractC17084) {
        return parsePartialFrom(abstractC17084, EMPTY_REGISTRY);
    }

    @Override // l.InterfaceC11490
    public InterfaceC18775 parseFrom(AbstractC17084 abstractC17084, C24215 c24215) {
        return m9038(parsePartialFrom(abstractC17084, c24215));
    }

    @Override // l.InterfaceC11490
    public InterfaceC18775 parseFrom(AbstractC17084 abstractC17084) {
        return parseFrom(abstractC17084, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC18775 parsePartialFrom(byte[] bArr, int i, int i2, C24215 c24215) throws C20463 {
        AbstractC3660 abstractC3660M11872 = AbstractC3660.m11872(false, i, i2, bArr);
        InterfaceC18775 interfaceC18775 = (InterfaceC18775) parsePartialFrom(abstractC3660M11872, c24215);
        try {
            abstractC3660M11872.mo11879(0);
            return interfaceC18775;
        } catch (C20463 e) {
            e.m46972(interfaceC18775);
            throw e;
        }
    }

    @Override // l.InterfaceC11490
    public InterfaceC18775 parseFrom(ByteBuffer byteBuffer) {
        return parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC18775 parsePartialFrom(byte[] bArr, int i, int i2) {
        return parsePartialFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC18775 parsePartialFrom(byte[] bArr, C24215 c24215) {
        return parsePartialFrom(bArr, 0, bArr.length, c24215);
    }

    @Override // l.InterfaceC11490
    public InterfaceC18775 parseFrom(ByteBuffer byteBuffer, C24215 c24215) throws C20463 {
        AbstractC3660 abstractC3660M11872;
        if (byteBuffer.hasArray()) {
            abstractC3660M11872 = AbstractC3660.m11872(false, byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), byteBuffer.array());
        } else if (byteBuffer.isDirect() && C22832.m51523()) {
            abstractC3660M11872 = new C23798(byteBuffer, false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            abstractC3660M11872 = AbstractC3660.m11872(true, 0, iRemaining, bArr);
        }
        InterfaceC18775 interfaceC18775 = (InterfaceC18775) parsePartialFrom(abstractC3660M11872, c24215);
        try {
            abstractC3660M11872.mo11879(0);
            return m9038(interfaceC18775);
        } catch (C20463 e) {
            e.m46972(interfaceC18775);
            throw e;
        }
    }

    @Override // 
    public InterfaceC18775 parsePartialFrom(byte[] bArr) {
        return parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC18775 parseFrom(byte[] bArr, int i, int i2, C24215 c24215) {
        return m9038(parsePartialFrom(bArr, i, i2, c24215));
    }

    @Override // 
    public InterfaceC18775 parseFrom(byte[] bArr, int i, int i2) {
        return parseFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // l.InterfaceC11490
    public InterfaceC18775 parseFrom(byte[] bArr, C24215 c24215) {
        return parseFrom(bArr, 0, bArr.length, c24215);
    }

    @Override // l.InterfaceC11490
    public InterfaceC18775 parseFrom(byte[] bArr) {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC18775 parsePartialFrom(InputStream inputStream, C24215 c24215) throws C20463 {
        AbstractC3660 abstractC3660M11871 = AbstractC3660.m11871(inputStream);
        InterfaceC18775 interfaceC18775 = (InterfaceC18775) parsePartialFrom(abstractC3660M11871, c24215);
        try {
            abstractC3660M11871.mo11879(0);
            return interfaceC18775;
        } catch (C20463 e) {
            e.m46972(interfaceC18775);
            throw e;
        }
    }

    @Override // 
    public InterfaceC18775 parsePartialFrom(InputStream inputStream) {
        return parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // l.InterfaceC11490
    public InterfaceC18775 parseFrom(InputStream inputStream, C24215 c24215) {
        return m9038(parsePartialFrom(inputStream, c24215));
    }

    @Override // l.InterfaceC11490
    public InterfaceC18775 parseFrom(InputStream inputStream) {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC18775 parsePartialDelimitedFrom(InputStream inputStream, C24215 c24215) throws C20463 {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            return parsePartialFrom((InputStream) new C10173(inputStream, AbstractC3660.m11869(inputStream, i)), c24215);
        } catch (IOException e) {
            throw new C20463(e.getMessage(), e);
        }
    }

    @Override // 
    public InterfaceC18775 parsePartialDelimitedFrom(InputStream inputStream) {
        return parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // l.InterfaceC11490
    public InterfaceC18775 parseDelimitedFrom(InputStream inputStream, C24215 c24215) {
        return m9038(parsePartialDelimitedFrom(inputStream, c24215));
    }

    @Override // l.InterfaceC11490
    public InterfaceC18775 parseDelimitedFrom(InputStream inputStream) {
        return parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }
}
