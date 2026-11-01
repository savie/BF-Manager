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

/* JADX INFO: renamed from: l.ۚܺۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z754 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5448 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC2625 f18788;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC2625 f18793;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f18792 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final SparseArray f18789 = new SparseArray();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f18790 = new SparseBooleanArray();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f18791 = new SparseBooleanArray();

    public C5448(C3788 c3788, File file) {
        C13916 c13916 = new C13916(c3788);
        C11799 c11799 = new C11799(new File(file, "cached_content_index.exi"));
        this.f18793 = c13916;
        this.f18788 = c11799;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15104(long j) {
        InterfaceC2625 interfaceC2625;
        InterfaceC2625 interfaceC2626 = this.f18793;
        interfaceC2626.mo8100(j);
        InterfaceC2625 interfaceC2627 = this.f18788;
        if (interfaceC2627 != null) {
            interfaceC2627.mo8100(j);
        }
        boolean zMo8105 = interfaceC2626.mo8105();
        SparseArray sparseArray = this.f18789;
        HashMap map = this.f18792;
        if (!zMo8105 && (interfaceC2625 = this.f18788) != null && interfaceC2625.mo8105()) {
            this.f18788.mo8102(map, sparseArray);
            interfaceC2626.mo8106(map);
        } else {
            interfaceC2626.mo8102(map, sparseArray);
        }
        InterfaceC2625 interfaceC2628 = this.f18788;
        if (interfaceC2628 != null) {
            interfaceC2628.delete();
            this.f18788 = null;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m15106() {
        this.f18793.mo8101(this.f18792);
        SparseBooleanArray sparseBooleanArray = this.f18790;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            this.f18789.remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        this.f18791.clear();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4742 m15108(String str) {
        HashMap map = this.f18792;
        C4742 c4742 = (C4742) map.get(str);
        if (c4742 != null) {
            return c4742;
        }
        SparseArray sparseArray = this.f18789;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        C4742 c4743 = new C4742(iKeyAt, str, C13210.f43962);
        map.put(str, c4743);
        sparseArray.put(iKeyAt, str);
        this.f18791.put(iKeyAt, true);
        this.f18793.mo8103(c4743);
        return c4743;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4742 m15103(String str) {
        return (C4742) this.f18792.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Collection m15102() {
        return C0561.unmodifiableCollection(this.f18792.values());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m15101(int i) {
        return (String) this.f18789.get(i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m15107(String str) {
        HashMap map = this.f18792;
        C4742 c4742 = (C4742) map.get(str);
        if (c4742 != null && c4742.m13115() && c4742.m13106()) {
            map.remove(str);
            int i = c4742.f16689;
            SparseBooleanArray sparseBooleanArray = this.f18791;
            boolean z = sparseBooleanArray.get(i);
            this.f18793.mo8104(c4742, z);
            SparseArray sparseArray = this.f18789;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                this.f18790.put(i, true);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15109() {
        AbstractC0477 it = AbstractC23844.copyOf((Collection) this.f18792.keySet()).iterator();
        while (it.hasNext()) {
            m15107((String) it.next());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15105(String str, C1214 c1214) {
        C4742 c4742M15108 = m15108(str);
        if (c4742M15108.m13113(c1214)) {
            this.f18793.mo8103(c4742M15108);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13210 m15099(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                throw new IOException(C8479.m22141(i3, "Invalid value size: "));
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = C17983.f57507;
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
        return new C13210(map);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15100(C13210 c13210, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setM32696 = c13210.m32696();
        dataOutputStream.writeInt(setM32696.size());
        for (Map.Entry entry : setM32696) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }
}
