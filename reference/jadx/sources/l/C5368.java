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

/* JADX INFO: renamed from: l.ۚۗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8F1 */
/* JADX INFO: loaded from: classes2.dex */
public class C5368 implements Closeable {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC24760 f18817;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f18819;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C13961 f18820;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7450 f18821;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] f18815 = new byte[256];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f18813 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f18822 = new ArrayList();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public HashMap f18816 = new HashMap();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f18818 = 512;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f18814 = ByteBuffer.allocate(512);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f18823 = 10240;

    /* JADX WARN: Code duplicated, block: B:20:0x0085  */
    public C5368(C13961 c13961, String str) throws IOException {
        this.f18820 = c13961;
        this.f18817 = AbstractC16554.m39195(str);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        if (c13961.read(byteBufferAllocate) < 12) {
            c13961.seek(0L);
        } else {
            byteBufferAllocate.flip();
            byte[] bArr = new byte[12];
            byteBufferAllocate.get(bArr);
            if (!"MIUI BACKUP\n".equals(new String(bArr, StandardCharsets.UTF_8))) {
                c13961.seek(0L);
            } else {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(1);
                int i = 0;
                int i2 = 0;
                while (i < 8 && i2 < 2048) {
                    byteBufferAllocate2.clear();
                    if (c13961.read(byteBufferAllocate2) == -1) {
                        break;
                    }
                    i2++;
                    byteBufferAllocate2.flip();
                    if (byteBufferAllocate2.get() == 10) {
                        i++;
                    }
                }
                if (i != 8) {
                    c13961.seek(0L);
                }
            }
        }
        while (true) {
            C7450 c7450Mo16035 = mo16035();
            if (c7450Mo16035 == null) {
                return;
            }
            String strM20456 = c7450Mo16035.m20456();
            if (c7450Mo16035.m20450() && !strM20456.endsWith("/")) {
                strM20456 = strM20456.concat("/");
            }
            this.f18813.put(strM20456, c7450Mo16035);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private ArrayList m16031(C7450 c7450) throws IOException {
        ArrayList arrayList = new ArrayList();
        List<C19538> listM20419 = c7450.m20419();
        C22522 c22522 = new C22522();
        long jM45070 = 0;
        long j = 0;
        for (C19538 c19538 : listM20419) {
            long jM45071 = c19538.m45070() - jM45070;
            if (jM45071 < 0) {
                throw new IOException("Corrupted struct sparse detected");
            }
            if (jM45071 > 0) {
                arrayList.add(new C23268(jM45071, c22522));
                j += jM45071;
            }
            if (c19538.m45069() > 0) {
                long jM45072 = (c19538.m45070() + c7450.m20451()) - j;
                if (c19538.m45069() + jM45072 < jM45072) {
                    throw new IOException("Unreadable TAR archive, sparse block offset or length too big");
                }
                arrayList.add(new C3130(jM45072, c19538.m45069(), this.f18820));
            }
            jM45070 = c19538.m45070() + c19538.m45069();
        }
        long jM20449 = c7450.m20449() - jM45070;
        if (jM20449 < 0) {
            throw new IOException("Corrupted TAR archive. Sparse block extends beyond real size of the entry");
        }
        if (jM20449 > 0) {
            arrayList.add(new C23268(jM20449, c22522));
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f18820.close();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList m16033() {
        ArrayList arrayList = new ArrayList(this.f18813.values());
        Collections.sort(arrayList, new C15062());
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InputStream m16032(C7450 c7450) throws IOException {
        try {
            return new C12825(this, c7450, this.f18820, c7450.m20433() ? m16031(c7450) : Collections.EMPTY_LIST);
        } catch (RuntimeException e) {
            throw new IOException("Corrupted TAR archive. Can't read entry", e);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private byte[] m16030() throws IOException {
        byte[] bArr = this.f18815;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStreamM16032 = m16032(this.f18821);
        while (true) {
            try {
                int i = inputStreamM16032.read(bArr);
                if (i < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                try {
                    inputStreamM16032.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        inputStreamM16032.close();
        mo16035();
        if (this.f18821 == null) {
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
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C7450 mo16035() throws IOException {
        boolean zM20435;
        ArrayList arrayList;
        ByteBuffer byteBufferM16029;
        C10587 c10587;
        InputStream inputStreamM16032;
        byte[] bArrM16030;
        String strMo28621;
        InterfaceC24760 interfaceC24760 = this.f18817;
        if (!this.f18819) {
            C7450 c7450 = this.f18821;
            C13961 c13961 = this.f18820;
            int i = this.f18818;
            if (c7450 != null) {
                long jM20439 = this.f18821.m20439() + c7450.m20451();
                if (jM20439 < c13961.getFilePointer()) {
                    throw new IOException("trying to move backwards inside of the archive");
                }
                c13961.seek(jM20439);
                if (c13961.length() < c13961.getFilePointer()) {
                    throw new IOException("Truncated TAR archive");
                }
                C7450 c7451 = this.f18821;
                if ((c7451 == null || !c7451.m20450()) && this.f18821.m20439() > 0) {
                    long j = i;
                    if (this.f18821.m20439() % j != 0) {
                        long filePointer = c13961.getFilePointer() + ((((this.f18821.m20439() / j) + 1) * j) - this.f18821.m20439());
                        if (filePointer < c13961.getFilePointer()) {
                            throw new IOException("trying to move backwards inside of the archive");
                        }
                        c13961.seek(filePointer);
                        if (c13961.length() < c13961.getFilePointer()) {
                            throw new IOException("Truncated TAR archive");
                        }
                    }
                }
            }
            ByteBuffer byteBufferM160210 = m16029();
            if (byteBufferM160210 == null) {
                this.f18821 = null;
                return null;
            }
            try {
                long filePointer2 = c13961.getFilePointer();
                C7450 c7452 = new C7450(this.f18816, byteBufferM160210.array(), interfaceC24760);
                c7452.m20423(filePointer2);
                this.f18821 = c7452;
                if (!c7452.m20432()) {
                    if (this.f18821.m20447()) {
                        bArrM16030 = m16030();
                        if (bArrM16030 != null) {
                            strMo28621 = interfaceC24760.mo28621(0, bArrM16030.length, bArrM16030);
                            this.f18821.m20437(strMo28621);
                            if (this.f18821.m20450() && !strMo28621.endsWith("/")) {
                                this.f18821.m20437(strMo28621.concat("/"));
                            }
                        }
                    }
                    zM20435 = this.f18821.m20435();
                    arrayList = this.f18822;
                    if (zM20435) {
                        inputStreamM16032 = m16032(this.f18821);
                        try {
                            this.f18816 = C1639.m5799(inputStreamM16032, arrayList, this.f18816, this.f18821.m20439());
                            inputStreamM16032.close();
                            mo16035();
                            if (this.f18821 == null) {
                                throw new IOException("Error detected parsing the pax header");
                            }
                        } catch (Throwable th) {
                            try {
                                inputStreamM16032.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    try {
                        if (this.f18821.m20418()) {
                            m16028();
                        } else if (!this.f18816.isEmpty()) {
                            this.f18821.m20426(this.f18816);
                            this.f18821.m20425(arrayList);
                        }
                        if (this.f18821.m20416() && this.f18821.m20446()) {
                            do {
                                byteBufferM16029 = m16029();
                                if (byteBufferM16029 != null) {
                                    throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
                                }
                                c10587 = new C10587(byteBufferM16029.array());
                                this.f18821.m20430().addAll(c10587.m27035());
                                C7450 c7453 = this.f18821;
                                c7453.m20423(c7453.m20451() + ((long) i));
                            } while (c10587.m27036());
                        }
                        return this.f18821;
                    } catch (NumberFormatException e) {
                        throw new IOException("Error detected parsing the pax header", e);
                    }
                }
                byte[] bArrM16031 = m16030();
                if (bArrM16031 != null) {
                    this.f18821.m20453(interfaceC24760.mo28621(0, bArrM16031.length, bArrM16031));
                    if (this.f18821.m20447()) {
                        bArrM16030 = m16030();
                        if (bArrM16030 != null) {
                            strMo28621 = interfaceC24760.mo28621(0, bArrM16030.length, bArrM16030);
                            this.f18821.m20437(strMo28621);
                            if (this.f18821.m20450()) {
                                this.f18821.m20437(strMo28621.concat("/"));
                            }
                        }
                    }
                    zM20435 = this.f18821.m20435();
                    arrayList = this.f18822;
                    if (zM20435) {
                        inputStreamM16032 = m16032(this.f18821);
                        this.f18816 = C1639.m5799(inputStreamM16032, arrayList, this.f18816, this.f18821.m20439());
                        inputStreamM16032.close();
                        mo16035();
                        if (this.f18821 == null) {
                            throw new IOException("Error detected parsing the pax header");
                        }
                    }
                    if (this.f18821.m20418()) {
                        m16028();
                    } else if (!this.f18816.isEmpty()) {
                        this.f18821.m20426(this.f18816);
                        this.f18821.m20425(arrayList);
                    }
                    if (this.f18821.m20416()) {
                        do {
                            byteBufferM16029 = m16029();
                            if (byteBufferM16029 != null) {
                                throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
                            }
                            c10587 = new C10587(byteBufferM16029.array());
                            this.f18821.m20430().addAll(c10587.m27035());
                            C7450 c7454 = this.f18821;
                            c7454.m20423(c7454.m20451() + ((long) i));
                        } while (c10587.m27036());
                    }
                    return this.f18821;
                }
            } catch (IllegalArgumentException e2) {
                throw new IOException("Error detected parsing the header", e2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m16028() throws IOException {
        int i = this.f18818;
        ArrayList arrayList = new ArrayList();
        InputStream inputStreamM16032 = m16032(this.f18821);
        try {
            HashMap mapM5799 = C1639.m5799(inputStreamM16032, arrayList, this.f18816, this.f18821.m20439());
            inputStreamM16032.close();
            if (mapM5799.containsKey("GNU.sparse.map")) {
                arrayList = new ArrayList(C1639.m5800((String) mapM5799.get("GNU.sparse.map")));
            }
            mo16035();
            C7450 c7450 = this.f18821;
            if (c7450 != null) {
                c7450.m20426(mapM5799);
                this.f18821.m20425(arrayList);
                if (this.f18821.m20434()) {
                    C13961 c13961 = this.f18820;
                    long filePointer = c13961.getFilePointer();
                    C3130 c3130 = new C3130(this.f18821.m20451(), this.f18821.m20439(), this.f18820);
                    try {
                        ArrayList arrayListM5798 = C1639.m5798(c3130, i);
                        c3130.close();
                        this.f18821.m20425(arrayListM5798);
                        long filePointer2 = c13961.getFilePointer() - filePointer;
                        if (filePointer2 < 0 || filePointer2 > this.f18821.m20439() || filePointer2 % ((long) i) != 0) {
                            throw new IOException("Corrupted TAR archive. Invalid sparse headers size");
                        }
                        C7450 c7451 = this.f18821;
                        c7451.m20452(c7451.m20439() - filePointer2);
                        C7450 c7452 = this.f18821;
                        c7452.m20423(c7452.m20451() + filePointer2);
                        return;
                    } catch (Throwable th) {
                        try {
                            c3130.close();
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
                inputStreamM16032.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private ByteBuffer m16029() throws IOException {
        boolean z;
        ByteBuffer byteBuffer = this.f18814;
        byteBuffer.rewind();
        C13961 c13961 = this.f18820;
        int i = c13961.read(byteBuffer);
        int i2 = this.f18818;
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
        this.f18819 = z;
        if (!z || byteBuffer2 == null) {
            return byteBuffer2;
        }
        try {
            byteBuffer.rewind();
            if (c13961.read(byteBuffer) != i2) {
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
                c13961.seek(c13961.getFilePointer() - ((long) i2));
            }
            long filePointer = c13961.getFilePointer();
            long j = this.f18823;
            long j2 = filePointer % j;
            if (j2 > 0) {
                long filePointer2 = c13961.getFilePointer() + (j - j2);
                if (filePointer2 < c13961.getFilePointer()) {
                    throw new IOException("trying to move backwards inside of the archive");
                }
                c13961.seek(filePointer2);
            }
            return null;
        } catch (Throwable th) {
            c13961.seek(c13961.getFilePointer() - ((long) i2));
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m16034() {
        this.f18819 = true;
    }
}
