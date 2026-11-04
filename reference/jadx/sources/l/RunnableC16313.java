package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܶ᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC16313 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f52960;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f52961;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f52962;

    public /* synthetic */ RunnableC16313(int i, Object obj, Object obj2) {
        this.f52960 = i;
        this.f52962 = obj;
        this.f52961 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f52960) {
            case 0:
                ((InterfaceC9600) this.f52962).mo1839((C14406) this.f52961);
                break;
            case 1:
                SharedPreferencesOnSharedPreferenceChangeListenerC3444 sharedPreferencesOnSharedPreferenceChangeListenerC3444 = (SharedPreferencesOnSharedPreferenceChangeListenerC3444) this.f52962;
                C13511 c13511 = (C13511) this.f52961;
                sharedPreferencesOnSharedPreferenceChangeListenerC3444.getClass();
                C21576.m49068(new RunnableC8498(3, sharedPreferencesOnSharedPreferenceChangeListenerC3444, c13511));
                break;
            case 2:
                ((C3966) this.f52962).m12715((String) this.f52961, true);
                break;
            case 3:
                ArrayList arrayList = (ArrayList) this.f52962;
                C12915 c12915 = (C12915) this.f52961;
                ((C14406) arrayList.get(0)).m34838();
                ((C14406) arrayList.get(1)).m34838();
                AbstractC22044 abstractC22044M34845 = ((C14406) arrayList.get(0)).m34845();
                AbstractC22044 abstractC22044M34846 = ((C14406) arrayList.get(1)).m34845();
                C9170 c9170 = new C9170(abstractC22044M34845, abstractC22044M34846, abstractC22044M34845.mo4294(), abstractC22044M34846.mo4294(), c12915.m31987(), c12915.m31987());
                C8614 c8614M31983 = c12915.m31983();
                c9170.m24305();
                C16879.m39842(c9170, c8614M31983);
                break;
            default:
                C10060.m26011((C8614) this.f52962, (InterfaceC2386) this.f52961);
                break;
        }
    }
}
