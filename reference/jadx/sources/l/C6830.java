package l;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStub;
import android.webkit.WebView;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H6JL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6830 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public View f22687;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f22688;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final WebView f22689;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ViewStub f22690;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public View f22691;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C17224 f22692;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public View f22693;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m19017(C6830 c6830, int i) {
        c6830.getClass();
        if (i != 3 && i != 0) {
            return false;
        }
        if (c6830.f22693.isEnabled()) {
            c6830.f22689.findNext(true);
        }
        c6830.f22692.m54001();
        return true;
    }

    public C6830(ViewStub viewStub, WebView webView) {
        this.f22690 = viewStub;
        this.f22689 = webView;
        webView.setFindListener(new WebView.FindListener() { // from class: l.ۖۖ֫
            @Override // android.webkit.WebView.FindListener
            public final void onFindResultReceived(int i, int i2, boolean z) {
                C6830.m19015(this.f7600, i2, z);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19015(C6830 c6830, int i, boolean z) {
        if (!c6830.m19020() || c6830.f22688 || c6830.f22692.m54099() <= 0 || !z) {
            return;
        }
        c6830.m19016(i > 0);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m19024() {
        if (this.f22687 == null) {
            View viewInflate = this.f22690.inflate();
            this.f22687 = viewInflate;
            this.f22692 = (C17224) viewInflate.findViewById(R.id.MT_Protector);
            this.f22691 = this.f22687.findViewById(R.id.MT_Protector);
            this.f22693 = this.f22687.findViewById(R.id.MT_Protector);
            int i = 1;
            this.f22691.setOnClickListener(new ViewOnClickListenerC11237(i, this));
            this.f22693.setOnClickListener(new ViewOnClickListenerC24664(i, this));
            View view = this.f22691;
            C6696.m18717(view, view.getContentDescription());
            View view2 = this.f22693;
            C6696.m18717(view2, view2.getContentDescription());
            View viewFindViewById = this.f22687.findViewById(R.id.MT_Protector);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.֨ۖ֫
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    this.f3234.m19022();
                }
            });
            C6696.m18717(viewFindViewById, viewFindViewById.getContentDescription());
            this.f22692.m52296(true);
            this.f22692.m52333(3);
            this.f22692.m40458(new InterfaceC16478() { // from class: l.ۡۖ֫
                @Override // l.InterfaceC16478
                /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
                public final boolean mo24198(C17224 c17224, int i2, KeyEvent keyEvent) {
                    return C6830.m19017(this.f29468, i2);
                }
            });
            this.f22692.m53899(new C8321(this));
        }
        this.f22687.setVisibility(0);
        m19019();
        this.f22692.requestFocus();
        C21576.m49076(this.f22692);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m19020() {
        View view = this.f22687;
        return view != null && view.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m19022() {
        if (!m19020()) {
            return false;
        }
        this.f22687.setVisibility(8);
        this.f22692.m54001();
        this.f22692.clearFocus();
        m19016(false);
        WebView webView = this.f22689;
        webView.findAllAsync("");
        webView.clearMatches();
        webView.requestFocus();
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m19026() {
        this.f22688 = true;
        if (m19020()) {
            m19016(false);
            WebView webView = this.f22689;
            webView.findAllAsync("");
            webView.clearMatches();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m19023() {
        this.f22688 = false;
        m19019();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public void m19019() {
        if (m19020()) {
            m19016(false);
            boolean z = this.f22688;
            WebView webView = this.f22689;
            if (!z && this.f22692.m54099() != 0) {
                webView.findAllAsync(this.f22692.m54021().toString());
                return;
            }
            m19016(false);
            webView.findAllAsync("");
            webView.clearMatches();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m19016(boolean z) {
        this.f22691.setEnabled(z);
        this.f22693.setEnabled(z);
        this.f22691.setAlpha(z ? 1.0f : 0.38f);
        this.f22693.setAlpha(z ? 1.0f : 0.38f);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19025() {
        this.f22689.setFindListener(null);
    }
}
