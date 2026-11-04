package l;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: YB7L */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12639 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final HashMap f40548 = new HashMap();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f40547 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f40551 = new HashMap();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f40552 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final transient HashMap f40546 = new HashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f40550 = new HashMap();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Bundle f40549 = new Bundle();

    /* JADX INFO: renamed from: ۙ */
    public abstract void mo23777(int i, AbstractC18606 abstractC18606, @SuppressLint({"UnknownNullness"}) Object obj);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17114 m31420(String str, InterfaceC11217 interfaceC11217, AbstractC18606 abstractC18606, InterfaceC25320 interfaceC25320) {
        AbstractC8585 lifecycle = interfaceC11217.getLifecycle();
        if (lifecycle.mo23076().m8762(EnumC2619.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + interfaceC11217 + " is attempting to register while current state is " + lifecycle.mo23076() + ". LifecycleOwners must call register before they are STARTED.");
        }
        m31419(str);
        HashMap map = this.f40551;
        C20844 c20844 = (C20844) map.get(str);
        if (c20844 == null) {
            c20844 = new C20844(lifecycle);
        }
        c20844.m47663(new C17860(this, str, interfaceC25320, abstractC18606));
        map.put(str, c20844);
        return new C16368(this, str, abstractC18606);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17114 m31421(String str, AbstractC18606 abstractC18606, InterfaceC25320 interfaceC25320) {
        m31419(str);
        this.f40546.put(str, new C3690(abstractC18606, interfaceC25320));
        HashMap map = this.f40550;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            interfaceC25320.mo16160(obj);
        }
        Bundle bundle = this.f40549;
        C11893 c11893 = (C11893) bundle.getParcelable(str);
        if (c11893 != null) {
            bundle.remove(str);
            interfaceC25320.mo16160(abstractC18606.mo3029(c11893.m29770(), c11893.m29771()));
        }
        return new C23828(this, str, abstractC18606);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31424(String str) {
        Integer num;
        if (!this.f40552.contains(str) && (num = (Integer) this.f40547.remove(str)) != null) {
            this.f40548.remove(num);
        }
        this.f40546.remove(str);
        HashMap map = this.f40550;
        if (map.containsKey(str)) {
            C17359.toString(map.get(str));
            map.remove(str);
        }
        Bundle bundle = this.f40549;
        if (bundle.containsKey(str)) {
            C17359.toString(bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap map2 = this.f40551;
        C20844 c20844 = (C20844) map2.get(str);
        if (c20844 != null) {
            c20844.m47662();
            map2.remove(str);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m31426(Bundle bundle) {
        HashMap map = this.f40547;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f40552));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f40549.clone());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31423(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f40552 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        Bundle bundle3 = this.f40549;
        bundle3.putAll(bundle2);
        for (int i = 0; i < stringArrayList.size(); i++) {
            String str = stringArrayList.get(i);
            HashMap map = this.f40547;
            boolean zContainsKey = map.containsKey(str);
            HashMap map2 = this.f40548;
            if (zContainsKey) {
                Integer num = (Integer) map.remove(str);
                if (!bundle3.containsKey(str)) {
                    map2.remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i);
            num2.intValue();
            String str2 = stringArrayList.get(i);
            map2.put(num2, str2);
            map.put(str2, num2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31425(int i, int i2, Intent intent) {
        InterfaceC25320 interfaceC25320;
        String str = (String) this.f40548.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C3690 c3690 = (C3690) this.f40546.get(str);
        if (c3690 != null && (interfaceC25320 = c3690.f12685) != null && this.f40552.contains(str)) {
            interfaceC25320.mo16160(c3690.f12686.mo3029(intent, i2));
            this.f40552.remove(str);
            return true;
        }
        this.f40550.remove(str);
        this.f40549.putParcelable(str, new C11893(intent, i2));
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m31422(int i, @SuppressLint({"UnknownNullness"}) Object obj) {
        InterfaceC25320 interfaceC25320;
        String str = (String) this.f40548.get(Integer.valueOf(i));
        if (str == null) {
            return;
        }
        C3690 c3690 = (C3690) this.f40546.get(str);
        if (c3690 == null || (interfaceC25320 = c3690.f12685) == null) {
            this.f40549.remove(str);
            this.f40550.put(str, obj);
        } else if (this.f40552.remove(str)) {
            interfaceC25320.mo16160(obj);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m31419(String str) {
        HashMap map = this.f40547;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        int iMo17982 = AbstractC24195.f78347.mo17982();
        while (true) {
            int i = iMo17982 + 65536;
            Integer numValueOf = Integer.valueOf(i);
            HashMap map2 = this.f40548;
            if (map2.containsKey(numValueOf)) {
                iMo17982 = AbstractC24195.f78347.mo17982();
            } else {
                map2.put(Integer.valueOf(i), str);
                map.put(str, Integer.valueOf(i));
                return;
            }
        }
    }
}
