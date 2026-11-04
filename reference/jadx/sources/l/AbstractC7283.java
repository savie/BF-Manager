package l;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۜܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: CB3L */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7283 extends ComponentCallbacksC11612 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C4256 f23987;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C12318 f23988;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C1229 f23989;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Bundle f23990;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Drawable f23991;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f23992;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C11713 f23993;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo19931(String... strArr);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo19940();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public abstract void mo19943();

    public AbstractC7283() {
        super(R.layout.MT_Protector);
        this.f23992 = new Object();
        this.f23990 = new Bundle();
    }

    @Override // l.ComponentCallbacksC11612
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f23989 = (C1229) new C16196((ActivityC18143) ((C7941) this).requireActivity()).m38422(C1229.class);
        this.f23988 = (C12318) new C16196(requireActivity()).m38422(C12318.class);
        this.f23993 = (C11713) new C16196(this).m38422(C11713.class);
        if (bundle != null) {
            try {
                m19948();
                return;
            } catch (IOException e) {
                mo19935(true);
                Bundle bundle2 = this.f23990;
                if (!bundle2.containsKey("filePath")) {
                    bundle2.putString("filePath", "untitled");
                }
                this.f23989.m4466(e);
            }
        }
        this.f23993.m29414(mo19940());
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Drawable m19942() {
        if (this.f23991 == null) {
            this.f23991 = C21576.m49058(this.f23990.getInt("sideIconType", 0) == 0 ? R.drawable.MT_Protector : R.drawable.MT_Protector).mutate();
        }
        return this.f23991;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19944(String str) {
        String string = UUID.randomUUID().toString();
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putString("state", string);
        setArguments(arguments);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m19937() {
        String string = requireArguments().getString("state");
        C17359.requireNonNull(string);
        return string;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m19936() {
        Bundle bundleRequireArguments = requireArguments();
        C17359.requireNonNull(bundleRequireArguments);
        return bundleRequireArguments.getBoolean("top", false);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m19938() {
        return C21301.m48541(m19937());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19929(int i) {
        Bundle bundle = this.f23990;
        if (i != bundle.getInt("sideIconType", 0)) {
            bundle.putInt("sideIconType", i);
            this.f23991 = null;
            m19928();
            mo19931("sideIconType");
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m19947() {
        int i = this.f23990.getInt("pageCount", -1);
        if (i != -1) {
            return i;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m19946() {
        return this.f23990.getString("filePath") != null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m19941() {
        String string = this.f23990.getString("filePath");
        return string == null || string.equals("untitled");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9431 m19934() {
        String string = this.f23990.getString("filePath");
        C17359.requireNonNull(string);
        return new C9431(C14584.m35193(string, new String[0]));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19932(boolean z) {
        return m19926("changed", z);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean mo19935(boolean z) {
        return m19926(d.O, z);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19945(boolean z) {
        m19926("checkFileExists", z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19930(long j) {
        Bundle bundle = this.f23990;
        if (bundle.getLong("fileTime") != j) {
            bundle.putLong("fileTime", j);
            mo19931("fileTime");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19927() {
        return this.f23990.getBoolean(d.O);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m19933() {
        return this.f23990.getBoolean("changed");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m19926(String str, boolean z) {
        Bundle bundle = this.f23990;
        if (bundle.getBoolean(str) == z) {
            return false;
        }
        bundle.putBoolean(str, z);
        mo19931(str);
        return true;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m19928() {
        ActivityC3409 activity = ((C7941) this).getActivity();
        if (activity != null) {
            ((ActivityC18143) activity).m42302();
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m19948() {
        InterfaceC24329 interfaceC24329M4658 = C1273.m4658(m19937(), C6429.of(C21301.m48536().mo4294(), new String[0]));
        if (C10353.m26633(interfaceC24329M4658)) {
            try {
                this.f23990.clear();
                this.f23990.putAll(C1405.m5137(interfaceC24329M4658));
            } catch (IOException e) {
                if (!this.f23990.containsKey("filePath")) {
                    this.f23990.putString("filePath", "untitled");
                }
                C1229 c1229 = this.f23989;
                if (c1229 != null) {
                    c1229.m4466(e);
                }
            }
            C11713 c11713 = this.f23993;
            if (c11713 != null) {
                c11713.m29414(mo19940());
                return;
            }
            return;
        }
        synchronized (m19939().f15487) {
            AbstractC22044 abstractC22044M48537 = C21301.m48537(m19937());
            if (abstractC22044M48537.mo2934()) {
                byte[] bArrM49865 = abstractC22044M48537.m49865();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(bArrM49865, 0, bArrM49865.length);
                parcelObtain.setDataPosition(0);
                this.f23990.readFromParcel(parcelObtain);
                parcelObtain.recycle();
                C11713 c11714 = this.f23993;
                if (c11714 != null) {
                    c11714.m29414(mo19940());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C4256 m19939() {
        if (this.f23987 == null) {
            this.f23987 = C4256.m13584(C1273.m4658(m19937(), C6429.of(C21301.m48536().mo4294(), new String[0])));
        }
        return this.f23987;
    }

    @Override // l.ComponentCallbacksC11612
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo19943();
    }

    @Override // l.ComponentCallbacksC11612
    public void onPause() {
        super.onPause();
        mo19931(new String[0]);
    }
}
