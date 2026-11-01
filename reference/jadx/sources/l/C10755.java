package l;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ۧۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8F1 */
/* JADX INFO: loaded from: classes3.dex */
public class C10755 implements Closeable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C10049 f36653;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1581 f36654;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f36655;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1388 f36659;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] f36658 = new byte[256];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f36660 = new LinkedHashMap();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f36661 = new ArrayList();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public HashMap f36657 = new HashMap();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f36663 = 512;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f36656 = ByteBuffer.allocate(512);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f36662 = 10240;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10755 m27052(AbstractC20745 abstractC20745) {
        return new C17104(abstractC20745.m46710("r"), null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0085  */
    public C10755(C1388 c1388, String str) throws IOException {
        this.f36659 = c1388;
        this.f36654 = AbstractC9344.m23995(str);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        if (c1388.read(byteBufferAllocate) < 12) {
            c1388.seek(0L);
        } else {
            byteBufferAllocate.flip();
            byte[] bArr = new byte[12];
            byteBufferAllocate.get(bArr);
            if (!"MIUI BACKUP\n".equals(new String(bArr, StandardCharsets.UTF_8))) {
                c1388.seek(0L);
            } else {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(1);
                int i = 0;
                int i2 = 0;
                while (i < 8 && i2 < 2048) {
                    byteBufferAllocate2.clear();
                    if (c1388.read(byteBufferAllocate2) == -1) {
                        break;
                    }
                    i2++;
                    byteBufferAllocate2.flip();
                    if (byteBufferAllocate2.get() == 10) {
                        i++;
                    }
                }
                if (i != 8) {
                    c1388.seek(0L);
                }
            }
        }
        while (true) {
            C10049 c10049Mo27059 = mo27059();
            if (c10049Mo27059 == null) {
                return;
            }
            String strM25433 = c10049Mo27059.m25433();
            if (c10049Mo27059.m25430() && !strM25433.endsWith("/")) {
                strM25433 = strM25433.concat("/");
            }
            this.f36660.put(strM25433, c10049Mo27059);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private ArrayList m27054(C10049 c10049) throws IOException {
        ArrayList arrayList = new ArrayList();
        List<C16399> listM25434 = c10049.m25434();
        C0170 c0170 = new C0170();
        long jM38605 = 0;
        long j = 0;
        for (C16399 c16399 : listM25434) {
            long jM38606 = c16399.m38605() - jM38605;
            if (jM38606 < 0) {
                throw new IOException("Corrupted struct sparse detected");
            }
            if (jM38606 > 0) {
                arrayList.add(new C13660(jM38606, c0170));
                j += jM38606;
            }
            if (c16399.m38604() > 0) {
                long jM38607 = (c16399.m38605() + c10049.m25425()) - j;
                if (c16399.m38604() + jM38607 < jM38607) {
                    throw new IOException("Unreadable TAR archive, sparse block offset or length too big");
                }
                arrayList.add(new C11543(jM38607, c16399.m38604(), this.f36659));
            }
            jM38605 = c16399.m38605() + c16399.m38604();
        }
        long jM25417 = c10049.m25417() - jM38605;
        if (jM25417 < 0) {
            throw new IOException("Corrupted TAR archive. Sparse block extends beyond real size of the entry");
        }
        if (jM25417 > 0) {
            arrayList.add(new C13660(jM25417, c0170));
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f36659.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m27058() {
        ArrayList arrayList = new ArrayList(this.f36660.values());
        Collections.sort(arrayList, new C12166());
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m27057(C10049 c10049) throws IOException {
        try {
            return new C5815(this, c10049, this.f36659, c10049.m25428() ? m27054(c10049) : Collections.EMPTY_LIST);
        } catch (RuntimeException e) {
            throw new IOException("Corrupted TAR archive. Can't read entry", e);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private byte[] m27055() throws IOException {
        byte[] bArr = this.f36658;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStreamM27057 = m27057(this.f36653);
        while (true) {
            try {
                int i = inputStreamM27057.read(bArr);
                if (i < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                try {
                    inputStreamM27057.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        inputStreamM27057.close();
        mo27059();
        if (this.f36653 == null) {
            return null;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        while (length > 0 && byteArray[length - 1] == 0) {
            length--;
        }
        return length != byteArray.length ? Arrays.copyOf(byteArray, length) : byteArray;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:56:0x0115  */
    /* JADX WARN: Code duplicated, block: B:61:0x0134  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c A[Catch: NumberFormatException -> 0x01ad, TryCatch #1 {NumberFormatException -> 0x01ad, blocks: (B:69:0x0144, B:71:0x014c, B:72:0x0150, B:74:0x0158), top: B:96:0x0144 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0150 A[Catch: NumberFormatException -> 0x01ad, TryCatch #1 {NumberFormatException -> 0x01ad, blocks: (B:69:0x0144, B:71:0x014c, B:72:0x0150, B:74:0x0158), top: B:96:0x0144 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0158 A[Catch: NumberFormatException -> 0x01ad, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x01ad, blocks: (B:69:0x0144, B:71:0x014c, B:72:0x0150, B:74:0x0158), top: B:96:0x0144 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x017a  */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C10049 mo27059() throws IOException {
        boolean zM25432;
        ArrayList arrayList;
        ByteBuffer byteBufferM27051;
        C19927 c19927;
        InputStream inputStreamM27057;
        byte[] bArrM27055;
        String strMo5388;
        InterfaceC1581 interfaceC1581 = this.f36654;
        if (!this.f36655) {
            C10049 c10049 = this.f36653;
            C1388 c1388 = this.f36659;
            int i = this.f36663;
            if (c10049 != null) {
                long jM25435 = this.f36653.m25435() + c10049.m25425();
                if (jM25435 < c1388.getFilePointer()) {
                    throw new IOException("trying to move backwards inside of the archive");
                }
                c1388.seek(jM25435);
                if (c1388.length() < c1388.getFilePointer()) {
                    throw new IOException("Truncated TAR archive");
                }
                C10049 c100410 = this.f36653;
                if ((c100410 == null || !c100410.m25430()) && this.f36653.m25435() > 0) {
                    long j = i;
                    if (this.f36653.m25435() % j != 0) {
                        long filePointer = c1388.getFilePointer() + ((((this.f36653.m25435() / j) + 1) * j) - this.f36653.m25435());
                        if (filePointer < c1388.getFilePointer()) {
                            throw new IOException("trying to move backwards inside of the archive");
                        }
                        c1388.seek(filePointer);
                        if (c1388.length() < c1388.getFilePointer()) {
                            throw new IOException("Truncated TAR archive");
                        }
                    }
                }
            }
            ByteBuffer byteBufferM27052 = m27051();
            if (byteBufferM27052 == null) {
                this.f36653 = null;
                return null;
            }
            try {
                long filePointer2 = c1388.getFilePointer();
                C10049 c100411 = new C10049(this.f36657, byteBufferM27052.array(), interfaceC1581);
                c100411.m25407(filePointer2);
                this.f36653 = c100411;
                if (!c100411.m25431()) {
                    if (this.f36653.m25423()) {
                        bArrM27055 = m27055();
                        if (bArrM27055 != null) {
                            strMo5388 = interfaceC1581.mo5388(0, bArrM27055.length, bArrM27055);
                            this.f36653.m25422(strMo5388);
                            if (this.f36653.m25430() && !strMo5388.endsWith("/")) {
                                this.f36653.m25422(strMo5388.concat("/"));
                            }
                        }
                    }
                    zM25432 = this.f36653.m25432();
                    arrayList = this.f36661;
                    if (zM25432) {
                        inputStreamM27057 = m27057(this.f36653);
                        try {
                            this.f36657 = C23455.m51695(inputStreamM27057, arrayList, this.f36657, this.f36653.m25435());
                            inputStreamM27057.close();
                            mo27059();
                            if (this.f36653 == null) {
                                throw new IOException("Error detected parsing the pax header");
                            }
                        } catch (Throwable th) {
                            try {
                                inputStreamM27057.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    try {
                        if (this.f36653.m25441()) {
                            m27053();
                        } else if (!this.f36657.isEmpty()) {
                            this.f36653.m25410(this.f36657);
                            this.f36653.m25409(arrayList);
                        }
                        if (this.f36653.m25414() && this.f36653.m25436()) {
                            do {
                                byteBufferM27051 = m27051();
                                if (byteBufferM27051 != null) {
                                    throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
                                }
                                c19927 = new C19927(byteBufferM27051.array());
                                this.f36653.m25418().addAll(c19927.m45220());
                                C10049 c100412 = this.f36653;
                                c100412.m25407(c100412.m25425() + ((long) i));
                            } while (c19927.m45221());
                        }
                        return this.f36653;
                    } catch (NumberFormatException e) {
                        throw new IOException("Error detected parsing the pax header", e);
                    }
                }
                byte[] bArrM27056 = m27055();
                if (bArrM27056 != null) {
                    this.f36653.m25427(interfaceC1581.mo5388(0, bArrM27056.length, bArrM27056));
                    if (this.f36653.m25423()) {
                        bArrM27055 = m27055();
                        if (bArrM27055 != null) {
                            strMo5388 = interfaceC1581.mo5388(0, bArrM27055.length, bArrM27055);
                            this.f36653.m25422(strMo5388);
                            if (this.f36653.m25430()) {
                                this.f36653.m25422(strMo5388.concat("/"));
                            }
                        }
                    }
                    zM25432 = this.f36653.m25432();
                    arrayList = this.f36661;
                    if (zM25432) {
                        inputStreamM27057 = m27057(this.f36653);
                        this.f36657 = C23455.m51695(inputStreamM27057, arrayList, this.f36657, this.f36653.m25435());
                        inputStreamM27057.close();
                        mo27059();
                        if (this.f36653 == null) {
                            throw new IOException("Error detected parsing the pax header");
                        }
                    }
                    if (this.f36653.m25441()) {
                        m27053();
                    } else if (!this.f36657.isEmpty()) {
                        this.f36653.m25410(this.f36657);
                        this.f36653.m25409(arrayList);
                    }
                    if (this.f36653.m25414()) {
                        do {
                            byteBufferM27051 = m27051();
                            if (byteBufferM27051 != null) {
                                throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
                            }
                            c19927 = new C19927(byteBufferM27051.array());
                            this.f36653.m25418().addAll(c19927.m45220());
                            C10049 c100413 = this.f36653;
                            c100413.m25407(c100413.m25425() + ((long) i));
                        } while (c19927.m45221());
                    }
                    return this.f36653;
                }
            } catch (IllegalArgumentException e2) {
                throw new IOException("Error detected parsing the header", e2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m27053() throws IOException {
        int i = this.f36663;
        ArrayList arrayList = new ArrayList();
        InputStream inputStreamM27057 = m27057(this.f36653);
        try {
            HashMap mapM51695 = C23455.m51695(inputStreamM27057, arrayList, this.f36657, this.f36653.m25435());
            inputStreamM27057.close();
            if (mapM51695.containsKey("GNU.sparse.map")) {
                arrayList = new ArrayList(C23455.m51696((String) mapM51695.get("GNU.sparse.map")));
            }
            mo27059();
            C10049 c10049 = this.f36653;
            if (c10049 != null) {
                c10049.m25410(mapM51695);
                this.f36653.m25409(arrayList);
                if (this.f36653.m25420()) {
                    C1388 c1388 = this.f36659;
                    long filePointer = c1388.getFilePointer();
                    C11543 c11543 = new C11543(this.f36653.m25425(), this.f36653.m25435(), this.f36659);
                    try {
                        ArrayList arrayListM51694 = C23455.m51694(c11543, i);
                        c11543.close();
                        this.f36653.m25409(arrayListM51694);
                        long filePointer2 = c1388.getFilePointer() - filePointer;
                        if (filePointer2 < 0 || filePointer2 > this.f36653.m25435() || filePointer2 % ((long) i) != 0) {
                            throw new IOException("Corrupted TAR archive. Invalid sparse headers size");
                        }
                        C10049 c100410 = this.f36653;
                        c100410.m25426(c100410.m25435() - filePointer2);
                        C10049 c100411 = this.f36653;
                        c100411.m25407(c100411.m25425() + filePointer2);
                        return;
                    } catch (Throwable th) {
                        try {
                            c11543.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                return;
            }
            throw new IOException("premature end of tar archive. Didn't find any entry after PAX header.");
        } catch (Throwable th3) {
            try {
                inputStreamM27057.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private ByteBuffer m27051() throws IOException {
        boolean z;
        ByteBuffer byteBuffer = this.f36656;
        byteBuffer.rewind();
        C1388 c1388 = this.f36659;
        int i = c1388.read(byteBuffer);
        int i2 = this.f36663;
        ByteBuffer byteBuffer2 = i != i2 ? null : byteBuffer;
        boolean z2 = true;
        if (byteBuffer2 == null) {
            z = true;
            break;
        }
        byte[] bArrArray = byteBuffer2.array();
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                z = true;
                break;
            }
            if (bArrArray[i3] != 0) {
                z = false;
                break;
            }
            i3++;
        }
        this.f36655 = z;
        if (!z || byteBuffer2 == null) {
            return byteBuffer2;
        }
        try {
            byteBuffer.rewind();
            if (c1388.read(byteBuffer) != i2) {
                byteBuffer = null;
            }
            if (byteBuffer != null) {
                byte[] bArrArray2 = byteBuffer.array();
                for (int i4 = 0; i4 < i2; i4++) {
                    if (bArrArray2[i4] != 0) {
                        z2 = false;
                        break;
                    }
                }
            }
            if (!z2) {
                c1388.seek(c1388.getFilePointer() - ((long) i2));
            }
            long filePointer = c1388.getFilePointer();
            long j = this.f36662;
            long j2 = filePointer % j;
            if (j2 > 0) {
                long filePointer2 = c1388.getFilePointer() + (j - j2);
                if (filePointer2 < c1388.getFilePointer()) {
                    throw new IOException("trying to move backwards inside of the archive");
                }
                c1388.seek(filePointer2);
            }
            return null;
        } catch (Throwable th) {
            c1388.seek(c1388.getFilePointer() - ((long) i2));
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m27056() {
        this.f36655 = true;
    }
}
