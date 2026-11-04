package l;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܿܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J9YE */
/* JADX INFO: loaded from: classes5.dex */
public final class C18424 extends ByteArrayInputStream implements InterfaceC9960, InterfaceC8469 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static InterfaceC25186 f60003 = C16980.m40038(C18424.class.getName());

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f60004;

    @Override // java.io.ByteArrayInputStream, java.io.InputStream, l.InterfaceC9960, l.InterfaceC8469
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C9214.transferTo(this, outputStream);
    }

    public C18424(byte[] bArr, int i) {
        super(bArr, 0, i);
        this.f60004 = new HashMap();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m42952() {
        return read() & 255;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m42951() {
        return (m42952() << 8) | m42952();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m42950(int i) {
        int i2;
        int iM42952;
        StringBuilder sb = new StringBuilder(i);
        int i3 = 0;
        while (i3 < i) {
            int iM42953 = m42952();
            switch (iM42953 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    continue;
                    sb.append((char) iM42953);
                    i3++;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    i2 = (iM42953 & 63) << 4;
                    iM42952 = m42952() & 15;
                    break;
                case 12:
                case 13:
                    i2 = (iM42953 & 31) << 6;
                    iM42952 = m42952() & 63;
                    break;
                case 14:
                    iM42953 = ((iM42953 & 15) << 12) | ((m42952() & 63) << 6) | (m42952() & 63);
                    i3 += 2;
                    continue;
                    sb.append((char) iM42953);
                    i3++;
                    break;
            }
            iM42953 = i2 | iM42952;
            i3++;
            sb.append((char) iM42953);
            i3++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m42949() {
        HashMap map;
        int iM42952;
        HashMap map2 = new HashMap();
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            map = this.f60004;
            if (z || (iM42952 = m42952()) == 0) {
                break;
            }
            int i = C21408.f68203[EnumC20291.m46624(iM42952).ordinal()];
            if (i != 1) {
                InterfaceC25186 interfaceC25186 = f60003;
                if (i == 2) {
                    int iM46626 = (EnumC20291.m46626(iM42952) << 8) | m42952();
                    String str = (String) map.get(Integer.valueOf(iM46626));
                    if (str == null) {
                        interfaceC25186.mo13710("Bad domain name: possible circular name detected. Bad offset: 0x{} at 0x{}", Integer.toHexString(iM46626), Integer.toHexString(((ByteArrayInputStream) this).pos - 2));
                        str = "";
                    }
                    sb.append(str);
                    Iterator it = map2.values().iterator();
                    while (it.hasNext()) {
                        ((StringBuilder) it.next()).append(str);
                    }
                    z = true;
                } else if (i == 3) {
                    interfaceC25186.mo13721("Extended label are not currently supported.");
                } else {
                    interfaceC25186.mo13728(Integer.toHexString(iM42952 & 192), "Unsupported DNS label type: '{}'");
                }
            } else {
                int i2 = ((ByteArrayInputStream) this).pos - 1;
                String str2 = m42950(iM42952) + ".";
                sb.append(str2);
                Iterator it2 = map2.values().iterator();
                while (it2.hasNext()) {
                    ((StringBuilder) it2.next()).append(str2);
                }
                map2.put(Integer.valueOf(i2), new StringBuilder(str2));
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put((Integer) entry.getKey(), ((StringBuilder) entry.getValue()).toString());
        }
        return sb.toString();
    }
}
