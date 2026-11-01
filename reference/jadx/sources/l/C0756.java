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

/* JADX INFO: renamed from: l.֨֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J1YX */
/* JADX INFO: loaded from: classes2.dex */
public final class C0756 extends AbstractC4674 {
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo1960(C21422 c21422) {
        return c21422.m47974("zip") && !c21422.m47977();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    @Override // l.AbstractC4674
    /* JADX INFO: renamed from: ۨ */
    public final void mo1962(C21422 c21422) {
        int iLastIndexOf;
        c21422.m47963("zip");
        C13810 c13810 = (C13810) c21422.m47960();
        String strM33624 = c13810.m33624();
        AbstractC20745 abstractC20745M15313 = C5553.m15313(strM33624, new String[0]);
        if (c13810.m33621()) {
            C15829.m37611(R.string.MT_Protector);
            return;
        }
        if (abstractC20745M15313.mo8447()) {
            AbstractC20745 abstractC20745M46689 = abstractC20745M15313.m46689();
            C13638.requireNonNull(abstractC20745M46689);
            if (!abstractC20745M46689.mo8447()) {
                if (!C6696.m18084()) {
                    c21422.m47980().m31000(C16737.m39264(R.string.MT_Protector, strM33624), false);
                    return;
                }
            }
        } else if (!C6696.m18084()) {
            c21422.m47980().m31000(C16737.m39264(R.string.MT_Protector, strM33624), false);
            return;
        }
        if (c21422.m47975() != 1) {
            ArrayList arrayList = new ArrayList(c21422.m47979());
            Main mainM47980 = c21422.m47980();
            C13810 c13811 = (C13810) c21422.m47960();
            AbstractC20745 abstractC20745M15314 = C5553.m15313(c13811.m33624(), new String[0]);
            boolean zM33623 = c13811.m33623();
            String strM45747 = zM33623 ? C20240.m45747(abstractC20745M15314) : null;
            C11341 c11341 = new C11341(this, mainM47980, arrayList, c21422, arrayList, mainM47980, c13811, zM33623, strM45747, abstractC20745M15314);
            c11341.m22699();
            if (zM33623) {
                C11005.m27757(c21422.m47980(), c11341.m22697(), strM45747);
                C23250.m51309(c11341.m22695());
                return;
            }
            return;
        }
        C13810 c13812 = (C13810) c21422.m47960();
        AbstractC20745 abstractC20745M15315 = C5553.m15313(c13812.m33624(), new String[0]);
        InterfaceC2557 interfaceC2557M47981 = c21422.m47981();
        boolean zIsDirectory = interfaceC2557M47981.isDirectory();
        boolean zM33624 = c13812.m33623();
        String strM45748 = zM33624 ? C20240.m45747(abstractC20745M15315) : null;
        String strSubstring = interfaceC2557M47981.getPath().substring(1);
        int length = interfaceC2557M47981.getParent().length() - 1;
        int length2 = (zIsDirectory || (iLastIndexOf = interfaceC2557M47981.getName().lastIndexOf(46)) == -1) ? strSubstring.length() : iLastIndexOf + length;
        int i = length2;
        C3452 c3452 = new C3452(this, c21422.m47980(), strSubstring, interfaceC2557M47981, c13812.mo13029().m21712(), c21422, zM33624, strM45748, abstractC20745M15315, zIsDirectory);
        c3452.m40376(R.string.MT_Protector);
        c3452.m40346((CharSequence) strSubstring);
        c3452.m40336(6);
        c3452.m40340();
        c3452.m40342(length, i);
        c3452.m40343(android.R.string.paste, new ViewOnClickListenerC7626(2, c3452), new ViewOnLongClickListenerC0856(c3452));
        c3452.m40368(true);
        if (zM33624) {
            FrameLayout frameLayoutM40333 = c3452.m40333();
            frameLayoutM40333.setVisibility(0);
            frameLayoutM40333.setPadding(0, C13932.m33769(4.0f), 0, 0);
            Main mainM28824 = c21422.m47965().m28824();
            CheckBox checkBox = (CheckBox) mainM28824.m30995(R.layout.MT_Protector);
            frameLayoutM40333.addView(checkBox);
            C11005.m27757(mainM28824, checkBox, strM45748);
            C23250.m51309(c3452.m40335());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3254(final C0756 c0756, RadioButton[] radioButtonArr, int i, String str, String str2, List list, boolean z, Main main, String str3, final AbstractDialogInterfaceOnClickListenerC17341 abstractDialogInterfaceOnClickListenerC17341, final C21422 c21422, final AbstractC20745 abstractC20745) {
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
            ApplicationC0716.f2992.edit().mo4064((byte) i2, "rcoz").apply();
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        if (i2 == 0) {
            arrayList.add(new C2167(str, str2, false, false));
            arrayList.add(new C2167(str2, str, false, true));
        } else if (i2 == 1) {
            arrayList2.add(str);
            arrayList.add(new C2167(str2, str, false, true));
        } else if (i2 == 2) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(((C12107) it.next()).getName());
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
            arrayList.add(new C2167(str, strConcat, false, false));
            arrayList.add(new C2167(str2, str, false, true));
        }
        if (z) {
            C11005.m27761(new InterfaceC17354() { // from class: l.֫᩶֨
                @Override // l.InterfaceC17354
                public final /* synthetic */ void onCanceled() {
                }

                @Override // l.InterfaceC17354
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final void mo6536(C14558 c14558, boolean z2) {
                    C0756.m3253(this.f7604, abstractDialogInterfaceOnClickListenerC17341, c21422, abstractC20745, arrayList, arrayList2, c14558, z2);
                }

                @Override // l.InterfaceC17354
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final /* synthetic */ boolean mo6537(Exception exc) {
                    return false;
                }
            }, main, str3);
        } else {
            abstractDialogInterfaceOnClickListenerC17341.m40364();
            m3255(c21422, abstractC20745, "", arrayList, arrayList2, null, false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3253(C0756 c0756, AbstractDialogInterfaceOnClickListenerC17341 abstractDialogInterfaceOnClickListenerC17341, C21422 c21422, AbstractC20745 abstractC20745, ArrayList arrayList, ArrayList arrayList2, C14558 c14558, boolean z) {
        abstractDialogInterfaceOnClickListenerC17341.m40364();
        m3255(c21422, abstractC20745, "", arrayList, arrayList2, c14558, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m3255(C21422 c21422, AbstractC20745 abstractC20745, String str, List list, List list2, C14558 c14558, boolean z) {
        C11018 c11018 = new C11018();
        c11018.m27786(str);
        c11018.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2167 c2167 = (C2167) it.next();
            c11018.m27786(c2167.f7867);
            c11018.m27786(c2167.f7869);
            byte b = c2167.f7868 ? (byte) 1 : (byte) 0;
            if (c2167.f7870) {
                b = (byte) (b | 2);
            }
            c11018.writeByte(b);
        }
        c11018.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            c11018.m27786((String) it2.next());
        }
        int i = C20725.f67443;
        C10142 c10142 = new C10142(C21924.class);
        c10142.m25768("zipPath", abstractC20745.mo33986());
        c10142.m25770(e.m, c11018.m27798());
        c10142.m25777(c21422);
        c10142.m25766(c21422.m47980(), c14558);
        c10142.m25769("keepApkSigBlock", z);
        c10142.m25763();
    }
}
