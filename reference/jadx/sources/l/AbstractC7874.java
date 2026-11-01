package l;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: YB7L */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7874 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final HashMap f25903 = new HashMap();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f25907 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f25908 = new HashMap();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f25904 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final transient HashMap f25905 = new HashMap();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f25906 = new HashMap();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Bundle f25909 = new Bundle();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo20783(int i, AbstractC15636 abstractC15636, @SuppressLint({"UnknownNullness"}) Object obj);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC6462 m20780(String str, InterfaceC1423 interfaceC1423, AbstractC15636 abstractC15636, InterfaceC3639 interfaceC3639) {
        AbstractC3062 lifecycle = interfaceC1423.getLifecycle();
        if (lifecycle.mo9170().m24173(EnumC9414.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + interfaceC1423 + " is attempting to register while current state is " + lifecycle.mo9170() + ". LifecycleOwners must call register before they are STARTED.");
        }
        m20779(str);
        HashMap map = this.f25908;
        C18457 c18457 = (C18457) map.get(str);
        if (c18457 == null) {
            c18457 = new C18457(lifecycle);
        }
        c18457.m42805(new C22691(this, str, interfaceC3639, abstractC15636));
        map.put(str, c18457);
        return new C14930(this, str, abstractC15636);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC6462 m20781(String str, AbstractC15636 abstractC15636, InterfaceC3639 interfaceC3639) {
        m20779(str);
        this.f25905.put(str, new C17751(abstractC15636, interfaceC3639));
        HashMap map = this.f25906;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            interfaceC3639.mo10739(obj);
        }
        Bundle bundle = this.f25909;
        C12813 c12813 = (C12813) bundle.getParcelable(str);
        if (c12813 != null) {
            bundle.remove(str);
            interfaceC3639.mo10739(abstractC15636.mo1152(c12813.m31805(), c12813.m31806()));
        }
        return new C21279(this, str, abstractC15636);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20785(String str) {
        Integer num;
        if (!this.f25904.contains(str) && (num = (Integer) this.f25907.remove(str)) != null) {
            this.f25903.remove(num);
        }
        this.f25905.remove(str);
        HashMap map = this.f25906;
        if (map.containsKey(str)) {
            C13638.toString(map.get(str));
            map.remove(str);
        }
        Bundle bundle = this.f25909;
        if (bundle.containsKey(str)) {
            C13638.toString(bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap map2 = this.f25908;
        C18457 c18457 = (C18457) map2.get(str);
        if (c18457 != null) {
            c18457.m42804();
            map2.remove(str);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20787(Bundle bundle) {
        HashMap map = this.f25907;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f25904));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f25909.clone());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20784(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f25904 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        Bundle bundle3 = this.f25909;
        bundle3.putAll(bundle2);
        for (int i = 0; i < stringArrayList.size(); i++) {
            String str = stringArrayList.get(i);
            HashMap map = this.f25907;
            boolean zContainsKey = map.containsKey(str);
            HashMap map2 = this.f25903;
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
    public final boolean m20786(int i, int i2, Intent intent) {
        InterfaceC3639 interfaceC3639;
        String str = (String) this.f25903.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C17751 c17751 = (C17751) this.f25905.get(str);
        if (c17751 != null && (interfaceC3639 = c17751.f56313) != null && this.f25904.contains(str)) {
            interfaceC3639.mo10739(c17751.f56314.mo1152(intent, i2));
            this.f25904.remove(str);
            return true;
        }
        this.f25906.remove(str);
        this.f25909.putParcelable(str, new C12813(intent, i2));
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20782(int i, @SuppressLint({"UnknownNullness"}) Object obj) {
        InterfaceC3639 interfaceC3639;
        String str = (String) this.f25903.get(Integer.valueOf(i));
        if (str == null) {
            return;
        }
        C17751 c17751 = (C17751) this.f25905.get(str);
        if (c17751 == null || (interfaceC3639 = c17751.f56313) == null) {
            this.f25909.remove(str);
            this.f25906.put(str, obj);
        } else if (this.f25904.remove(str)) {
            interfaceC3639.mo10739(obj);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m20779(String str) {
        HashMap map = this.f25907;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        int iMo20624 = AbstractC7820.f25741.mo20624();
        while (true) {
            int i = iMo20624 + 65536;
            Integer numValueOf = Integer.valueOf(i);
            HashMap map2 = this.f25903;
            if (map2.containsKey(numValueOf)) {
                iMo20624 = AbstractC7820.f25741.mo20624();
            } else {
                map2.put(Integer.valueOf(i), str);
                map.put(str, Integer.valueOf(i));
                return;
            }
        }
    }
}
