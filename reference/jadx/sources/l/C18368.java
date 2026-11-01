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

/* JADX INFO: renamed from: l.ᩳ᩺ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77U5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18368 extends AbstractC7079 {
    @Override // l.AbstractC7079
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18953(C3073 c3073) {
        super.mo18953(c3073);
        Vector vectorMo19220 = c3073.f11634.m1334().mo19220();
        synchronized (vectorMo19220) {
            if (vectorMo19220.size() <= 0) {
                return false;
            }
            String strM9231 = c3073.m9231("PubkeyAcceptedAlgorithms");
            c3073.f11634.m1333().getClass();
            String[] strArrM9245 = c3073.m9245();
            List listAsList = (strArrM9245 == null || strArrM9245.length <= 0) ? Collections.EMPTY_LIST : Arrays.asList(strArrM9245);
            if (!listAsList.isEmpty()) {
                c3073.f11634.m1333().getClass();
            }
            List<String> listAsList2 = Arrays.asList(C8491.m22177(strM9231));
            if (listAsList2.isEmpty()) {
                return false;
            }
            String[] strArrM9241 = c3073.m9241();
            if (strArrM9241 == null || strArrM9241.length <= 0) {
                c3073.f11634.m1333().getClass();
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (String str : listAsList2) {
                    int length = strArrM9241.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            arrayList2.add(str);
                            break;
                        }
                        if (str.equals(strArrM9241[i])) {
                            arrayList.add(str);
                            break;
                        }
                        i++;
                    }
                }
                if (!arrayList.isEmpty()) {
                    c3073.f11634.m1333().getClass();
                }
                if (!arrayList2.isEmpty()) {
                    c3073.f11634.m1333().getClass();
                }
                if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                    if (m42617(c3073, vectorMo19220, arrayList, listAsList)) {
                        return true;
                    }
                    return m42617(c3073, vectorMo19220, arrayList2, listAsList);
                }
            }
            return m42617(c3073, vectorMo19220, listAsList2, listAsList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m42617(C3073 c3073, Vector vector, List list, List list2) throws IOException {
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
        int i2 = c3073.f11613;
        C0168 c0168 = c3073.f11634;
        if (i2 >= c3073.f11636) {
            return false;
        }
        boolean zEquals = c3073.m9231("enable_pubkey_auth_query").equals("yes");
        boolean zEquals2 = c3073.m9231("try_additional_pubkey_algorithms").equals("yes");
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
        byte[] bArrM22175 = C8491.m22175(this.f23748, StandardCharsets.UTF_8);
        Iterator it3 = vector.iterator();
        List list4 = list2;
        while (it3.hasNext()) {
            InterfaceC19219 interfaceC19219 = (InterfaceC19219) it3.next();
            if (c3073.f11613 >= c3073.f11636) {
                return false;
            }
            int i3 = 5;
            while (true) {
                if (!interfaceC19219.mo22442()) {
                    bytes = null;
                } else {
                    if (this.f23750 == null) {
                        throw new C5813("USERAUTH fail");
                    }
                    if (interfaceC19219.mo22442() && !this.f23750.mo26447()) {
                        throw new C12164("publickey");
                    }
                    String strMo26446 = this.f23750.mo26446();
                    if (strMo26446 != null) {
                        byte[] bArr = C8491.f29422;
                        bytes = strMo26446.getBytes(StandardCharsets.UTF_8);
                    } else {
                        bytes = null;
                    }
                }
                if (!(interfaceC19219.mo22442() && bytes == null) && interfaceC19219.mo22437(bytes)) {
                    if (bytes == null || !(c0168.m1334() instanceof C7224)) {
                        break;
                        break;
                    }
                    ((C7224) c0168.m1334()).m19223();
                    break;
                }
                C8491.m22182(bytes);
                i3--;
                if (i3 == 0) {
                    bytes = null;
                    break;
                }
                list4 = list2;
            }
            C8491.m22182(bytes);
            String strMo22436 = interfaceC19219.mo22436();
            if (strMo22436.equals(str)) {
                arrayList = new ArrayList(arrayList5);
            } else if (arrayList6.contains(strMo22436)) {
                ArrayList arrayList7 = new ArrayList(1);
                arrayList7.add(strMo22436);
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
                c0168.m1333().getClass();
            } else {
                char c = 5;
                while (true) {
                    if (arrayList.isEmpty()) {
                        arrayList2 = arrayList5;
                    } else {
                        arrayList2 = arrayList5;
                        if (c3073.f11613 < c3073.f11636) {
                            byte[] bArrMo22440 = interfaceC19219.mo22440();
                            if (bArrMo22440 == null || !zEquals) {
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
                                        c0168.m1333().getClass();
                                    } else {
                                        arrayList3 = arrayList6;
                                        this.f23751.m19501();
                                        it = it3;
                                        this.f23749.m35630((byte) 50);
                                        this.f23749.m35627(bArrM22175);
                                        C14904 c14904 = this.f23749;
                                        Charset charset = StandardCharsets.UTF_8;
                                        str2 = str;
                                        c14904.m35627("ssh-connection".getBytes(charset));
                                        this.f23749.m35627("publickey".getBytes(charset));
                                        this.f23749.m35630((byte) 0);
                                        this.f23749.m35627(C8491.m22175(str4, charset));
                                        C14904 c14905 = this.f23749;
                                        c14905.getClass();
                                        c14905.m35640(0, bArrMo22440.length, bArrMo22440);
                                        c3073.m9249(this.f23751);
                                        while (true) {
                                            C14904 c14906 = this.f23749;
                                            c3073.m9239(c14906);
                                            this.f23749 = c14906;
                                            i = c14906.f48679[c] & 255;
                                            if (i != 60) {
                                                if (i != 51) {
                                                    if (i != 53) {
                                                        c0168.m1333().getClass();
                                                        break;
                                                    }
                                                    c14906.m35638();
                                                    this.f23749.m35629();
                                                    this.f23749.m35629();
                                                    byte[] bArrM35628 = this.f23749.m35628();
                                                    this.f23749.m35628();
                                                    String str5 = str4;
                                                    new String(bArrM35628, 0, bArrM35628.length, StandardCharsets.UTF_8);
                                                    str4 = str5;
                                                    list4 = list4;
                                                } else {
                                                    c0168.m1333().getClass();
                                                    break;
                                                }
                                            } else {
                                                c0168.m1333().getClass();
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
                            if (!interfaceC19219.mo22442()) {
                                if (bArrMo22440 == null) {
                                    bArrMo22440 = interfaceC19219.mo22440();
                                }
                                if (bArrMo22440 != null) {
                                    if (arrayList4 == null) {
                                        arrayList4 = arrayList;
                                    }
                                    if (!arrayList4.isEmpty()) {
                                        Iterator it5 = arrayList4.iterator();
                                        List list5 = list3;
                                        while (true) {
                                            if (!it5.hasNext() || c3073.f11613 >= c3073.f11636) {
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
                                                    c0168.m1333().getClass();
                                                } else {
                                                    this.f23751.m19501();
                                                    this.f23749.m35630((byte) 50);
                                                    this.f23749.m35627(bArrM22175);
                                                    C14904 c14907 = this.f23749;
                                                    Charset charset2 = StandardCharsets.UTF_8;
                                                    c14907.m35627("ssh-connection".getBytes(charset2));
                                                    this.f23749.m35627("publickey".getBytes(charset2));
                                                    this.f23749.m35630((byte) 1);
                                                    this.f23749.m35627(C8491.m22175(str6, charset2));
                                                    C14904 c14908 = this.f23749;
                                                    c14908.getClass();
                                                    c14908.m35640(0, bArrMo22440.length, bArrMo22440);
                                                    byte[] bArrM9250 = c3073.m9250();
                                                    int length = bArrM9250.length;
                                                    int i5 = length + 4;
                                                    byte[] bArr2 = new byte[(this.f23749.f48681 + i5) - 5];
                                                    Iterator it6 = it5;
                                                    bArr2[0] = (byte) (length >>> 24);
                                                    bArr2[1] = (byte) (length >>> 16);
                                                    bArr2[2] = (byte) (length >>> 8);
                                                    byte[] bArr3 = bArrMo22440;
                                                    bArr2[3] = (byte) length;
                                                    System.arraycopy(bArrM9250, 0, bArr2, 4, length);
                                                    C14904 c14909 = this.f23749;
                                                    System.arraycopy(c14909.f48679, 5, bArr2, i5, c14909.f48681 - 5);
                                                    byte[] bArrMo22438 = interfaceC19219.mo22438(str6, bArr2);
                                                    if (bArrMo22438 != null) {
                                                        C14904 c149010 = this.f23749;
                                                        c149010.getClass();
                                                        c149010.m35640(0, bArrMo22438.length, bArrMo22438);
                                                        c3073.m9249(this.f23751);
                                                        while (true) {
                                                            C14904 c149011 = this.f23749;
                                                            c3073.m9239(c149011);
                                                            this.f23749 = c149011;
                                                            int i6 = c149011.f48679[5] & 255;
                                                            if (i6 != 52) {
                                                                if (i6 != 53) {
                                                                    if (i6 != 51) {
                                                                        c0168.m1333().getClass();
                                                                        break;
                                                                    }
                                                                    c149011.m35638();
                                                                    this.f23749.m35629();
                                                                    this.f23749.m35629();
                                                                    byte[] bArrM35629 = this.f23749.m35628();
                                                                    if (this.f23749.m35629() != 0) {
                                                                        throw new C23453(new String(bArrM35629, 0, bArrM35629.length, StandardCharsets.UTF_8));
                                                                    }
                                                                    c3073.f11613++;
                                                                    c0168.m1333().getClass();
                                                                    if (c3073.f11613 < c3073.f11636) {
                                                                        if (!zEquals2) {
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
                                                                    return false;
                                                                }
                                                                c149011.m35638();
                                                                this.f23749.m35629();
                                                                this.f23749.m35629();
                                                                byte[] bArrM356210 = this.f23749.m35628();
                                                                this.f23749.m35628();
                                                                new String(bArrM356210, 0, bArrM356210.length, StandardCharsets.UTF_8);
                                                            } else {
                                                                c0168.m1333().getClass();
                                                                return true;
                                                            }
                                                        }
                                                    } else {
                                                        c0168.m1333().getClass();
                                                    }
                                                    list5 = list2;
                                                    it5 = it6;
                                                    bArrMo22440 = bArr3;
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
