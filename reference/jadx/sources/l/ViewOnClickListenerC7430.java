package l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۜ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC7430 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public View f24448;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f24449;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public View f24450;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C19363 f24451;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public View f24452;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f24453;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C19363 f24455;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C8176 f24456;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public View f24458;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile C8921 f24459;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public View f24460;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC17204 f24462;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public View f24463;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f24457 = false;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f24454 = false;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f24461 = true;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewOnClickListenerC7430(InterfaceC23488 interfaceC23488) {
        this.f24453 = (AbstractActivityC17204) interfaceC23488;
        AbstractActivityC17204 abstractActivityC17204Mo44752 = interfaceC23488.mo44752();
        this.f24462 = abstractActivityC17204Mo44752;
        this.f24463 = abstractActivityC17204Mo44752.m40418(R.id.MT_Protector);
        this.f24450 = abstractActivityC17204Mo44752.m40418(R.id.MT_Protector);
        abstractActivityC17204Mo44752.m40418(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC17204Mo44752.m40418(R.id.MT_Protector).setOnClickListener(this);
        View viewM40418 = abstractActivityC17204Mo44752.m40418(R.id.MT_Protector);
        this.f24460 = viewM40418;
        viewM40418.setOnClickListener(this);
        View viewM40419 = abstractActivityC17204Mo44752.m40418(R.id.MT_Protector);
        this.f24448 = viewM40419;
        viewM40419.setOnClickListener(this);
        abstractActivityC17204Mo44752.m40418(R.id.MT_Protector).setOnClickListener(this);
        View viewM404110 = abstractActivityC17204Mo44752.m40418(R.id.MT_Protector);
        this.f24452 = viewM404110;
        this.f24458 = viewM404110;
        viewM404110.setOnClickListener(this);
        this.f24452 = ((ViewGroup) viewM404110).getChildAt(1);
        this.f24451 = new C19363(true, (C17771) abstractActivityC17204Mo44752.m40418(R.id.MT_Protector), (TextView) abstractActivityC17204Mo44752.m40418(R.id.MT_Protector), (Spinner) abstractActivityC17204Mo44752.m40418(R.id.MT_Protector), (CheckBox) abstractActivityC17204Mo44752.m40418(R.id.MT_Protector));
        this.f24455 = new C19363(false, (C17771) abstractActivityC17204Mo44752.m40418(R.id.MT_Protector), (TextView) abstractActivityC17204Mo44752.m40418(R.id.MT_Protector), (Spinner) abstractActivityC17204Mo44752.m40418(R.id.MT_Protector), (CheckBox) abstractActivityC17204Mo44752.m40418(R.id.MT_Protector));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20361(boolean z) {
        this.f24449 = z;
        View view = this.f24458;
        if (z) {
            if (this.f24454) {
                this.f24454 = false;
                this.f24450.setVisibility(8);
                this.f24452.setRotationX(0.0f);
            }
            view.setVisibility(8);
            this.f24460.setEnabled(false);
            this.f24448.setEnabled(false);
            return;
        }
        view.setVisibility(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ViewOnClickListenerC7430 m20347(InterfaceC23488 interfaceC23488) {
        return new ViewOnClickListenerC7430(interfaceC23488);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m20365() {
        return this.f24459 != null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20360() {
        C8921 c8921 = this.f24459;
        if (c8921 != null) {
            c8921.cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ܽ֡֫, l.᩹ۤܳ] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20364() {
        C19363 c19363 = this.f24451;
        if (c19363.f62550 || c19363.f62544) {
            m20362();
            return;
        }
        boolean z = this.f24449;
        View view = this.f24448;
        View view2 = this.f24460;
        if (z || !this.f24454 || this.f24455.f62544) {
            view2.setEnabled(false);
            view.setEnabled(false);
        } else {
            view2.setEnabled(true);
            view.setEnabled(true);
        }
        if (this.f24457) {
            return;
        }
        this.f24453.mo44746();
        this.f24463.setVisibility(0);
        this.f24457 = true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m20362() {
        if (this.f24457) {
            this.f24463.setVisibility(8);
            this.f24457 = false;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m20363() {
        return this.f24457;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.ܽ֡֫, l.᩹ۤܳ] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (m20365()) {
            return;
        }
        int id = view.getId();
        if ((id == R.id.MT_Protector || id == R.id.MT_Protector) && this.f24449) {
            return;
        }
        ?? r3 = this.f24453;
        if ((id == R.id.MT_Protector || id == R.id.MT_Protector) && r3.mo44761().m31394()) {
            C22673.m51152(R.string.MT_Protector);
            return;
        }
        if (id == R.id.MT_Protector) {
            m20357();
            return;
        }
        if (id == R.id.MT_Protector) {
            m20358();
            return;
        }
        C19363 c19363 = this.f24455;
        if (id == R.id.MT_Protector) {
            C12628 c12628Mo44761 = r3.mo44761();
            C8176 c8176 = this.f24456;
            if (c8176 != null) {
                C5917 c5917 = c12628Mo44761.f40509;
                if (c8176.m22083(c5917.m17213(), c5917.m17202(), c5917.m17208(), c5917.m17206())) {
                    c19363.m44777();
                    if (c12628Mo44761.m31370(c19363.f62552)) {
                        if (this.f24461) {
                            m20358();
                            return;
                        } else {
                            m20357();
                            return;
                        }
                    }
                    return;
                }
            }
            if (this.f24461) {
                m20358();
                return;
            } else {
                m20357();
                return;
            }
        }
        if (id != R.id.MT_Protector) {
            if (id == R.id.MT_Protector) {
                m20362();
                return;
            }
            if (id != R.id.MT_Protector || this.f24449) {
                return;
            }
            boolean z = this.f24454;
            View view2 = this.f24452;
            View view3 = this.f24450;
            if (z) {
                this.f24454 = false;
                view3.setVisibility(8);
                view2.setRotationX(0.0f);
                return;
            } else {
                this.f24454 = true;
                view3.setVisibility(0);
                view2.setRotationX(180.0f);
                return;
            }
        }
        C19363 c19364 = this.f24451;
        c19364.m44777();
        c19363.m44777();
        C12628 c12628Mo44762 = r3.mo44761();
        C19143 c19143M17213 = c12628Mo44762.f40509.m17213();
        byte[] bArr = c19364.f62552;
        byte[] bArr2 = c19363.f62552;
        if (bArr == null || bArr.length == 0) {
            this.f24456 = null;
            return;
        }
        final C8921 c8921 = new C8921();
        final C9666 c9666 = new C9666(this, c12628Mo44762, c19143M17213);
        C17103 c17103M31353 = c12628Mo44762.m31353(new Runnable() { // from class: l.᩹᩸ܳ
            @Override // java.lang.Runnable
            public final void run() {
                c8921.cancel();
            }
        }, new Runnable() { // from class: l.ۗ᩸ܳ
            @Override // java.lang.Runnable
            public final void run() {
                c9666.m25181();
            }
        });
        if (c17103M31353 == null) {
            C22673.m51152(R.string.MT_Protector);
        } else {
            new C0718(this, c8921, c19143M17213, c17103M31353, c9666, bArr, bArr2, c12628Mo44762).m8197();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ܽ֡֫, l.᩹ۤܳ] */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m20357() {
        this.f24461 = false;
        C19363 c19363 = this.f24451;
        c19363.m44777();
        C12628 c12628Mo44761 = this.f24453.mo44761();
        C5917 c5917 = c12628Mo44761.f40509;
        C19143 c19143M17213 = c5917.m17213();
        byte[] bArr = c19363.f62552;
        if (bArr == null || bArr.length == 0) {
            this.f24456 = null;
            return;
        }
        this.f24456 = null;
        new C6685(this, new C8921(), c19143M17213, bArr, !c5917.m17206() ? c5917.m17202() : ((long) c5917.m17202()) - 1, c12628Mo44761).m8197();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ܽ֡֫, l.᩹ۤܳ] */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m20358() {
        long jM17208;
        this.f24461 = true;
        C19363 c19363 = this.f24451;
        c19363.m44777();
        C12628 c12628Mo44761 = this.f24453.mo44761();
        C5917 c5917 = c12628Mo44761.f40509;
        C19143 c19143M17213 = c5917.m17213();
        byte[] bArr = c19363.f62552;
        if (bArr == null || bArr.length == 0) {
            this.f24456 = null;
            return;
        }
        this.f24456 = null;
        if (!c5917.m17206()) {
            jM17208 = c5917.m17202();
        } else {
            jM17208 = ((long) c5917.m17208()) + 1;
        }
        new C14887(this, new C8921(), c19143M17213, bArr, m20346(jM17208, false), c12628Mo44761).m8197();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10412 m20348(C19143 c19143, C4908 c4908, byte[] bArr, byte[] bArr2, C18617 c18617) {
        C17359.requireNonNull(c19143, "document");
        C17359.requireNonNull(bArr, "pattern");
        if (bArr.length == 0) {
            return new C10412(0L, 0, false);
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        InterfaceC7509 interfaceC7509M41888 = C17950.m41888(c18617);
        C0498 c0498M44360 = c19143.m44360(c4908);
        try {
            if (bArr.length > c4908.length()) {
                C10412 c10412 = new C10412(0L, 0, false);
                c0498M44360.close();
                return c10412;
            }
            C1464 c1464 = new C1464(c0498M44360.m2452(bArr.length, bArr3), c4908.length(), bArr, bArr3, interfaceC7509M41888);
            try {
                c4908.m15064(c1464, c4908.length());
                if (interfaceC7509M41888.mo924()) {
                    C10412 c10412M26723 = C10412.m26723();
                    c0498M44360.close();
                    return c10412M26723;
                }
                try {
                    C10412 c10412Finish = c1464.finish();
                    if (interfaceC7509M41888.mo924()) {
                        C10412 c10412M26724 = C10412.m26723();
                        c0498M44360.close();
                        return c10412M26724;
                    }
                    if (c10412Finish.f33102 != 0) {
                        int i = c10412Finish.f33101;
                        c0498M44360.m2458(i, i);
                        if (!c0498M44360.m2457(interfaceC7509M41888)) {
                            C10412 c10412M26725 = C10412.m26723();
                            c0498M44360.close();
                            return c10412M26725;
                        }
                    }
                    c0498M44360.close();
                    return c10412Finish;
                } catch (C9446 unused) {
                    C10412 c10412M26726 = C10412.m26723();
                    c0498M44360.close();
                    return c10412M26726;
                }
            } catch (C2955 unused2) {
                C10412 c10412M26727 = C10412.m26723();
                c0498M44360.close();
                return c10412M26727;
            }
        } catch (Throwable th) {
            try {
                c0498M44360.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20351(ViewOnClickListenerC7430 viewOnClickListenerC7430, C8921 c8921) {
        if (viewOnClickListenerC7430.f24459 != null) {
            throw new IllegalStateException("Another search task is active");
        }
        viewOnClickListenerC7430.f24459 = c8921;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m20359(ViewOnClickListenerC7430 viewOnClickListenerC7430, C8921 c8921) {
        if (viewOnClickListenerC7430.f24459 == c8921) {
            viewOnClickListenerC7430.f24459 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ܽ֡֫, l.᩹ۤܳ] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m20356(C19143 c19143) {
        AbstractActivityC17204 abstractActivityC17204 = this.f24462;
        return (abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed() || this.f24453.mo44761().f40509.m17213() != c19143) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20355(ViewOnClickListenerC7430 viewOnClickListenerC7430, C19143 c19143, C4908 c4908) {
        return c4908 != null && viewOnClickListenerC7430.m20356(c19143) && c19143.m44373() == c4908.m15063();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20352(ViewOnClickListenerC7430 viewOnClickListenerC7430, C12628 c12628, C19143 c19143, Exception exc) {
        if (viewOnClickListenerC7430.m20356(c19143)) {
            if (exc instanceof C12562) {
                C22673.m51152(R.string.MT_Protector);
            } else if (!(exc instanceof IOException)) {
                viewOnClickListenerC7430.f24462.m40401(exc, (DialogInterface.OnDismissListener) null);
            } else {
                c12628.m31361((IOException) exc);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20353(C7956 c7956) {
        if (c7956 != null) {
            c7956.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m20346(long j, boolean z) {
        if (j < (z ? -1L : 0L) || j > 2147483647L) {
            throw new IndexOutOfBoundsException(C24770.m55292(j, "Search offset="));
        }
        return (int) j;
    }
}
