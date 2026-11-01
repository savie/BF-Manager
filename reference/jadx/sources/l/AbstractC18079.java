package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: V9OM */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18079 implements InterfaceC23206 {
    public int memoizedHashCode = 0;

    @Override // l.InterfaceC23206
    public AbstractC23725 toByteString() {
        try {
            int serializedSize = getSerializedSize();
            AbstractC23725 abstractC23725 = AbstractC23725.f76778;
            C12436 c12436 = new C12436(serializedSize);
            writeTo(c12436.m30910());
            return c12436.m30909();
        } catch (IOException e) {
            throw new RuntimeException(m42072("ByteString"), e);
        }
    }

    @Override // l.InterfaceC23206
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            int i = AbstractC22044.f71447;
            C11461 c11461 = new C11461(bArr, serializedSize);
            writeTo(c11461);
            if (c11461.mo28606() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(m42072("byte array"), e);
        }
    }

    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int i = AbstractC22044.f71447;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        C5110 c5110 = new C5110(outputStream, serializedSize);
        writeTo(c5110);
        c5110.m14247();
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int iM48959 = AbstractC22044.m48959(serializedSize) + serializedSize;
        if (iM48959 > 4096) {
            iM48959 = 4096;
        }
        C5110 c5110 = new C5110(outputStream, iM48959);
        c5110.mo14248(serializedSize);
        writeTo(c5110);
        c5110.m14247();
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(InterfaceC6667 interfaceC6667) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int iMo18053 = interfaceC6667.mo18053(this);
        setMemoizedSerializedSize(iMo18053);
        return iMo18053;
    }

    public C2474 newUninitializedMessageException() {
        return new C2474();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m42072(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42074(AbstractC23725 abstractC23725) {
        if (!abstractC23725.mo16494()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42073(Iterable iterable, List list) {
        AbstractC21607.m48315(iterable, list);
    }
}
