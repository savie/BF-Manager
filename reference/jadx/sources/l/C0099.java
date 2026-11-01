package l;

import com.google.android.material.motion.MotionUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import net.sf.sevenzipjbinding.IInStream;
import net.sf.sevenzipjbinding.IOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.֡֫۠, reason: contains not printable characters */
/* JADX INFO: compiled from: RB61 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0099 implements IInStream, IOutStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f1031;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f1032;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f1033;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f1036;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f1037;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f1038;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ArrayList f1035 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f1034 = 1024;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] m1063() {
        byte[] bArr;
        bArr = new byte[this.f1033];
        int i = 0;
        for (byte[] bArr2 : this.f1035) {
            int length = bArr2.length + i;
            int i2 = this.f1033;
            int length2 = length > i2 ? i2 - i : bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i, length2);
            i += length2;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m1064() {
        m1059();
    }

    @Override // net.sf.sevenzipjbinding.ISeekableStream
    public final synchronized long seek(long j, int i) {
        int i2;
        try {
            if (i != 0) {
                if (i == 1) {
                    i2 = this.f1032;
                    if (i2 == -1) {
                        i2 = this.f1031;
                    }
                } else if (i == 2) {
                    i2 = this.f1033;
                } else {
                    throw new SevenZipException("Seek: unknown origin: " + i);
                }
                j += (long) i2;
            }
            if (j > this.f1037) {
                throw new RuntimeException("Maximal size of the byte array stream was reached by seek to " + j + ", maximal size is " + this.f1037 + " bytes");
            }
            this.f1032 = (int) j;
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    public C0099(int i) {
        if (i < 0) {
            throw new IllegalStateException("Maximal size of the byte array stream should be >0");
        }
        this.f1037 = i;
        m1059();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m1059() {
        this.f1035.clear();
        this.f1031 = 0;
        this.f1036 = 0;
        this.f1038 = -1;
        this.f1033 = 0;
        this.f1032 = -1;
    }

    @Override // net.sf.sevenzipjbinding.ISequentialInStream
    public final int read(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        synchronized (this) {
            try {
                if (iRemaining < 0) {
                    throw new IllegalStateException("Invalid start position (0) and length (" + iRemaining + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                if (this.f1032 <= this.f1033) {
                    m1062();
                    int i = this.f1031;
                    int i2 = i + iRemaining;
                    int i3 = this.f1033;
                    int i4 = i2 > i3 ? i3 - i : iRemaining;
                    int i5 = 0;
                    int i6 = i4;
                    while (i6 > 0) {
                        int length = ((byte[]) this.f1035.get(this.f1038)).length;
                        int i7 = length - this.f1036;
                        if (i6 <= i7) {
                            i7 = i6;
                        }
                        System.arraycopy(this.f1035.get(this.f1038), this.f1036, bArr, i5, i7);
                        i5 += i7;
                        int i8 = this.f1036 + i7;
                        this.f1036 = i8;
                        i6 -= i7;
                        if (i8 >= length && this.f1038 < this.f1035.size() - 1) {
                            int i9 = this.f1038 + 1;
                            this.f1038 = i9;
                            this.f1036 = 0;
                            int length2 = ((byte[]) this.f1035.get(i9)).length;
                        }
                    }
                    this.f1031 += i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byteBuffer.put(bArr);
        return iRemaining;
    }

    @Override // net.sf.sevenzipjbinding.IOutStream
    public final synchronized void setSize(long j) {
        m1061(j, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m1061(long j, boolean z) {
        try {
            if (j == 0) {
                m1064();
                return;
            }
            if (j > this.f1037) {
                throw new RuntimeException("Maximal size of the byte array stream was reached by setSize(" + j + "). Maximal size is " + this.f1037 + " bytes");
            }
            int i = this.f1033;
            if (j > i) {
                if (i == 0) {
                    int i2 = (int) j;
                    this.f1035.add(new byte[i2]);
                    this.f1038 = 0;
                    this.f1033 = i2;
                }
                int i3 = (int) (j - ((long) this.f1033));
                int length = 0;
                for (int i4 = 0; i4 < this.f1035.size(); i4++) {
                    length += ((byte[]) this.f1035.get(i4)).length;
                }
                int i5 = this.f1033;
                int i6 = length - i5;
                if (i6 < i3) {
                    this.f1033 = i5 + i6;
                    int i7 = i3 - i6;
                    m1060(i7);
                    if (z) {
                        this.f1036 = i7;
                    }
                } else if (z) {
                    ArrayList arrayList = this.f1035;
                    this.f1036 = (((byte[]) arrayList.get(arrayList.size() - 1)).length - i6) + i3;
                }
                if (z) {
                    this.f1038 = this.f1035.size() - 1;
                    this.f1031 = (int) j;
                }
                this.f1033 = (int) j;
            }
            if (j < this.f1033) {
                int length2 = 0;
                for (int i8 = 0; i8 < this.f1035.size(); i8++) {
                    length2 += ((byte[]) this.f1035.get(i8)).length;
                    if (length2 >= j) {
                        int size = this.f1035.size();
                        while (true) {
                            size--;
                            if (size <= i8) {
                                break;
                            } else {
                                this.f1035.remove(size);
                            }
                        }
                        int i9 = this.f1032;
                        if (i9 != -1 && i9 > j) {
                            this.f1032 = (int) j;
                        } else if (this.f1031 > j) {
                            int i10 = (int) j;
                            this.f1031 = i10;
                            this.f1036 = (i10 - length2) + ((byte[]) this.f1035.get(i8)).length;
                            this.f1038 = i8;
                        }
                        this.f1033 = (int) j;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public final int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.get(bArr);
        synchronized (this) {
            try {
                if (iRemaining < 0) {
                    throw new IllegalStateException("Invalid start position (0) and length (" + iRemaining + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                if (iRemaining == 0) {
                    return 0;
                }
                m1062();
                int i = this.f1038;
                if (i == -1 || this.f1036 >= ((byte[]) this.f1035.get(i)).length) {
                    m1060(-1);
                }
                int i2 = 0;
                int i3 = iRemaining;
                do {
                    byte[] bArr2 = (byte[]) this.f1035.get(this.f1038);
                    int length = bArr2.length;
                    int i4 = this.f1036;
                    int i5 = length - i4;
                    if (i5 >= i3) {
                        i5 = i3;
                    }
                    System.arraycopy(bArr, i2, bArr2, i4, i5);
                    int i6 = this.f1036 + i5;
                    this.f1036 = i6;
                    this.f1031 += i5;
                    i2 += i5;
                    i3 -= i5;
                    if (i6 >= bArr2.length) {
                        this.f1036 = 0;
                        int i7 = this.f1038 + 1;
                        this.f1038 = i7;
                        if (i7 >= this.f1035.size()) {
                            m1060(-1);
                        }
                    }
                } while (i3 > 0);
                int i8 = this.f1031;
                if (i8 > this.f1033) {
                    this.f1033 = i8;
                }
                ArrayList arrayList = this.f1035;
                if (this.f1033 == i8 && this.f1036 == 0) {
                    int i9 = this.f1038;
                    if (i9 == 0) {
                        m1059();
                    } else {
                        this.f1038 = i9 - 1;
                        arrayList.remove(i9);
                        this.f1036 = ((byte[]) arrayList.get(this.f1038)).length;
                    }
                }
                return iRemaining;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m1062() {
        int i = this.f1032;
        if (i == -1) {
            return;
        }
        if (this.f1031 == i) {
            this.f1032 = -1;
            return;
        }
        if (i > this.f1033) {
            m1061(i, true);
            this.f1032 = -1;
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f1035;
            if (i2 < arrayList.size()) {
                int length = ((byte[]) arrayList.get(i2)).length;
                i3 += length;
                int i4 = this.f1032;
                if (i3 > i4) {
                    this.f1038 = i2;
                    this.f1036 = length - (i3 - i4);
                    this.f1031 = i4;
                    this.f1032 = -1;
                    return;
                }
                i2++;
            } else {
                int size = arrayList.size() - 1;
                this.f1038 = size;
                this.f1036 = ((byte[]) arrayList.get(size)).length;
                this.f1031 = this.f1033;
                this.f1032 = -1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1060(int i) {
        int i2 = this.f1038;
        ArrayList arrayList = this.f1035;
        if (i2 == -1 || (i2 == arrayList.size() - 1 && ((byte[]) arrayList.get(this.f1038)).length == this.f1036)) {
            this.f1036 = 0;
            this.f1038++;
        }
        int i3 = this.f1033;
        int i4 = this.f1037;
        if (i3 >= i4) {
            throw new RuntimeException(C2271.m6966(i4, "Maximal size of the byte array stream was reached. (Max size = ", MotionUtils.EASING_TYPE_FORMAT_END));
        }
        int size = arrayList.size() - 1;
        int length = size == -1 ? this.f1034 : ((byte[]) arrayList.get(size)).length << 1;
        if (length < 0 || length > 1048576) {
            length = 1048576;
        }
        int i5 = this.f1033;
        if (i5 + length > i4) {
            length = i4 - i5;
        }
        if (i == -1 || length >= i) {
            i = length;
        } else if (i5 + i >= i4) {
            throw new RuntimeException(C2271.m6966(i4, "Maximal size of the byte array stream was reached. (Max size = ", MotionUtils.EASING_TYPE_FORMAT_END));
        }
        arrayList.add(new byte[i]);
    }
}
