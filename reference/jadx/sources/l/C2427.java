package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۖۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 28FF */
/* JADX INFO: loaded from: classes2.dex */
public class C2427 extends ArrayList implements InterfaceC6908 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f9731;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Boolean f9733;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final HashMap f9729 = new HashMap();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15070 f9732 = new C15070();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f9730 = null;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean mo7409() {
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo7412(int i, int i2) {
    }

    public C2427(int i, List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            String path = interfaceC2557.getPath();
            Uri uriBuild = new Uri.Builder().scheme("mt_media").path(path).build();
            C20348 c20348 = new C20348();
            c20348.m45916(uriBuild);
            c20348.m45917(interfaceC2557);
            c20348.m45918(interfaceC2557.mo7963());
            C13689 c13689M45915 = c20348.m45915();
            this.f9729.put(path, c13689M45915);
            add(c13689M45915);
        }
        this.f9731 = i;
    }

    @Override // l.InterfaceC6908
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void mo7405() {
        int iM27092;
        m7402();
        int i = this.f9731;
        C15070 c15070 = this.f9732;
        if (c15070.isEmpty()) {
            iM27092 = i - 1;
            if (iM27092 < 0) {
                iM27092 = size() - 1;
            }
        } else {
            iM27092 = c15070.m27092();
        }
        m7404(iM27092);
        mo7412(i, iM27092);
    }

    @Override // l.InterfaceC6908
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void mo7411() {
        int iIntValue;
        m7402();
        if (size() == 1) {
            return;
        }
        int i = this.f9731;
        int size = size();
        C15070 c15070 = this.f9732;
        int i2 = 0;
        if (c15070.isEmpty() || c15070.getInt(c15070.size() - 1) != i) {
            c15070.add(i);
            if (c15070.size() > 100) {
                c15070.mo3180(0);
            }
        }
        if (mo7409()) {
            ArrayList arrayList = this.f9730;
            if (arrayList == null) {
                this.f9730 = new ArrayList(size - 1);
                for (int i3 = 0; i3 < size; i3++) {
                    if (i3 != i) {
                        this.f9730.add(Integer.valueOf(i3));
                    }
                }
                Collections.shuffle(this.f9730);
            } else if (arrayList.isEmpty()) {
                for (int i4 = 0; i4 < size; i4++) {
                    this.f9730.add(Integer.valueOf(i4));
                }
                Collections.shuffle(this.f9730);
                if (((Integer) this.f9730.get(0)).intValue() == i) {
                    this.f9730.remove(0);
                    this.f9730.add(Integer.valueOf(i));
                }
            }
            iIntValue = ((Integer) this.f9730.get(0)).intValue();
            this.f9730.remove(0);
        } else {
            iIntValue = i + 1;
            if (iIntValue < size) {
            }
            m7404(i2);
            mo7412(i, i2);
        }
        i2 = iIntValue;
        m7404(i2);
        mo7412(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7407(int i) {
        m7402();
        int i2 = this.f9731;
        if (i != i2) {
            C15070 c15070 = this.f9732;
            if (c15070.isEmpty() || c15070.getInt(c15070.size() - 1) != i2) {
                c15070.add(i2);
                if (c15070.size() > 100) {
                    c15070.mo3180(0);
                }
            }
            this.f9730 = null;
            m7404(i);
            mo7412(i2, i);
        }
    }

    @Override // l.InterfaceC6908
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean mo7408() {
        m7402();
        if (mo7409()) {
            ArrayList arrayList = this.f9730;
            if (arrayList == null || !arrayList.isEmpty()) {
                return false;
            }
        } else if (this.f9731 != size() - 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m7402() {
        boolean zMo7409 = mo7409();
        Boolean bool = this.f9733;
        if (bool == null || bool.booleanValue() != zMo7409) {
            this.f9730 = null;
            this.f9733 = Boolean.valueOf(zMo7409);
        }
    }

    @Override // l.InterfaceC6908
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int mo7403() {
        return this.f9731;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC6908
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 mo7410() {
        return m7401((C13689) get(this.f9731));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC6908
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13689 mo7413() {
        return (C13689) get(this.f9731);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m7404(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException();
        }
        this.f9731 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13689 m7406(String str) {
        return (C13689) this.f9729.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2557 m7401(C13689 c13689) {
        C14704 c14704 = c13689.f45157;
        C13638.requireNonNull(c14704);
        Object obj = c14704.f48035;
        C13638.requireNonNull(obj);
        return (InterfaceC2557) obj;
    }
}
