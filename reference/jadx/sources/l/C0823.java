package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֨֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28FF */
/* JADX INFO: loaded from: classes3.dex */
public class C0823 extends ArrayList implements InterfaceC20757 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f3107;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Boolean f3109;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f3108 = new HashMap();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C14763 f3105 = new C14763();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ArrayList f3106 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean mo3300() {
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void mo3304(int i, int i2) {
    }

    public C0823(int i, List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            String path = interfaceC2386.getPath();
            Uri uriBuild = new Uri.Builder().scheme("mt_media").path(path).build();
            C2225 c2225 = new C2225();
            c2225.m7571(uriBuild);
            c2225.m7572(interfaceC2386);
            c2225.m7573(interfaceC2386.mo8100());
            C14902 c14902M7570 = c2225.m7570();
            this.f3108.put(path, c14902M7570);
            add(c14902M7570);
        }
        this.f3107 = i;
    }

    @Override // l.InterfaceC20757
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3295() {
        int iM37463;
        m3294();
        int i = this.f3107;
        C14763 c14763 = this.f3105;
        if (c14763.isEmpty()) {
            iM37463 = i - 1;
            if (iM37463 < 0) {
                iM37463 = size() - 1;
            }
        } else {
            iM37463 = c14763.m37463();
        }
        m3305(iM37463);
        mo3304(i, iM37463);
    }

    @Override // l.InterfaceC20757
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void mo3298() {
        int iIntValue;
        m3294();
        if (size() == 1) {
            return;
        }
        int i = this.f3107;
        int size = size();
        C14763 c14763 = this.f3105;
        int i2 = 0;
        if (c14763.isEmpty() || c14763.getInt(c14763.size() - 1) != i) {
            c14763.add(i);
            if (c14763.size() > 100) {
                c14763.mo14697(0);
            }
        }
        if (mo3300()) {
            ArrayList arrayList = this.f3106;
            if (arrayList == null) {
                this.f3106 = new ArrayList(size - 1);
                for (int i3 = 0; i3 < size; i3++) {
                    if (i3 != i) {
                        this.f3106.add(Integer.valueOf(i3));
                    }
                }
                Collections.shuffle(this.f3106);
            } else if (arrayList.isEmpty()) {
                for (int i4 = 0; i4 < size; i4++) {
                    this.f3106.add(Integer.valueOf(i4));
                }
                Collections.shuffle(this.f3106);
                if (((Integer) this.f3106.get(0)).intValue() == i) {
                    this.f3106.remove(0);
                    this.f3106.add(Integer.valueOf(i));
                }
            }
            iIntValue = ((Integer) this.f3106.get(0)).intValue();
            this.f3106.remove(0);
        } else {
            iIntValue = i + 1;
            if (iIntValue < size) {
            }
            m3305(i2);
            mo3304(i, i2);
        }
        i2 = iIntValue;
        m3305(i2);
        mo3304(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3297(int i) {
        m3294();
        int i2 = this.f3107;
        if (i != i2) {
            C14763 c14763 = this.f3105;
            if (c14763.isEmpty() || c14763.getInt(c14763.size() - 1) != i2) {
                c14763.add(i2);
                if (c14763.size() > 100) {
                    c14763.mo14697(0);
                }
            }
            this.f3106 = null;
            m3305(i);
            mo3304(i2, i);
        }
    }

    @Override // l.InterfaceC20757
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo3302() {
        m3294();
        if (mo3300()) {
            ArrayList arrayList = this.f3106;
            if (arrayList == null || !arrayList.isEmpty()) {
                return false;
            }
        } else if (this.f3107 != size() - 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m3294() {
        boolean zMo3300 = mo3300();
        Boolean bool = this.f3109;
        if (bool == null || bool.booleanValue() != zMo3300) {
            this.f3106 = null;
            this.f3109 = Boolean.valueOf(zMo3300);
        }
    }

    @Override // l.InterfaceC20757
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int mo3299() {
        return this.f3107;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC20757
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14902 mo3301() {
        return (C14902) get(this.f3107);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC20757
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC2386 mo3303() {
        return m3293((C14902) get(this.f3107));
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m3305(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException();
        }
        this.f3107 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14902 m3296(String str) {
        return (C14902) this.f3108.get(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2386 m3293(C14902 c14902) {
        C20870 c20870 = c14902.f48681;
        C17359.requireNonNull(c20870);
        Object obj = c20870.f66803;
        C17359.requireNonNull(obj);
        return (InterfaceC2386) obj;
    }
}
