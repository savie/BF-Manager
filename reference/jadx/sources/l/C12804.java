package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.۫ۖ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: V6JD */
/* JADX INFO: loaded from: classes4.dex */
public final class C12804 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f41022;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long[] f41023;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f41024;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long[] f41025;

    public C12804(List list) throws IOException {
        this.f41022 = C4681.unmodifiableList(new ArrayList(list));
        this.f41023 = new long[list.size()];
        this.f41025 = new long[list.size()];
        long j = 0;
        for (int i = 0; i < list.size(); i++) {
            AbstractC22044 abstractC22044 = (AbstractC22044) list.get(i);
            if (!abstractC22044.mo4304()) {
                throw new IOException(C21576.m49059(R.string.MT_Protector, abstractC22044.mo4294()));
            }
            long jMo4285 = abstractC22044.mo4285();
            if (jMo4285 < 0 || jMo4285 > C25227.FOREVER_NS - j) {
                throw new IOException(C21576.m49059(R.string.MT_Protector, abstractC22044.mo4294()));
            }
            this.f41023[i] = jMo4285;
            this.f41025[i] = abstractC22044.mo4286();
            j += jMo4285;
        }
        this.f41024 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31755(String str) {
        C16912 c16912M41323 = C17658.m41323(str);
        if (c16912M41323 == null || c16912M41323.m39898() != EnumC25118.TAR) {
            return null;
        }
        return c16912M41323.m39897();
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0115 A[EDGE_INSN: B:59:0x0115->B:60:0x0116 BREAK  A[LOOP:5: B:50:0x00f6->B:55:0x0105]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12804 m31756(AbstractC22044 abstractC22044) throws IOException {
        String str;
        boolean z;
        String strM31755 = m31755(abstractC22044.getName());
        if (strM31755 == null) {
            return new C12804(Collections.singletonList(abstractC22044));
        }
        AbstractC22044 abstractC22044M49858 = abstractC22044.m49858();
        if (abstractC22044M49858 == null) {
            throw new IOException(C21576.m49059(R.string.MT_Protector, abstractC22044.mo4294()));
        }
        String strConcat = strM31755.concat(".part");
        TreeMap treeMap = new TreeMap();
        for (AbstractC22044 abstractC22045 : abstractC22044M49858.mo4299(true)) {
            String name = abstractC22045.getName();
            if (strM31755.equals(m31755(name))) {
                String lowerCase = name.substring(strConcat.length()).toLowerCase(Locale.ROOT);
                if (treeMap.put(lowerCase, abstractC22045) != null) {
                    throw new IOException(C21576.m49059(R.string.MT_Protector, lowerCase));
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        String str2 = null;
        for (Map.Entry entry : treeMap.entrySet()) {
            String str3 = (String) entry.getKey();
            if (str2 == null) {
                for (int i = 0; i < str3.length(); i++) {
                    if (str3.charAt(i) != 'a') {
                        throw new IOException(C21576.m49059(R.string.MT_Protector, strConcat));
                    }
                }
            } else {
                char[] charArray = str2.toCharArray();
                int length = charArray.length - 1;
                while (true) {
                    if (length < 0) {
                        str = "";
                        break;
                    }
                    char c = charArray[length];
                    if (c != 'z') {
                        charArray[length] = (char) (c + 1);
                        str = new String(charArray);
                        break;
                    }
                    charArray[length] = 'a';
                    length--;
                }
                int i2 = 0;
                while (i2 < str2.length() && str2.charAt(i2) == 'z') {
                    i2++;
                }
                if (i2 >= str2.length() - 1) {
                    z = false;
                    break;
                }
                int i3 = i2 + 1;
                if (str2.charAt(i2) == 'y') {
                    while (true) {
                        if (i3 < str2.length()) {
                            int i4 = i3 + 1;
                            if (str2.charAt(i3) == 'z') {
                                i3 = i4;
                            }
                        } else if (str3.equals(str.concat("aa"))) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                }
                z = false;
                break;
                if (!str3.equals(str) && !z) {
                    throw new IOException(C21576.m49059(R.string.MT_Protector, C14483.m34972(strConcat, str2)));
                }
            }
            arrayList.add((AbstractC22044) entry.getValue());
            str2 = str3;
        }
        if (arrayList.isEmpty() || !treeMap.containsValue(abstractC22044)) {
            throw new IOException(C21576.m49059(R.string.MT_Protector, abstractC22044.mo4294()));
        }
        return new C12804(arrayList);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m31765() {
        return (AbstractC22044) this.f41022.get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List m31759() {
        return this.f41022;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long m31766() {
        return this.f41024;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m31762() {
        try {
            C12804 c12804M31756 = m31756(m31765());
            return this.f41022.equals(c12804M31756.f41022) && Arrays.equals(this.f41023, c12804M31756.f41023) && Arrays.equals(this.f41025, c12804M31756.f41025);
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31761(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            List list = this.f41022;
            if (i >= list.size()) {
                return;
            }
            C15022.m36176(messageDigest, ((AbstractC22044) list.get(i)).mo4294());
            C15022.m36176(messageDigest, ":" + this.f41023[i] + ":" + this.f41025[i] + l.b);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private C13961 m31758() throws IOException {
        m31763();
        if (this.f41022.size() == 1) {
            return m31765().m49855("r");
        }
        return C11746.m29495(C20697.m47332(m31765().getName(), this.f41023, new C0292(this)));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m31763() throws IOException {
        int i = 0;
        while (true) {
            List list = this.f41022;
            if (i >= list.size()) {
                return;
            }
            if (!((AbstractC22044) list.get(i)).mo4304() || ((AbstractC22044) list.get(i)).mo4285() != this.f41023[i] || ((AbstractC22044) list.get(i)).mo4286() != this.f41025[i]) {
                throw new IOException(C21576.m49059(R.string.MT_Protector, ((AbstractC22044) list.get(i)).mo4294()));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final BufferedInputStream m31764() throws IOException {
        C13961 c13961M31758 = m31758();
        return new BufferedInputStream(new C19517(new C25173(c13961M31758.getFilePointer(), c13961M31758), c13961M31758));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5368 m31760(String str, boolean z) throws IOException {
        C13961 c13961M31758 = m31758();
        try {
            if (z) {
                return new C5368(c13961M31758, str);
            }
            return new C15041(c13961M31758, str);
        } catch (IOException | RuntimeException e) {
            try {
                c13961M31758.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }
}
