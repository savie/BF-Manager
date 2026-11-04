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

/* JADX INFO: renamed from: l.ۗ۬۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 75VW */
/* JADX INFO: loaded from: classes2.dex */
public final class C3436 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5304 f11129;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8614 f11130;

    public C3436(C8614 c8614) {
        this.f11130 = c8614;
        C5304 c5304 = new C5304(c8614.m23233());
        c5304.m15924();
        c5304.m15925();
        this.f11129 = c5304;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11204(C2494 c2494) {
        C8002 c8002M8382 = c2494.m8382();
        C5304 c5304 = this.f11129;
        c5304.m15919(c2494);
        c5304.m15913(R.string.MT_Protector);
        c5304.m15922(c2494.getSize()).m49281(8);
        if (c8002M8382.m21813()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("0 → ");
            spannableStringBuilder.append((CharSequence) c8002M8382.m21840().getName());
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) " (").append((CharSequence) C21576.m49088(R.string.MT_Protector)).append((CharSequence) MotionUtils.EASING_TYPE_FORMAT_END);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C3296.f10741), length, spannableStringBuilder.length(), 17);
            c5304.m15908(R.string.MT_Protector, new C10577(spannableStringBuilder, c8002M8382));
        } else {
            c5304.m15909(c8002M8382.m21838());
        }
        c5304.m15929(c2494.getTime()).m49281(8);
        int i = 0;
        c5304.m15907(R.string.MT_Protector, String.format("%08X", Long.valueOf(c8002M8382.m21830() & 4294967295L))).m49281(8);
        C21712 c21712M15908 = c5304.m15908(R.string.arsc_entry_id, (InterfaceC10523) null);
        c21712M15908.m49281(8);
        c21712M15908.m14309();
        c5304.m15926();
        c5304.m15920();
        Button buttonM15927 = c5304.m15927();
        C8614 c8614 = this.f11130;
        C10060.m26010(buttonM15927, c8614, c2494);
        m11201(Collections.singletonList(c2494));
        C15102 c15102 = (C15102) c8614.m23213();
        if (c15102.m36369()) {
            C5261.f18540.submit(new RunnableC25066(c15102, c2494, c21712M15908, i));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11205(final C2494 c2494) {
        C5304 c5304 = this.f11129;
        c5304.m15919(c2494);
        c5304.m15913(R.string.MT_Protector);
        c5304.m15922(c2494.getSize()).m49281(8);
        c5304.m15909(c2494.m8382().m21838());
        c5304.m15929(c2494.getTime()).m49281(8);
        c5304.m15908(R.string.MT_Protector, new InterfaceC10523() { // from class: l.ᩴ۬۫
            @Override // l.InterfaceC10523
            public final void accept(final TextView textView) {
                final C3436 c3436 = this.f63785;
                C5304 c5305 = c3436.f11129;
                final C2494 c2495 = c2494;
                c5305.m15908(R.string.MT_Protector, new InterfaceC10523() { // from class: l.ܳ۬۫
                    @Override // l.InterfaceC10523
                    public final void accept(TextView textView2) {
                        C22501.m50734(c3436.f11130.m23213().mo10174(), Collections.singletonList(c2495), textView, textView2);
                    }
                });
            }
        }).m49281(8);
        c5304.m15920();
        m11201(Collections.singletonList(c2494));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11203(final List list) {
        C5304 c5304 = this.f11129;
        c5304.m15917(list);
        c5304.m15915(this.f11130.m23166(), (View.OnLongClickListener) null);
        Iterator it = list.iterator();
        long size = 0;
        long jM21838 = 0;
        while (it.hasNext()) {
            InterfaceC2386 interfaceC2386 = (InterfaceC2386) it.next();
            size += interfaceC2386.getSize();
            C2494 c2494 = (C2494) interfaceC2386;
            if (!c2494.m8382().m21813()) {
                jM21838 += c2494.m8382().m21838();
            }
        }
        c5304.m15922(size).m49281(8);
        c5304.m15909(jM21838);
        c5304.m15908(R.string.MT_Protector, new InterfaceC10523() { // from class: l.ۧ۬۫
            @Override // l.InterfaceC10523
            public final void accept(final TextView textView) {
                final C3436 c3436 = this.f36491;
                C5304 c5305 = c3436.f11129;
                final List list2 = list;
                c5305.m15908(R.string.MT_Protector, new InterfaceC10523() { // from class: l.᩹۬۫
                    @Override // l.InterfaceC10523
                    public final void accept(TextView textView2) {
                        C22501.m50734(c3436.f11130.m23213().mo10174(), list2, textView, textView2);
                    }
                });
            }
        }).m49281(8);
        c5304.m15920();
        m11201((List) C1170.stream(list).map(new C23773(3)).collect(C2025.toList()));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m11201(final List list) {
        InterfaceC0818 interfaceC0818 = new InterfaceC0818() { // from class: l.ܽ۬۫
            @Override // l.InterfaceC0818
            public final void accept(Object obj) {
                C21712 c21712 = (C21712) obj;
                ViewOnClickListenerC15284.m36688(c21712.m49282());
                TextView textViewM49282 = c21712.m49282();
                final C3436 c3436 = this.f57136;
                final List list2 = list;
                textViewM49282.setOnClickListener(new View.OnClickListener() { // from class: l.ۚ۬۫
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C3436.m11202(c3436, list2);
                    }
                });
            }
        };
        C5304 c5304 = this.f11129;
        c5304.m15918(interfaceC0818);
        c5304.m15921().setOnClickListener(new View.OnClickListener() { // from class: l.ܶ۬۫
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C18452 c18452 = new C18452(view.getContext(), view, 0);
                c18452.m42995().add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
                final C3436 c3436 = this.f52199;
                final List list2 = list;
                c18452.m42994(new InterfaceC21436() { // from class: l.۫۬۫
                    @Override // l.InterfaceC21436
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        C3436.m11198(c3436, list2);
                        return true;
                    }
                });
                c18452.mo21878();
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11198(C3436 c3436, List list) {
        new C22828(c3436.f11130, list).m51480(new RunnableC1945(c3436));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m11202(C3436 c3436, List list) {
        new C22828(c3436.f11130, list).m51480(new RunnableC1945(c3436));
    }
}
