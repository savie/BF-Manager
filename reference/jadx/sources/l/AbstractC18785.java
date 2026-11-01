package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ᩴ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: C9P0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18785 implements InterfaceC6271 {
    public static final C2701 EMPTY_REGISTRY = C2701.m8236();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C2474 m43339(InterfaceC23206 interfaceC23206) {
        if (interfaceC23206 instanceof AbstractC18079) {
            return ((AbstractC18079) interfaceC23206).newUninitializedMessageException();
        }
        return new C2474();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC23206 m43338(InterfaceC23206 interfaceC23206) throws C4529 {
        if (interfaceC23206 == null || interfaceC23206.isInitialized()) {
            return interfaceC23206;
        }
        C4529 c4529M7587 = m43339(interfaceC23206).m7587();
        c4529M7587.m12651(interfaceC23206);
        throw c4529M7587;
    }

    @Override // 
    public InterfaceC23206 parsePartialFrom(AbstractC3262 abstractC3262) {
        return (InterfaceC23206) parsePartialFrom(abstractC3262, EMPTY_REGISTRY);
    }

    @Override // l.InterfaceC6271
    public InterfaceC23206 parseFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        return m43338((InterfaceC23206) parsePartialFrom(abstractC3262, c2701));
    }

    @Override // l.InterfaceC6271
    public InterfaceC23206 parseFrom(AbstractC3262 abstractC3262) {
        return parseFrom(abstractC3262, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC23206 parsePartialFrom(AbstractC23725 abstractC23725, C2701 c2701) throws C4529 {
        AbstractC3262 abstractC3262Mo16491 = abstractC23725.mo16491();
        InterfaceC23206 interfaceC23206 = (InterfaceC23206) parsePartialFrom(abstractC3262Mo16491, c2701);
        try {
            abstractC3262Mo16491.mo6025(0);
            return interfaceC23206;
        } catch (C4529 e) {
            e.m12651(interfaceC23206);
            throw e;
        }
    }

    @Override // 
    public InterfaceC23206 parsePartialFrom(AbstractC23725 abstractC23725) {
        return parsePartialFrom(abstractC23725, EMPTY_REGISTRY);
    }

    @Override // l.InterfaceC6271
    public InterfaceC23206 parseFrom(AbstractC23725 abstractC23725, C2701 c2701) {
        return m43338(parsePartialFrom(abstractC23725, c2701));
    }

    @Override // l.InterfaceC6271
    public InterfaceC23206 parseFrom(AbstractC23725 abstractC23725) {
        return parseFrom(abstractC23725, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC23206 parsePartialFrom(byte[] bArr, int i, int i2, C2701 c2701) throws C4529 {
        AbstractC3262 abstractC3262M9743 = AbstractC3262.m9743(false, i, i2, bArr);
        InterfaceC23206 interfaceC23206 = (InterfaceC23206) parsePartialFrom(abstractC3262M9743, c2701);
        try {
            abstractC3262M9743.mo6025(0);
            return interfaceC23206;
        } catch (C4529 e) {
            e.m12651(interfaceC23206);
            throw e;
        }
    }

    @Override // l.InterfaceC6271
    public InterfaceC23206 parseFrom(ByteBuffer byteBuffer) {
        return parseFrom(byteBuffer, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC23206 parsePartialFrom(byte[] bArr, int i, int i2) {
        return parsePartialFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC23206 parsePartialFrom(byte[] bArr, C2701 c2701) {
        return parsePartialFrom(bArr, 0, bArr.length, c2701);
    }

    @Override // l.InterfaceC6271
    public InterfaceC23206 parseFrom(ByteBuffer byteBuffer, C2701 c2701) throws C4529 {
        AbstractC3262 abstractC3262M9743;
        if (byteBuffer.hasArray()) {
            abstractC3262M9743 = AbstractC3262.m9743(false, byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), byteBuffer.array());
        } else if (byteBuffer.isDirect() && C15882.m37783()) {
            abstractC3262M9743 = new C9614(byteBuffer, false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            abstractC3262M9743 = AbstractC3262.m9743(true, 0, iRemaining, bArr);
        }
        InterfaceC23206 interfaceC23206 = (InterfaceC23206) parsePartialFrom(abstractC3262M9743, c2701);
        try {
            abstractC3262M9743.mo6025(0);
            return m43338(interfaceC23206);
        } catch (C4529 e) {
            e.m12651(interfaceC23206);
            throw e;
        }
    }

    @Override // 
    public InterfaceC23206 parsePartialFrom(byte[] bArr) {
        return parsePartialFrom(bArr, 0, bArr.length, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC23206 parseFrom(byte[] bArr, int i, int i2, C2701 c2701) {
        return m43338(parsePartialFrom(bArr, i, i2, c2701));
    }

    @Override // 
    public InterfaceC23206 parseFrom(byte[] bArr, int i, int i2) {
        return parseFrom(bArr, i, i2, EMPTY_REGISTRY);
    }

    @Override // l.InterfaceC6271
    public InterfaceC23206 parseFrom(byte[] bArr, C2701 c2701) {
        return parseFrom(bArr, 0, bArr.length, c2701);
    }

    @Override // l.InterfaceC6271
    public InterfaceC23206 parseFrom(byte[] bArr) {
        return parseFrom(bArr, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC23206 parsePartialFrom(InputStream inputStream, C2701 c2701) throws C4529 {
        AbstractC3262 abstractC3262M9742 = AbstractC3262.m9742(inputStream);
        InterfaceC23206 interfaceC23206 = (InterfaceC23206) parsePartialFrom(abstractC3262M9742, c2701);
        try {
            abstractC3262M9742.mo6025(0);
            return interfaceC23206;
        } catch (C4529 e) {
            e.m12651(interfaceC23206);
            throw e;
        }
    }

    @Override // 
    public InterfaceC23206 parsePartialFrom(InputStream inputStream) {
        return parsePartialFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // l.InterfaceC6271
    public InterfaceC23206 parseFrom(InputStream inputStream, C2701 c2701) {
        return m43338(parsePartialFrom(inputStream, c2701));
    }

    @Override // l.InterfaceC6271
    public InterfaceC23206 parseFrom(InputStream inputStream) {
        return parseFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // 
    public InterfaceC23206 parsePartialDelimitedFrom(InputStream inputStream, C2701 c2701) throws C4529 {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            return parsePartialFrom((InputStream) new C15258(inputStream, AbstractC3262.m9740(inputStream, i)), c2701);
        } catch (IOException e) {
            throw new C4529(e.getMessage(), e);
        }
    }

    @Override // 
    public InterfaceC23206 parsePartialDelimitedFrom(InputStream inputStream) {
        return parsePartialDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }

    @Override // l.InterfaceC6271
    public InterfaceC23206 parseDelimitedFrom(InputStream inputStream, C2701 c2701) {
        return m43338(parsePartialDelimitedFrom(inputStream, c2701));
    }

    @Override // l.InterfaceC6271
    public InterfaceC23206 parseDelimitedFrom(InputStream inputStream) {
        return parseDelimitedFrom(inputStream, EMPTY_REGISTRY);
    }
}
