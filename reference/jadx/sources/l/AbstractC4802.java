package l;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۙᩳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: CB3L */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4802 extends ComponentCallbacksC22654 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Drawable f16881;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C0652 f16882;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C6382 f16883;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Bundle f16884;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C21030 f16885;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f16886;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C6919 f16887;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract void mo13341(String... strArr);

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo13352();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public abstract void mo13355();

    public AbstractC4802() {
        super(R.layout.MT_Protector);
        this.f16886 = new Object();
        this.f16884 = new Bundle();
    }

    @Override // l.ComponentCallbacksC22654
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16882 = (C0652) new C16717((ActivityC11632) ((C20409) this).requireActivity()).m39205(C0652.class);
        this.f16883 = (C6382) new C16717(requireActivity()).m39205(C6382.class);
        this.f16887 = (C6919) new C16717(this).m39205(C6919.class);
        if (bundle != null) {
            try {
                m13354();
                return;
            } catch (IOException e) {
                m13347(true);
                Bundle bundle2 = this.f16884;
                if (!bundle2.containsKey("filePath")) {
                    bundle2.putString("filePath", "untitled");
                }
                this.f16882.m2969((Throwable) e);
            }
        }
        this.f16887.m18564(mo13352());
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Drawable m13343() {
        if (this.f16881 == null) {
            this.f16881 = C16737.m39263(this.f16884.getInt("sideIconType", 0) == 0 ? R.drawable.MT_Protector : R.drawable.MT_Protector).mutate();
        }
        return this.f16881;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13349(String str) {
        String string = UUID.randomUUID().toString();
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putString("state", string);
        setArguments(arguments);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m13348() {
        String string = requireArguments().getString("state");
        C13638.requireNonNull(string);
        return string;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m13358() {
        Bundle bundleRequireArguments = requireArguments();
        C13638.requireNonNull(bundleRequireArguments);
        return bundleRequireArguments.getBoolean("top", false);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m13357() {
        return C2417.m7347(m13348());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13339(int i) {
        Bundle bundle = this.f16884;
        if (i != bundle.getInt("sideIconType", 0)) {
            bundle.putInt("sideIconType", i);
            this.f16881 = null;
            m13345();
            mo13341("sideIconType");
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m13337() {
        int i = this.f16884.getInt("pageCount", -1);
        if (i != -1) {
            return i;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m13351() {
        return this.f16884.getString("filePath") != null;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m13356() {
        String string = this.f16884.getString("filePath");
        return string == null || string.equals("untitled");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C16881 m13346() {
        String string = this.f16884.getString("filePath");
        C13638.requireNonNull(string);
        return new C16881(C5553.m15313(string, new String[0]));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13342(boolean z) {
        return m13336("changed", z);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m13347(boolean z) {
        m13336(d.O, z);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m13350(boolean z) {
        m13336("checkFileExists", z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13340(long j) {
        Bundle bundle = this.f16884;
        if (bundle.getLong("fileTime") != j) {
            bundle.putLong("fileTime", j);
            mo13341("fileTime");
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m13338() {
        return this.f16884.getBoolean("changed");
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m13344() {
        return this.f16884.getBoolean(d.O);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m13336(String str, boolean z) {
        Bundle bundle = this.f16884;
        if (bundle.getBoolean(str) == z) {
            return false;
        }
        bundle.putBoolean(str, z);
        mo13341(str);
        return true;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m13345() {
        ActivityC19126 activity = ((C20409) this).getActivity();
        if (activity != null) {
            ((ActivityC11632) activity).m29018();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m13354() {
        InterfaceC3800 interfaceC3800M28083 = C11153.m28083(m13348(), C12974.of(C2417.m7342().mo33986(), new String[0]));
        if (C4138.m11771(interfaceC3800M28083)) {
            try {
                this.f16884.clear();
                this.f16884.putAll(C6961.m18712(interfaceC3800M28083));
            } catch (IOException e) {
                if (!this.f16884.containsKey("filePath")) {
                    this.f16884.putString("filePath", "untitled");
                }
                C0652 c0652 = this.f16882;
                if (c0652 != null) {
                    c0652.m2969((Throwable) e);
                }
            }
            C6919 c6919 = this.f16887;
            if (c6919 != null) {
                c6919.m18564(mo13352());
                return;
            }
            return;
        }
        synchronized (m13353().f68493) {
            AbstractC20745 abstractC20745M7343 = C2417.m7343(m13348());
            if (abstractC20745M7343.mo33975()) {
                byte[] bArrM46727 = abstractC20745M7343.m46727();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.unmarshall(bArrM46727, 0, bArrM46727.length);
                parcelObtain.setDataPosition(0);
                this.f16884.readFromParcel(parcelObtain);
                parcelObtain.recycle();
                C6919 c69110 = this.f16887;
                if (c69110 != null) {
                    c69110.m18564(mo13352());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21030 m13353() {
        if (this.f16885 == null) {
            this.f16885 = C21030.m47403(C11153.m28083(m13348(), C12974.of(C2417.m7342().mo33986(), new String[0])));
        }
        return this.f16885;
    }

    @Override // l.ComponentCallbacksC22654
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo13355();
    }

    @Override // l.ComponentCallbacksC22654
    public void onPause() {
        super.onPause();
        mo13341(new String[0]);
    }
}
