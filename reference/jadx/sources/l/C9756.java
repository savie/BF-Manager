package l;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* JADX INFO: renamed from: l.ۢ֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77U5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9756 extends AbstractC17961 {
    @Override // l.AbstractC17961
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1029(C15723 c15723) {
        super.mo1029(c15723);
        Vector vectorMo9294 = c15723.f51127.m45900().mo9294();
        synchronized (vectorMo9294) {
            if (vectorMo9294.size() <= 0) {
                return false;
            }
            String strM37607 = c15723.m37607("PubkeyAcceptedAlgorithms");
            c15723.f51127.m45899().getClass();
            String[] strArrM37617 = c15723.m37617();
            List listAsList = (strArrM37617 == null || strArrM37617.length <= 0) ? Collections.EMPTY_LIST : Arrays.asList(strArrM37617);
            if (!listAsList.isEmpty()) {
                c15723.f51127.m45899().getClass();
            }
            List<String> listAsList2 = Arrays.asList(C9011.m24057(strM37607));
            if (listAsList2.isEmpty()) {
                return false;
            }
            String[] strArrM37623 = c15723.m37623();
            if (strArrM37623 == null || strArrM37623.length <= 0) {
                c15723.f51127.m45899().getClass();
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (String str : listAsList2) {
                    int length = strArrM37623.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            arrayList2.add(str);
                            break;
                        }
                        if (str.equals(strArrM37623[i])) {
                            arrayList.add(str);
                            break;
                        }
                        i++;
                    }
                }
                if (!arrayList.isEmpty()) {
                    c15723.f51127.m45899().getClass();
                }
                if (!arrayList2.isEmpty()) {
                    c15723.f51127.m45899().getClass();
                }
                if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                    if (m25431(c15723, vectorMo9294, arrayList, listAsList)) {
                        return true;
                    }
                    return m25431(c15723, vectorMo9294, arrayList2, listAsList);
                }
            }
            return m25431(c15723, vectorMo9294, listAsList2, listAsList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m25431(C15723 c15723, Vector vector, List list, List list2) throws IOException {
        String str;
        byte[] bytes;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        String str2;
        List list3;
        ArrayList arrayList4;
        int i;
        int i2 = c15723.f51130;
        C19978 c19978 = c15723.f51127;
        if (i2 >= c15723.f51153) {
            return false;
        }
        boolean zEquals = c15723.m37607("enable_pubkey_auth_query").equals("yes");
        boolean zEquals2 = c15723.m37607("try_additional_pubkey_algorithms").equals("yes");
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            str = OpenSSHPublicKeyUtil.RSA;
            if (!zHasNext) {
                break;
            }
            String str3 = (String) it2.next();
            if (str3.equals(OpenSSHPublicKeyUtil.RSA) || str3.equals("rsa-sha2-256") || str3.equals("rsa-sha2-512") || str3.equals("ssh-rsa-sha224@ssh.com") || str3.equals("ssh-rsa-sha256@ssh.com") || str3.equals("ssh-rsa-sha384@ssh.com") || str3.equals("ssh-rsa-sha512@ssh.com")) {
                arrayList5.add(str3);
            } else {
                arrayList6.add(str3);
            }
        }
        byte[] bArrM24055 = C9011.m24055(this.f58833, StandardCharsets.UTF_8);
        Iterator it3 = vector.iterator();
        List list4 = list2;
        while (it3.hasNext()) {
            InterfaceC7387 interfaceC7387 = (InterfaceC7387) it3.next();
            if (c15723.f51130 >= c15723.f51153) {
                return false;
            }
            int i3 = 5;
            while (true) {
                if (!interfaceC7387.mo20292()) {
                    bytes = null;
                } else {
                    if (this.f58831 == null) {
                        throw new C2079("USERAUTH fail");
                    }
                    if (interfaceC7387.mo20292() && !this.f58831.mo3247()) {
                        throw new C13265("publickey");
                    }
                    String strMo3246 = this.f58831.mo3246();
                    if (strMo3246 != null) {
                        byte[] bArr = C9011.f29358;
                        bytes = strMo3246.getBytes(StandardCharsets.UTF_8);
                    } else {
                        bytes = null;
                    }
                }
                if (!(interfaceC7387.mo20292() && bytes == null) && interfaceC7387.mo20288(bytes)) {
                    if (bytes == null || !(c19978.m45900() instanceof C22216)) {
                        break;
                        break;
                    }
                    ((C22216) c19978.m45900()).m50241();
                    break;
                }
                C9011.m24062(bytes);
                i3--;
                if (i3 == 0) {
                    bytes = null;
                    break;
                }
                list4 = list2;
            }
            C9011.m24062(bytes);
            String strMo20287 = interfaceC7387.mo20287();
            if (strMo20287.equals(str)) {
                arrayList = new ArrayList(arrayList5);
            } else if (arrayList6.contains(strMo20287)) {
                ArrayList arrayList7 = new ArrayList(1);
                arrayList7.add(strMo20287);
                arrayList = arrayList7;
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                zEquals = zEquals;
                arrayList2 = arrayList5;
                arrayList3 = arrayList6;
                it = it3;
                str2 = str;
                c19978.m45899().getClass();
            } else {
                char c = 5;
                while (true) {
                    if (arrayList.isEmpty()) {
                        arrayList2 = arrayList5;
                    } else {
                        arrayList2 = arrayList5;
                        if (c15723.f51130 < c15723.f51153) {
                            byte[] bArrMo20290 = interfaceC7387.mo20290();
                            if (bArrMo20290 == null || !zEquals) {
                                zEquals = zEquals;
                                arrayList3 = arrayList6;
                                it = it3;
                                str2 = str;
                                list3 = list4;
                                arrayList4 = null;
                            } else {
                                Iterator it4 = arrayList.iterator();
                                int i4 = 51;
                                while (true) {
                                    if (!it4.hasNext()) {
                                        zEquals = zEquals;
                                        arrayList3 = arrayList6;
                                        it = it3;
                                        str2 = str;
                                        list3 = list4;
                                        arrayList4 = null;
                                        i = i4;
                                        break;
                                    }
                                    zEquals = zEquals;
                                    String str4 = (String) it4.next();
                                    it4.remove();
                                    if (list4.contains(str4)) {
                                        c19978.m45899().getClass();
                                    } else {
                                        arrayList3 = arrayList6;
                                        this.f58832.m34100();
                                        it = it3;
                                        this.f58830.m25651((byte) 50);
                                        this.f58830.m25673(bArrM24055);
                                        C9866 c9866 = this.f58830;
                                        Charset charset = StandardCharsets.UTF_8;
                                        str2 = str;
                                        c9866.m25673("ssh-connection".getBytes(charset));
                                        this.f58830.m25673("publickey".getBytes(charset));
                                        this.f58830.m25651((byte) 0);
                                        this.f58830.m25673(C9011.m24055(str4, charset));
                                        C9866 c9867 = this.f58830;
                                        c9867.getClass();
                                        c9867.m25660(0, bArrMo20290.length, bArrMo20290);
                                        c15723.m37627(this.f58832);
                                        while (true) {
                                            C9866 c9868 = this.f58830;
                                            c15723.m37613(c9868);
                                            this.f58830 = c9868;
                                            i = c9868.f31750[c] & 255;
                                            if (i != 60) {
                                                if (i != 51) {
                                                    if (i != 53) {
                                                        c19978.m45899().getClass();
                                                        break;
                                                    }
                                                    c9868.m25658();
                                                    this.f58830.m25650();
                                                    this.f58830.m25650();
                                                    byte[] bArrM25649 = this.f58830.m25649();
                                                    this.f58830.m25649();
                                                    String str5 = str4;
                                                    new String(bArrM25649, 0, bArrM25649.length, StandardCharsets.UTF_8);
                                                    str4 = str5;
                                                    list4 = list4;
                                                } else {
                                                    c19978.m45899().getClass();
                                                    break;
                                                }
                                            } else {
                                                c19978.m45899().getClass();
                                                arrayList4 = new ArrayList(1);
                                                arrayList4.add(str4);
                                                list3 = list4;
                                                break;
                                            }
                                        }
                                        str = str2;
                                        i4 = i;
                                        arrayList6 = arrayList3;
                                        list4 = list4;
                                        it3 = it;
                                    }
                                }
                                if (i != 60) {
                                }
                                list4 = list3;
                            }
                            if (!interfaceC7387.mo20292()) {
                                if (bArrMo20290 == null) {
                                    bArrMo20290 = interfaceC7387.mo20290();
                                }
                                if (bArrMo20290 != null) {
                                    if (arrayList4 == null) {
                                        arrayList4 = arrayList;
                                    }
                                    if (!arrayList4.isEmpty()) {
                                        Iterator it5 = arrayList4.iterator();
                                        List list5 = list3;
                                        while (true) {
                                            if (!it5.hasNext() || c15723.f51130 >= c15723.f51153) {
                                                c = 5;
                                                it3 = it;
                                                str = str2;
                                                list4 = list2;
                                                arrayList5 = arrayList2;
                                                arrayList6 = arrayList3;
                                                zEquals = zEquals;
                                            } else {
                                                String str6 = (String) it5.next();
                                                it5.remove();
                                                if (list5.contains(str6)) {
                                                    c19978.m45899().getClass();
                                                } else {
                                                    this.f58832.m34100();
                                                    this.f58830.m25651((byte) 50);
                                                    this.f58830.m25673(bArrM24055);
                                                    C9866 c9869 = this.f58830;
                                                    Charset charset2 = StandardCharsets.UTF_8;
                                                    c9869.m25673("ssh-connection".getBytes(charset2));
                                                    this.f58830.m25673("publickey".getBytes(charset2));
                                                    this.f58830.m25651((byte) 1);
                                                    this.f58830.m25673(C9011.m24055(str6, charset2));
                                                    C9866 c98610 = this.f58830;
                                                    c98610.getClass();
                                                    c98610.m25660(0, bArrMo20290.length, bArrMo20290);
                                                    byte[] bArrM37622 = c15723.m37622();
                                                    int length = bArrM37622.length;
                                                    int i5 = length + 4;
                                                    byte[] bArr2 = new byte[(this.f58830.f31752 + i5) - 5];
                                                    Iterator it6 = it5;
                                                    bArr2[0] = (byte) (length >>> 24);
                                                    bArr2[1] = (byte) (length >>> 16);
                                                    bArr2[2] = (byte) (length >>> 8);
                                                    byte[] bArr3 = bArrMo20290;
                                                    bArr2[3] = (byte) length;
                                                    System.arraycopy(bArrM37622, 0, bArr2, 4, length);
                                                    C9866 c98611 = this.f58830;
                                                    System.arraycopy(c98611.f31750, 5, bArr2, i5, c98611.f31752 - 5);
                                                    byte[] bArrMo20289 = interfaceC7387.mo20289(str6, bArr2);
                                                    if (bArrMo20289 != null) {
                                                        C9866 c98612 = this.f58830;
                                                        c98612.getClass();
                                                        c98612.m25660(0, bArrMo20289.length, bArrMo20289);
                                                        c15723.m37627(this.f58832);
                                                        while (true) {
                                                            C9866 c98613 = this.f58830;
                                                            c15723.m37613(c98613);
                                                            this.f58830 = c98613;
                                                            int i6 = c98613.f31750[5] & 255;
                                                            if (i6 != 52) {
                                                                if (i6 != 53) {
                                                                    if (i6 != 51) {
                                                                        c19978.m45899().getClass();
                                                                        break;
                                                                    }
                                                                    c98613.m25658();
                                                                    this.f58830.m25650();
                                                                    this.f58830.m25650();
                                                                    byte[] bArrM256410 = this.f58830.m25649();
                                                                    if (this.f58830.m25650() != 0) {
                                                                        throw new C25200(new String(bArrM256410, 0, bArrM256410.length, StandardCharsets.UTF_8));
                                                                    }
                                                                    c15723.f51130++;
                                                                    c19978.m45899().getClass();
                                                                    if (c15723.f51130 < c15723.f51153) {
                                                                        if (!zEquals2) {
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    return false;
                                                                }
                                                                c98613.m25658();
                                                                this.f58830.m25650();
                                                                this.f58830.m25650();
                                                                byte[] bArrM256411 = this.f58830.m25649();
                                                                this.f58830.m25649();
                                                                new String(bArrM256411, 0, bArrM256411.length, StandardCharsets.UTF_8);
                                                            } else {
                                                                c19978.m45899().getClass();
                                                                return true;
                                                            }
                                                        }
                                                    } else {
                                                        c19978.m45899().getClass();
                                                    }
                                                    list5 = list2;
                                                    it5 = it6;
                                                    bArrMo20290 = bArr3;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            list4 = list3;
                        }
                        it3 = it;
                        str = str2;
                        arrayList5 = arrayList2;
                        arrayList6 = arrayList3;
                        zEquals = zEquals;
                    }
                    arrayList3 = arrayList6;
                    it = it3;
                    str2 = str;
                }
            }
            list4 = list2;
            it3 = it;
            str = str2;
            arrayList5 = arrayList2;
            arrayList6 = arrayList3;
            zEquals = zEquals;
        }
        return false;
    }
}
