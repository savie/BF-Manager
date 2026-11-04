package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢ۟ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: EIQQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9974 extends C8483 {
    public C9974() {
        super(R.string.MT_Protector);
    }

    @Override // l.C8483
    /* JADX INFO: renamed from: ۙ */
    public final void mo22798(final Main main, final C9170 c9170) {
        int i = ActivityC22568.f72922;
        View viewM40395 = main.m40395(R.layout.MT_Protector);
        ((TextView) viewM40395.findViewById(R.id.title)).setText(R.string.MT_Protector);
        final C23255 c23255 = (C23255) viewM40395.findViewById(R.id.MT_Protector);
        final C23255 c23256 = (C23255) viewM40395.findViewById(R.id.editText2);
        c23255.m54107(true);
        c23256.m54107(true);
        C2459.m8293(c9170.f29768, c9170.f29767, c23255, c23256);
        int i2 = DialogInterfaceC8327.f27315;
        C2361 c2361 = new C2361(main);
        c2361.m8005(viewM40395);
        c2361.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ܺ۬ᩴ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = ActivityC22568.f72922;
                C9170 c9171 = c9170;
                c9171.m24303();
                AbstractActivityC17204 abstractActivityC17204 = main;
                Intent intent = new Intent(abstractActivityC17204, (Class<?>) ActivityC22568.class);
                intent.putExtra("left", c9171.f29765.mo4294());
                intent.putExtra("right", c9171.f29769.mo4294());
                intent.putExtra("leftName", c23255.m54021().toString());
                intent.putExtra("rightName", c23256.m54021().toString());
                intent.putExtra("leftDisplayPath", c9171.f29768);
                intent.putExtra("rightDisplayPath", c9171.f29767);
                abstractActivityC17204.startActivity(intent);
            }
        });
        c2361.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8018(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c2361.m8016().m22440().setOnClickListener(new View.OnClickListener() { // from class: l.ܽ۬ᩴ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = ActivityC22568.f72922;
                C9170 c9171 = c9170;
                c9171.m24304();
                C2459.m8293(c9171.f29768, c9171.f29767, c23255, c23256);
            }
        });
    }
}
