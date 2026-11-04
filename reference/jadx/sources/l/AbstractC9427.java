package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: renamed from: l.ۡܰܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9OM */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9427 implements InterfaceC18775 {
    public int memoizedHashCode = 0;

    @Override // l.InterfaceC18775
    public AbstractC17084 toByteString() {
        try {
            int serializedSize = getSerializedSize();
            AbstractC17084 abstractC17084 = AbstractC17084.f55772;
            C5898 c5898 = new C5898(serializedSize);
            writeTo(c5898.m17120());
            return c5898.m17119();
        } catch (IOException e) {
            throw new RuntimeException(m24801("ByteString"), e);
        }
    }

    @Override // l.InterfaceC18775
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            int i = AbstractC14846.f48541;
            C6644 c6644 = new C6644(bArr, serializedSize);
            writeTo(c6644);
            if (c6644.mo18582() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(m24801("byte array"), e);
        }
    }

    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int i = AbstractC14846.f48541;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        C4406 c4406 = new C4406(outputStream, serializedSize);
        writeTo(c4406);
        c4406.m14017();
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int iM35763 = AbstractC14846.m35763(serializedSize) + serializedSize;
        if (iM35763 > 4096) {
            iM35763 = 4096;
        }
        C4406 c4406 = new C4406(outputStream, iM35763);
        c4406.mo14018(serializedSize);
        writeTo(c4406);
        c4406.m14017();
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(InterfaceC7762 interfaceC7762) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int iMo21137 = interfaceC7762.mo21137(this);
        setMemoizedSerializedSize(iMo21137);
        return iMo21137;
    }

    public C24128 newUninitializedMessageException() {
        return new C24128();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private String m24801(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24803(AbstractC17084 abstractC17084) {
        if (!abstractC17084.mo29729()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24802(Iterable iterable, List list) {
        AbstractC1225.m4447(iterable, list);
    }
}
