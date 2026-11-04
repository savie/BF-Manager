package l;

import com.google.android.material.motion.MotionUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import net.sf.sevenzipjbinding.IInStream;
import net.sf.sevenzipjbinding.IOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ܳᩴۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB61 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15543 implements IInStream, IOutStream {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f50553;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f50554;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f50556;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f50558;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f50559;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f50560;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList f50557 = new ArrayList();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f50555 = 1024;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] m37226() {
        byte[] bArr;
        bArr = new byte[this.f50554];
        int i = 0;
        for (byte[] bArr2 : this.f50557) {
            int length = bArr2.length + i;
            int i2 = this.f50554;
            int length2 = length > i2 ? i2 - i : bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i, length2);
            i += length2;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m37227() {
        m37224();
    }

    @Override // net.sf.sevenzipjbinding.ISeekableStream
    public final synchronized long seek(long j, int i) {
        int i2;
        try {
            if (i != 0) {
                if (i == 1) {
                    i2 = this.f50556;
                    if (i2 == -1) {
                        i2 = this.f50558;
                    }
                } else if (i == 2) {
                    i2 = this.f50554;
                } else {
                    throw new SevenZipException("Seek: unknown origin: " + i);
                }
                j += (long) i2;
            }
            if (j > this.f50559) {
                throw new RuntimeException("Maximal size of the byte array stream was reached by seek to " + j + ", maximal size is " + this.f50559 + " bytes");
            }
            this.f50556 = (int) j;
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    public C15543(int i) {
        if (i < 0) {
            throw new IllegalStateException("Maximal size of the byte array stream should be >0");
        }
        this.f50559 = i;
        m37224();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m37224() {
        this.f50557.clear();
        this.f50558 = 0;
        this.f50553 = 0;
        this.f50560 = -1;
        this.f50554 = 0;
        this.f50556 = -1;
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
                if (this.f50556 <= this.f50554) {
                    m37225();
                    int i = this.f50558;
                    int i2 = i + iRemaining;
                    int i3 = this.f50554;
                    int i4 = i2 > i3 ? i3 - i : iRemaining;
                    int i5 = 0;
                    int i6 = i4;
                    while (i6 > 0) {
                        int length = ((byte[]) this.f50557.get(this.f50560)).length;
                        int i7 = length - this.f50553;
                        if (i6 <= i7) {
                            i7 = i6;
                        }
                        System.arraycopy(this.f50557.get(this.f50560), this.f50553, bArr, i5, i7);
                        i5 += i7;
                        int i8 = this.f50553 + i7;
                        this.f50553 = i8;
                        i6 -= i7;
                        if (i8 >= length && this.f50560 < this.f50557.size() - 1) {
                            int i9 = this.f50560 + 1;
                            this.f50560 = i9;
                            this.f50553 = 0;
                            int length2 = ((byte[]) this.f50557.get(i9)).length;
                        }
                    }
                    this.f50558 += i4;
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
        m37223(j, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m37223(long j, boolean z) {
        try {
            if (j == 0) {
                m37227();
                return;
            }
            if (j > this.f50559) {
                throw new RuntimeException("Maximal size of the byte array stream was reached by setSize(" + j + "). Maximal size is " + this.f50559 + " bytes");
            }
            int i = this.f50554;
            if (j > i) {
                if (i == 0) {
                    int i2 = (int) j;
                    this.f50557.add(new byte[i2]);
                    this.f50560 = 0;
                    this.f50554 = i2;
                }
                int i3 = (int) (j - ((long) this.f50554));
                int length = 0;
                for (int i4 = 0; i4 < this.f50557.size(); i4++) {
                    length += ((byte[]) this.f50557.get(i4)).length;
                }
                int i5 = this.f50554;
                int i6 = length - i5;
                if (i6 < i3) {
                    this.f50554 = i5 + i6;
                    int i7 = i3 - i6;
                    m37222(i7);
                    if (z) {
                        this.f50553 = i7;
                    }
                } else if (z) {
                    ArrayList arrayList = this.f50557;
                    this.f50553 = (((byte[]) arrayList.get(arrayList.size() - 1)).length - i6) + i3;
                }
                if (z) {
                    this.f50560 = this.f50557.size() - 1;
                    this.f50558 = (int) j;
                }
                this.f50554 = (int) j;
            }
            if (j < this.f50554) {
                int length2 = 0;
                for (int i8 = 0; i8 < this.f50557.size(); i8++) {
                    length2 += ((byte[]) this.f50557.get(i8)).length;
                    if (length2 >= j) {
                        int size = this.f50557.size();
                        while (true) {
                            size--;
                            if (size <= i8) {
                                break;
                            } else {
                                this.f50557.remove(size);
                            }
                        }
                        int i9 = this.f50556;
                        if (i9 != -1 && i9 > j) {
                            this.f50556 = (int) j;
                        } else if (this.f50558 > j) {
                            int i10 = (int) j;
                            this.f50558 = i10;
                            this.f50553 = (i10 - length2) + ((byte[]) this.f50557.get(i8)).length;
                            this.f50560 = i8;
                        }
                        this.f50554 = (int) j;
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
                m37225();
                int i = this.f50560;
                if (i == -1 || this.f50553 >= ((byte[]) this.f50557.get(i)).length) {
                    m37222(-1);
                }
                int i2 = 0;
                int i3 = iRemaining;
                do {
                    byte[] bArr2 = (byte[]) this.f50557.get(this.f50560);
                    int length = bArr2.length;
                    int i4 = this.f50553;
                    int i5 = length - i4;
                    if (i5 >= i3) {
                        i5 = i3;
                    }
                    System.arraycopy(bArr, i2, bArr2, i4, i5);
                    int i6 = this.f50553 + i5;
                    this.f50553 = i6;
                    this.f50558 += i5;
                    i2 += i5;
                    i3 -= i5;
                    if (i6 >= bArr2.length) {
                        this.f50553 = 0;
                        int i7 = this.f50560 + 1;
                        this.f50560 = i7;
                        if (i7 >= this.f50557.size()) {
                            m37222(-1);
                        }
                    }
                } while (i3 > 0);
                int i8 = this.f50558;
                if (i8 > this.f50554) {
                    this.f50554 = i8;
                }
                ArrayList arrayList = this.f50557;
                if (this.f50554 == i8 && this.f50553 == 0) {
                    int i9 = this.f50560;
                    if (i9 == 0) {
                        m37224();
                    } else {
                        this.f50560 = i9 - 1;
                        arrayList.remove(i9);
                        this.f50553 = ((byte[]) arrayList.get(this.f50560)).length;
                    }
                }
                return iRemaining;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m37225() {
        int i = this.f50556;
        if (i == -1) {
            return;
        }
        if (this.f50558 == i) {
            this.f50556 = -1;
            return;
        }
        if (i > this.f50554) {
            m37223(i, true);
            this.f50556 = -1;
            return;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f50557;
            if (i2 < arrayList.size()) {
                int length = ((byte[]) arrayList.get(i2)).length;
                i3 += length;
                int i4 = this.f50556;
                if (i3 > i4) {
                    this.f50560 = i2;
                    this.f50553 = length - (i3 - i4);
                    this.f50558 = i4;
                    this.f50556 = -1;
                    return;
                }
                i2++;
            } else {
                int size = arrayList.size() - 1;
                this.f50560 = size;
                this.f50553 = ((byte[]) arrayList.get(size)).length;
                this.f50558 = this.f50554;
                this.f50556 = -1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m37222(int i) {
        int i2 = this.f50560;
        ArrayList arrayList = this.f50557;
        if (i2 == -1 || (i2 == arrayList.size() - 1 && ((byte[]) arrayList.get(this.f50560)).length == this.f50553)) {
            this.f50553 = 0;
            this.f50560++;
        }
        int i3 = this.f50554;
        int i4 = this.f50559;
        if (i3 >= i4) {
            throw new RuntimeException(C14442.m34864(i4, "Maximal size of the byte array stream was reached. (Max size = ", MotionUtils.EASING_TYPE_FORMAT_END));
        }
        int size = arrayList.size() - 1;
        int length = size == -1 ? this.f50555 : ((byte[]) arrayList.get(size)).length << 1;
        if (length < 0 || length > 1048576) {
            length = 1048576;
        }
        int i5 = this.f50554;
        if (i5 + length > i4) {
            length = i4 - i5;
        }
        if (i == -1 || length >= i) {
            i = length;
        } else if (i5 + i >= i4) {
            throw new RuntimeException(C14442.m34864(i4, "Maximal size of the byte array stream was reached. (Max size = ", MotionUtils.EASING_TYPE_FORMAT_END));
        }
        arrayList.add(new byte[i]);
    }
}
