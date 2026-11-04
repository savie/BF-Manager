package l;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.᩶ۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z754 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21047 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC14333 f67263;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC14333 f67266;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f67265 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SparseArray f67261 = new SparseArray();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f67264 = new SparseBooleanArray();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f67262 = new SparseBooleanArray();

    public C21047(C9924 c9924, File file) {
        C24031 c24031 = new C24031(c9924);
        C3893 c3893 = new C3893(new File(file, "cached_content_index.exi"));
        this.f67263 = c24031;
        this.f67266 = c3893;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48101(long j) {
        InterfaceC14333 interfaceC14333;
        InterfaceC14333 interfaceC14334 = this.f67263;
        interfaceC14334.mo12530(j);
        InterfaceC14333 interfaceC14335 = this.f67266;
        if (interfaceC14335 != null) {
            interfaceC14335.mo12530(j);
        }
        boolean zMo12535 = interfaceC14334.mo12535();
        SparseArray sparseArray = this.f67261;
        HashMap map = this.f67265;
        if (!zMo12535 && (interfaceC14333 = this.f67266) != null && interfaceC14333.mo12535()) {
            this.f67266.mo12532(map, sparseArray);
            interfaceC14334.mo12536(map);
        } else {
            interfaceC14334.mo12532(map, sparseArray);
        }
        InterfaceC14333 interfaceC14336 = this.f67266;
        if (interfaceC14336 != null) {
            interfaceC14336.delete();
            this.f67266 = null;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m48103() {
        this.f67263.mo12531(this.f67265);
        SparseBooleanArray sparseBooleanArray = this.f67264;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            this.f67261.remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        this.f67262.clear();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6131 m48105(String str) {
        HashMap map = this.f67265;
        C6131 c6131 = (C6131) map.get(str);
        if (c6131 != null) {
            return c6131;
        }
        SparseArray sparseArray = this.f67261;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        C6131 c6132 = new C6131(iKeyAt, str, C18809.f61123);
        map.put(str, c6132);
        sparseArray.put(iKeyAt, str);
        this.f67262.put(iKeyAt, true);
        this.f67263.mo12533(c6132);
        return c6132;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6131 m48100(String str) {
        return (C6131) this.f67265.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Collection m48099() {
        return C4681.unmodifiableCollection(this.f67265.values());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m48098(int i) {
        return (String) this.f67261.get(i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m48104(String str) {
        HashMap map = this.f67265;
        C6131 c6131 = (C6131) map.get(str);
        if (c6131 != null && c6131.m17731() && c6131.m17735()) {
            map.remove(str);
            int i = c6131.f20941;
            SparseBooleanArray sparseBooleanArray = this.f67262;
            boolean z = sparseBooleanArray.get(i);
            this.f67263.mo12534(c6131, z);
            SparseArray sparseArray = this.f67261;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                this.f67264.put(i, true);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m48106() {
        AbstractC4516 it = AbstractC8639.copyOf((Collection) this.f67265.keySet()).iterator();
        while (it.hasNext()) {
            m48104((String) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48102(String str, C7622 c7622) {
        C6131 c6131M48105 = m48105(str);
        if (c6131M48105.m17730(c7622)) {
            this.f67263.mo12533(c6131M48105);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18809 m48096(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                throw new IOException(C13645.m33382(i3, "Invalid value size: "));
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = C7116.f23453;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new C18809(map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48097(C18809 c18809, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setM43651 = c18809.m43651();
        dataOutputStream.writeInt(setM43651.size());
        for (Map.Entry entry : setM43651) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }
}
