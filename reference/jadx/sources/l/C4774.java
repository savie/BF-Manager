package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۙ۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4WH */
/* JADX INFO: loaded from: classes3.dex */
public final class C4774 extends AbstractC10739 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final byte[] f16751 = {100, 101, 120, 10, UTF8.S_P3A, 51, 53, 0};

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final byte[] f16752 = {100, 101, 120, 10, UTF8.S_P3A, 51, 54, 0};

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final int mo10821(int i) {
        return UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final String mo10823() {
        return "header_item";
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0;
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10825(C4028 c4028, C17452 c17452) {
        c4028.m13001(8);
        c4028.m13001(20);
        c4028.m12995();
        c4028.m12995();
        if (c4028.m12995() != 112) {
            throw new RuntimeException("The header size is not the expected value (0x70)");
        }
        int iM12995 = c4028.m12995();
        if (iM12995 == 2018910994) {
            throw new RuntimeException("This dex file is big endian. Only little endian is currently supported.");
        }
        if (iM12995 != 305419896) {
            throw new RuntimeException("The endian tag is not 0x12345678 or 0x78563412");
        }
        if ((c4028.m12995() | c4028.m12995()) != 0) {
            System.err.println("This dex file has a link section, which is not supported. Ignoring.");
        }
        c17452.m40952(EnumC15214.TYPE_MAP_LIST, 1, c4028.m12995());
        c17452.m40952(EnumC15214.TYPE_STRING_ID_ITEM, c4028.m12995(), c4028.m12995());
        c17452.m40952(EnumC15214.TYPE_TYPE_ID_ITEM, c4028.m12995(), c4028.m12995());
        c17452.m40952(EnumC15214.TYPE_PROTO_ID_ITEM, c4028.m12995(), c4028.m12995());
        c17452.m40952(EnumC15214.TYPE_FIELD_ID_ITEM, c4028.m12995(), c4028.m12995());
        c17452.m40952(EnumC15214.TYPE_METHOD_ID_ITEM, c4028.m12995(), c4028.m12995());
        c17452.m40952(EnumC15214.TYPE_CLASS_DEF_ITEM, c4028.m12995(), c4028.m12995());
        c4028.m12995();
        c4028.m12995();
    }

    @Override // l.AbstractC10739
    /* JADX INFO: renamed from: ۙ */
    public final void mo10826(C24166 c24166) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            byte[] bArr = f16751;
            if (i >= 8) {
                C8398.m22566(sb.toString());
                c24166.m54133(bArr, 0, 8);
                c24166.m54134(0);
                c24166.m54133(new byte[20], 0, 20);
                C24738 c24738 = this.f34102;
                int iM55243 = c24738.m55243();
                C12977 c12977 = c24738.f80107;
                C21928 c21928 = c24738.f80105;
                C21928 c21929 = c24738.f80108;
                C21928 c219210 = c24738.f80101;
                C21928 c219211 = c24738.f80106;
                C21928 c219212 = c24738.f80112;
                C21928 c219213 = c24738.f80094;
                Integer.toHexString(iM55243);
                c24166.m54134(c24738.m55243());
                Integer.toHexString(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                c24166.m54134(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                Integer.toHexString(305419896);
                c24166.m54134(305419896);
                c24166.m54134(0);
                c24166.m54134(0);
                Integer.toHexString(c12977.f34103);
                c24166.m54134(c12977.f34103);
                c219213.f51828.size();
                c24166.m54134(c219213.f51828.size());
                Integer.toHexString(c219213.f51831);
                c24166.m54134(c219213.f51831);
                c219212.f51828.size();
                c24166.m54134(c219212.f51828.size());
                Integer.toHexString(c219212.f51831);
                c24166.m54134(c219212.f51831);
                c219211.f51828.size();
                c24166.m54134(c219211.f51828.size());
                Integer.toHexString(c219211.f51831);
                c24166.m54134(c219211.f51831);
                c219210.f51828.size();
                c24166.m54134(c219210.f51828.size());
                Integer.toHexString(c219210.f51831);
                c24166.m54134(c219210.f51831);
                c21929.f51828.size();
                c24166.m54134(c21929.f51828.size());
                Integer.toHexString(c21929.f51831);
                c24166.m54134(c21929.f51831);
                c21928.f51828.size();
                c24166.m54134(c21928.f51828.size());
                Integer.toHexString(c21928.f51831);
                c24166.m54134(c21928.f51831);
                Integer.toHexString(c24738.m55246());
                c24166.m54134(c24738.m55246());
                Integer.toHexString(c24738.m55241());
                c24166.m54134(c24738.m55241());
                return;
            }
            sb.append((char) bArr[i]);
            i++;
        }
    }
}
