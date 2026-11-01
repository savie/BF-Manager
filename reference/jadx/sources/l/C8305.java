package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.۠ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U4WH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8305 extends AbstractC9011 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final byte[] f28826 = {100, 101, 120, 10, UTF8.S_P3A, 51, 53, 0};

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final byte[] f28825 = {100, 101, 120, 10, UTF8.S_P3A, 51, 54, 0};

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final int mo6315(int i) {
        return UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final String mo6317() {
        return "header_item";
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6320(C13825 c13825, C6187 c6187) {
        c13825.m33646(8);
        c13825.m33646(20);
        c13825.m33642();
        c13825.m33642();
        if (c13825.m33642() != 112) {
            throw new RuntimeException("The header size is not the expected value (0x70)");
        }
        int iM33642 = c13825.m33642();
        if (iM33642 == 2018910994) {
            throw new RuntimeException("This dex file is big endian. Only little endian is currently supported.");
        }
        if (iM33642 != 305419896) {
            throw new RuntimeException("The endian tag is not 0x12345678 or 0x78563412");
        }
        if ((c13825.m33642() | c13825.m33642()) != 0) {
            System.err.println("This dex file has a link section, which is not supported. Ignoring.");
        }
        c6187.m17184(EnumC21004.TYPE_MAP_LIST, 1, c13825.m33642());
        c6187.m17184(EnumC21004.TYPE_STRING_ID_ITEM, c13825.m33642(), c13825.m33642());
        c6187.m17184(EnumC21004.TYPE_TYPE_ID_ITEM, c13825.m33642(), c13825.m33642());
        c6187.m17184(EnumC21004.TYPE_PROTO_ID_ITEM, c13825.m33642(), c13825.m33642());
        c6187.m17184(EnumC21004.TYPE_FIELD_ID_ITEM, c13825.m33642(), c13825.m33642());
        c6187.m17184(EnumC21004.TYPE_METHOD_ID_ITEM, c13825.m33642(), c13825.m33642());
        c6187.m17184(EnumC21004.TYPE_CLASS_DEF_ITEM, c13825.m33642(), c13825.m33642());
        c13825.m33642();
        c13825.m33642();
    }

    @Override // l.AbstractC9011
    /* JADX INFO: renamed from: ۙ */
    public final void mo6319(C4651 c4651) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            byte[] bArr = f28826;
            if (i >= 8) {
                C16845.m39507(sb.toString());
                c4651.m12837(bArr, 0, 8);
                c4651.m12839(0);
                c4651.m12837(new byte[20], 0, 20);
                C12063 c12063 = this.f30808;
                int iM29979 = c12063.m29979();
                C16066 c16066 = c12063.f40361;
                C19594 c19594 = c12063.f40371;
                C19594 c19595 = c12063.f40370;
                C19594 c19596 = c12063.f40352;
                C19594 c19597 = c12063.f40365;
                C19594 c19598 = c12063.f40367;
                C19594 c19599 = c12063.f40354;
                Integer.toHexString(iM29979);
                c4651.m12839(c12063.m29979());
                Integer.toHexString(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                c4651.m12839(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                Integer.toHexString(305419896);
                c4651.m12839(305419896);
                c4651.m12839(0);
                c4651.m12839(0);
                Integer.toHexString(c16066.f30807);
                c4651.m12839(c16066.f30807);
                c19599.f37761.size();
                c4651.m12839(c19599.f37761.size());
                Integer.toHexString(c19599.f37758);
                c4651.m12839(c19599.f37758);
                c19598.f37761.size();
                c4651.m12839(c19598.f37761.size());
                Integer.toHexString(c19598.f37758);
                c4651.m12839(c19598.f37758);
                c19597.f37761.size();
                c4651.m12839(c19597.f37761.size());
                Integer.toHexString(c19597.f37758);
                c4651.m12839(c19597.f37758);
                c19596.f37761.size();
                c4651.m12839(c19596.f37761.size());
                Integer.toHexString(c19596.f37758);
                c4651.m12839(c19596.f37758);
                c19595.f37761.size();
                c4651.m12839(c19595.f37761.size());
                Integer.toHexString(c19595.f37758);
                c4651.m12839(c19595.f37758);
                c19594.f37761.size();
                c4651.m12839(c19594.f37761.size());
                Integer.toHexString(c19594.f37758);
                c4651.m12839(c19594.f37758);
                Integer.toHexString(c12063.m29980());
                c4651.m12839(c12063.m29980());
                Integer.toHexString(c12063.m29976());
                c4651.m12839(c12063.m29976());
                return;
            }
            sb.append((char) bArr[i]);
            i++;
        }
    }
}
