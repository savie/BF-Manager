package l;

import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۜ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: J1YX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17410 extends AbstractC9843 {
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo2481(C12915 c12915) {
        return c12915.m31986("zip") && !c12915.m31988();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    @Override // l.AbstractC9843
    /* JADX INFO: renamed from: ۤ */
    public final void mo2016(C12915 c12915) {
        int iLastIndexOf;
        c12915.m31970("zip");
        C15102 c15102 = (C15102) c12915.m31987();
        String strM36371 = c15102.m36371();
        AbstractC22044 abstractC22044M35193 = C14584.m35193(strM36371, new String[0]);
        if (c15102.m36368()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        if (abstractC22044M35193.mo4303()) {
            AbstractC22044 abstractC22044M49858 = abstractC22044M35193.m49858();
            C17359.requireNonNull(abstractC22044M49858);
            if (!abstractC22044M49858.mo4303()) {
                if (!C7756.m21096()) {
                    c12915.m31979().m40400(C21576.m49059(R.string.MT_Protector, strM36371), false);
                    return;
                }
            }
        } else if (!C7756.m21096()) {
            c12915.m31979().m40400(C21576.m49059(R.string.MT_Protector, strM36371), false);
            return;
        }
        if (c12915.m31981() != 1) {
            ArrayList arrayList = new ArrayList(c12915.m31982());
            Main mainM31979 = c12915.m31979();
            C15102 c15103 = (C15102) c12915.m31987();
            AbstractC22044 abstractC22044M35194 = C14584.m35193(c15103.m36371(), new String[0]);
            boolean zM36369 = c15103.m36369();
            String strM43474 = zM36369 ? C18685.m43474(abstractC22044M35194) : null;
            C1749 c1749 = new C1749(this, mainM31979, arrayList, c12915, arrayList, mainM31979, c15103, zM36369, strM43474, abstractC22044M35194);
            c1749.m53490();
            if (zM36369) {
                C0938.m3746(c12915.m31979(), c1749.m53488(), strM43474);
                C5416.m16144(c1749.m53483());
                return;
            }
            return;
        }
        C15102 c15104 = (C15102) c12915.m31987();
        AbstractC22044 abstractC22044M35195 = C14584.m35193(c15104.m36371(), new String[0]);
        InterfaceC2386 interfaceC2386M31989 = c12915.m31989();
        boolean zIsDirectory = interfaceC2386M31989.isDirectory();
        boolean zM363610 = c15104.m36369();
        String strM43475 = zM363610 ? C18685.m43474(abstractC22044M35195) : null;
        String strSubstring = interfaceC2386M31989.getPath().substring(1);
        int length = interfaceC2386M31989.getParent().length() - 1;
        int length2 = (zIsDirectory || (iLastIndexOf = interfaceC2386M31989.getName().lastIndexOf(46)) == -1) ? strSubstring.length() : iLastIndexOf + length;
        int i = length2;
        C15172 c15172 = new C15172(this, c12915.m31979(), strSubstring, interfaceC2386M31989, c15104.mo10174().m54370(), c12915, zM363610, strM43475, abstractC22044M35195, zIsDirectory);
        c15172.m22945(R.string.MT_Protector);
        c15172.m22924((CharSequence) strSubstring);
        c15172.m22957(6);
        c15172.m22918();
        c15172.m22920(length, i);
        c15172.m22921(android.R.string.paste, new ViewOnClickListenerC5325(c15172, 0), new ViewOnLongClickListenerC1596(c15172));
        c15172.m22955(true);
        if (zM363610) {
            FrameLayout frameLayoutM22941 = c15172.m22941();
            frameLayoutM22941.setVisibility(0);
            frameLayoutM22941.setPadding(0, C6907.m19160(4.0f), 0, 0);
            Main mainM23233 = c12915.m31983().m23233();
            CheckBox checkBox = (CheckBox) mainM23233.m40395(R.layout.MT_Protector);
            frameLayoutM22941.addView(checkBox);
            C0938.m3746(mainM23233, checkBox, strM43475);
            C5416.m16144(c15172.m22956());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40885(final C17410 c17410, RadioButton[] radioButtonArr, int i, String str, String str2, List list, boolean z, Main main, String str3, final AbstractDialogInterfaceOnClickListenerC8552 abstractDialogInterfaceOnClickListenerC8552, final C12915 c12915, final AbstractC22044 abstractC22044) {
        String str4;
        int i2 = 0;
        while (true) {
            if (i2 >= radioButtonArr.length) {
                i2 = 0;
                break;
            } else if (radioButtonArr[i2].isChecked()) {
                break;
            } else {
                i2++;
            }
        }
        if (i != i2) {
            ApplicationC17729.f58258.edit().mo3485((byte) i2, "rcoz").apply();
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (i2 == 0) {
            arrayList.add(new C11443(str, str2, false, false));
            arrayList.add(new C11443(str2, str, false, true));
        } else if (i2 == 1) {
            arrayList2.add(str);
            arrayList.add(new C11443(str2, str, false, true));
        } else if (i2 == 2) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(((C8002) it.next()).getName());
            }
            String strConcat = str.concat(".bak");
            if (hashSet.contains(strConcat)) {
                int i3 = 1;
                while (true) {
                    str4 = str + " (" + i3 + ").bak";
                    if (!hashSet.contains(str4)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                strConcat = str4;
            }
            arrayList.add(new C11443(str, strConcat, false, false));
            arrayList.add(new C11443(str2, str, false, true));
        }
        if (z) {
            C0938.m3749(new InterfaceC18837() { // from class: l.᩸ۜ۫
                @Override // l.InterfaceC18837
                /* JADX INFO: renamed from: ۙ */
                public final /* synthetic */ void mo1268() {
                }

                @Override // l.InterfaceC18837
                /* JADX INFO: renamed from: ۙ */
                public final void mo1269(C9651 c9651, boolean z2) {
                    C17410.m40884(this.f73517, abstractDialogInterfaceOnClickListenerC8552, c12915, abstractC22044, arrayList, arrayList2, c9651, z2);
                }

                @Override // l.InterfaceC18837
                /* JADX INFO: renamed from: ۙ */
                public final /* synthetic */ boolean mo1270(Exception exc) {
                    return false;
                }
            }, main, str3);
        } else {
            abstractDialogInterfaceOnClickListenerC8552.m22951();
            m40882(c12915, abstractC22044, "", arrayList, arrayList2, null, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m40884(C17410 c17410, AbstractDialogInterfaceOnClickListenerC8552 abstractDialogInterfaceOnClickListenerC8552, C12915 c12915, AbstractC22044 abstractC22044, ArrayList arrayList, ArrayList arrayList2, C9651 c9651, boolean z) {
        abstractDialogInterfaceOnClickListenerC8552.m22951();
        m40882(c12915, abstractC22044, "", arrayList, arrayList2, c9651, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m40882(C12915 c12915, AbstractC22044 abstractC22044, String str, List list, List list2, C9651 c9651, boolean z) {
        C6178 c6178 = new C6178();
        c6178.m17800(str);
        c6178.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C11443 c11443 = (C11443) it.next();
            c6178.m17800(c11443.f35962);
            c6178.m17800(c11443.f35960);
            byte b = c11443.f35959 ? (byte) 1 : (byte) 0;
            if (c11443.f35961) {
                b = (byte) (b | 2);
            }
            c6178.writeByte(b);
        }
        c6178.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            c6178.m17800((String) it2.next());
        }
        int i = C13678.f43415;
        C8458 c8458 = new C8458(C16664.class);
        c8458.m22719("zipPath", abstractC22044.mo4294());
        c8458.m22721(e.m, c6178.m17799());
        c8458.m22728(c12915);
        c8458.m22717(c12915.m31979(), c9651);
        c8458.m22720("keepApkSigBlock", z);
        c8458.m22714();
    }
}
