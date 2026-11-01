package l;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: J9YE */
/* JADX INFO: loaded from: classes3.dex */
public final class C4394 extends ByteArrayInputStream implements InterfaceC19407, InterfaceC20818 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static InterfaceC4314 f15650 = C13488.m32998(C4394.class.getName());

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final HashMap f15651;

    @Override // java.io.ByteArrayInputStream, java.io.InputStream, l.InterfaceC19407, l.InterfaceC20818
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C10235.transferTo(this, outputStream);
    }

    public C4394(byte[] bArr, int i) {
        super(bArr, 0, i);
        this.f15651 = new HashMap();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m12257() {
        return read() & 255;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m12254() {
        return (m12257() << 8) | m12257();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m12256(int i) {
        int i2;
        int iM12257;
        StringBuilder sb = new StringBuilder(i);
        int i3 = 0;
        while (i3 < i) {
            int iM12258 = m12257();
            switch (iM12258 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    continue;
                    sb.append((char) iM12258);
                    i3++;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    i2 = (iM12258 & 63) << 4;
                    iM12257 = m12257() & 15;
                    break;
                case 12:
                case 13:
                    i2 = (iM12258 & 31) << 6;
                    iM12257 = m12257() & 63;
                    break;
                case 14:
                    iM12258 = ((iM12258 & 15) << 12) | ((m12257() & 63) << 6) | (m12257() & 63);
                    i3 += 2;
                    continue;
                    sb.append((char) iM12258);
                    i3++;
                    break;
            }
            iM12258 = i2 | iM12257;
            i3++;
            sb.append((char) iM12258);
            i3++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m12255() {
        HashMap map;
        int iM12257;
        HashMap map2 = new HashMap();
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            map = this.f15651;
            if (z || (iM12257 = m12257()) == 0) {
                break;
            }
            int i = C3252.f12091[EnumC5889.m16119(iM12257).ordinal()];
            if (i != 1) {
                InterfaceC4314 interfaceC4314 = f15650;
                if (i == 2) {
                    int iM16121 = (EnumC5889.m16121(iM12257) << 8) | m12257();
                    String str = (String) map.get(Integer.valueOf(iM16121));
                    if (str == null) {
                        interfaceC4314.mo12132("Bad domain name: possible circular name detected. Bad offset: 0x{} at 0x{}", Integer.toHexString(iM16121), Integer.toHexString(((ByteArrayInputStream) this).pos - 2));
                        str = "";
                    }
                    sb.append(str);
                    Iterator it = map2.values().iterator();
                    while (it.hasNext()) {
                        ((StringBuilder) it.next()).append(str);
                    }
                    z = true;
                } else if (i == 3) {
                    interfaceC4314.mo12135("Extended label are not currently supported.");
                } else {
                    interfaceC4314.mo12115(Integer.toHexString(iM12257 & 192), "Unsupported DNS label type: '{}'");
                }
            } else {
                int i2 = ((ByteArrayInputStream) this).pos - 1;
                String str2 = m12256(iM12257) + ".";
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
