package l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܶܽ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 75VW */
/* JADX INFO: loaded from: classes4.dex */
public final class C15345 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22149 f49956;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C11545 f49957;

    public C15345(C11545 c11545) {
        this.f49957 = c11545;
        C22149 c22149 = new C22149(c11545.m28824());
        c22149.m49138();
        c22149.m49164();
        this.f49956 = c22149;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36732(C5696 c5696) {
        C12107 c12107M15713 = c5696.m15713();
        C22149 c22149 = this.f49956;
        c22149.m49153(c5696);
        c22149.m49148(R.string.MT_Protector);
        c22149.m49157(c5696.getSize()).m9599(8);
        if (c12107M15713.m30130()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("0 → ");
            spannableStringBuilder.append((CharSequence) c12107M15713.m30132().getName());
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) " (").append((CharSequence) C16737.m39288(R.string.MT_Protector)).append((CharSequence) MotionUtils.EASING_TYPE_FORMAT_END);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C20368.f65988), length, spannableStringBuilder.length(), 17);
            c22149.m49143(R.string.MT_Protector, new C13228(spannableStringBuilder, c12107M15713));
        } else {
            c22149.m49144(c12107M15713.m30138());
        }
        c22149.m49162(c5696.getTime()).m9599(8);
        int i = 1;
        c22149.m49142(R.string.MT_Protector, String.format("%08X", Long.valueOf(c12107M15713.m30113() & 4294967295L))).m9599(8);
        C3181 c3181M49143 = c22149.m49143(R.string.arsc_entry_id, (InterfaceC4509) null);
        c3181M49143.m9599(8);
        c3181M49143.m24378();
        c22149.m49155();
        c22149.m49159();
        Button buttonM49160 = c22149.m49160();
        C11545 c11545 = this.f49957;
        C23519.m51792(buttonM49160, c11545, c5696);
        m36729(Collections.singletonList(c5696));
        C13810 c13810 = (C13810) c11545.m28817();
        if (c13810.m33623()) {
            C4716.f16636.submit(new RunnableC19230(c13810, c5696, c3181M49143, i));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m36733(final C5696 c5696) {
        C22149 c22149 = this.f49956;
        c22149.m49153(c5696);
        c22149.m49148(R.string.MT_Protector);
        c22149.m49157(c5696.getSize()).m9599(8);
        c22149.m49144(c5696.m15713().m30138());
        c22149.m49162(c5696.getTime()).m9599(8);
        c22149.m49143(R.string.MT_Protector, new InterfaceC4509() { // from class: l.ܰܽ֨
            @Override // l.InterfaceC4509
            /* JADX INFO: renamed from: ۙ */
            public final void mo4354(final TextView textView) {
                final C15345 c15345 = this.f45880;
                C22149 c221410 = c15345.f49956;
                final C5696 c5697 = c5696;
                c221410.m49143(R.string.MT_Protector, new InterfaceC4509() { // from class: l.ۨܽ֨
                    @Override // l.InterfaceC4509
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo4354(TextView textView2) {
                        C13913.m33747(textView, textView2, c15345.f49957.m28817().mo13029(), Collections.singletonList(c5697));
                    }
                });
            }
        }).m9599(8);
        c22149.m49159();
        m36729(Collections.singletonList(c5696));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36731(final List list) {
        C22149 c22149 = this.f49956;
        c22149.m49152(list);
        c22149.m49150(this.f49957.m28798(), (View.OnLongClickListener) null);
        Iterator it = list.iterator();
        long size = 0;
        long jM30138 = 0;
        while (it.hasNext()) {
            InterfaceC2557 interfaceC2557 = (InterfaceC2557) it.next();
            size += interfaceC2557.getSize();
            C5696 c5696 = (C5696) interfaceC2557;
            if (!c5696.m15713().m30130()) {
                jM30138 += c5696.m15713().m30138();
            }
        }
        c22149.m49157(size).m9599(8);
        c22149.m49144(jM30138);
        c22149.m49143(R.string.MT_Protector, new InterfaceC4509() { // from class: l.֨ܽ֨
            @Override // l.InterfaceC4509
            /* JADX INFO: renamed from: ۙ */
            public final void mo4354(final TextView textView) {
                final C15345 c15345 = this.f5394;
                C22149 c221410 = c15345.f49956;
                final List list2 = list;
                c221410.m49143(R.string.MT_Protector, new InterfaceC4509() { // from class: l.᩺ܽ֨
                    @Override // l.InterfaceC4509
                    /* JADX INFO: renamed from: ۙ */
                    public final void mo4354(TextView textView2) {
                        C13913.m33747(textView, textView2, c15345.f49957.m28817().mo13029(), list2);
                    }
                });
            }
        }).m9599(8);
        c22149.m49159();
        m36729((List) C9030.stream(list).map(new C18663(2)).collect(C1890.toList()));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m36729(final List list) {
        InterfaceC17295 interfaceC17295 = new InterfaceC17295() { // from class: l.ۘܽ֨
            @Override // l.InterfaceC17295
            public final void accept(Object obj) {
                C3181 c3181 = (C3181) obj;
                ViewOnClickListenerC22523.m50036(c3181.m9600());
                TextView textViewM9600 = c3181.m9600();
                final C15345 c15345 = this.f14954;
                final List list2 = list;
                textViewM9600.setOnClickListener(new View.OnClickListener() { // from class: l.ۚܽ֨
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C15345.m36730(c15345, list2);
                    }
                });
            }
        };
        C22149 c22149 = this.f49956;
        c22149.m49154(interfaceC17295);
        c22149.m49156().setOnClickListener(new View.OnClickListener() { // from class: l.ۜܽ֨
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C16195 c16195 = new C16195(view.getContext(), view, 0);
                c16195.m38298().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                final C15345 c15345 = this.f23167;
                final List list2 = list;
                c16195.m38296(new InterfaceC21133() { // from class: l.ۖܽ֨
                    @Override // l.InterfaceC21133
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        C15345.m36726(c15345, list2);
                        return true;
                    }
                });
                c16195.m38297();
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36726(C15345 c15345, List list) {
        new C4760(c15345.f49957, list).m13225(new RunnableC22400(c15345));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m36730(C15345 c15345, List list) {
        new C4760(c15345.f49957, list).m13225(new RunnableC22400(c15345));
    }
}
