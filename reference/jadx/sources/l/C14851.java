package l;

import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܰ᩶᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: WKX */
/* JADX INFO: loaded from: classes5.dex */
public final class C14851 extends AbstractC3074 implements InterfaceC2174, InterfaceC14375 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19327 f48553;

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* synthetic */ Spliterator spliterator() {
        return C2443.convert(spliterator());
    }

    public C14851(C19327 c19327) {
        this.f48553 = c19327;
    }

    @Override // l.AbstractC5312, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final InterfaceC15224 iterator() {
        return new C23803(this.f48553);
    }

    @Override // l.InterfaceC2174
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15224 mo7471() {
        return new C20819(this.f48553);
    }

    @Override // l.AbstractC5312, java.util.Collection, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC21938, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC2546 spliterator() {
        return new C3665(this.f48553);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        Object value = entry.getValue();
        C19327 c19327 = this.f48553;
        if (iIntValue == 0) {
            return c19327.f62437 && C17359.equals(c19327.f62434[c19327.f62435], value);
        }
        int[] iArr = c19327.f62429;
        int iM30015 = C11972.m30015(iIntValue) & c19327.f62439;
        int i2 = iArr[iM30015];
        if (i2 == 0) {
            return false;
        }
        if (iIntValue == i2) {
            return C17359.equals(c19327.f62434[iM30015], value);
        }
        do {
            iM30015 = (iM30015 + 1) & c19327.f62439;
            i = iArr[iM30015];
            if (i == 0) {
                return false;
            }
        } while (iIntValue != i);
        return C17359.equals(c19327.f62434[iM30015], value);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) entry.getKey()).intValue();
        Object value = entry.getValue();
        C19327 c19327 = this.f48553;
        if (iIntValue == 0) {
            if (!c19327.f62437 || !C17359.equals(c19327.f62434[c19327.f62435], value)) {
                return false;
            }
            c19327.m44705();
            return true;
        }
        int[] iArr = c19327.f62429;
        int iM30015 = C11972.m30015(iIntValue) & c19327.f62439;
        int i = iArr[iM30015];
        if (i == 0) {
            return false;
        }
        if (i == iIntValue) {
            if (!C17359.equals(c19327.f62434[iM30015], value)) {
                return false;
            }
            c19327.m44709(iM30015);
            return true;
        }
        while (true) {
            iM30015 = (iM30015 + 1) & c19327.f62439;
            int i2 = iArr[iM30015];
            if (i2 == 0) {
                return false;
            }
            if (i2 == iIntValue && C17359.equals(c19327.f62434[iM30015], value)) {
                c19327.m44709(iM30015);
                return true;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f48553.f62431;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f48553.clear();
    }

    @Override // l.AbstractC5312, java.lang.Iterable, l.InterfaceC9372, l.InterfaceC22091
    public final void forEach(Consumer consumer) {
        C19327 c19327 = this.f48553;
        if (c19327.f62437) {
            consumer.n(new C4411(c19327, c19327.f62435));
        }
        int[] iArr = c19327.f62429;
        int i = c19327.f62435;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            if (iArr[i2] != 0) {
                consumer.n(new C4411(c19327, i2));
            }
            i = i2;
        }
    }
}
