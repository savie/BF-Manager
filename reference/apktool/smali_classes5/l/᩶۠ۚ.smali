.class public final Ll/᩶۠ۚ;
.super Ljava/lang/Object;
.source "K6IS"


# instance fields
.field public final ֫:Ll/֫ۜۚ;

.field public ۙ:Landroid/widget/LinearLayout;

.field public final ۚ:Ljava/lang/String;

.field public final ۤ:Ljava/lang/StringBuilder;

.field public final ۧ:Ljava/lang/String;

.field public ۫:Ll/ۡ֫֫;

.field public final ܳ:J

.field public ܺ:Landroid/widget/ScrollView;

.field public final ᩴ:J

.field public ᩷:Landroid/content/Context;

.field public ᩸:Ll/۠ۖۧ;

.field public ᩻:Ll/᩹ܺ֫;


# direct methods
.method public constructor <init>(Ll/ۡ۫;Ljava/lang/String;Ljava/lang/String;JJLl/ۡ֫֫;Ll/֫ۜۚ;)V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/᩶۠ۚ;->ۤ:Ljava/lang/StringBuilder;

    .line 41
    iput-object p2, p0, Ll/᩶۠ۚ;->ۚ:Ljava/lang/String;

    .line 42
    iput-object p3, p0, Ll/᩶۠ۚ;->ۧ:Ljava/lang/String;

    .line 43
    iput-wide p4, p0, Ll/᩶۠ۚ;->ᩴ:J

    .line 44
    iput-wide p6, p0, Ll/᩶۠ۚ;->ܳ:J

    .line 45
    iput-object p8, p0, Ll/᩶۠ۚ;->۫:Ll/ۡ֫֫;

    .line 46
    iput-object p9, p0, Ll/᩶۠ۚ;->֫:Ll/֫ۜۚ;

    .line 47
    invoke-direct {p0, p1}, Ll/᩶۠ۚ;->᩷(Ll/ۡ۫;)V

    return-void
.end method

.method private ۙ(I)V
    .locals 4

    .line 153
    invoke-direct {p0}, Ll/᩶۠ۚ;->᩸()Landroid/widget/TextView;

    move-result-object v0

    .line 154
    invoke-virtual {v0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 155
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 156
    iget-object v1, p0, Ll/᩶۠ۚ;->ۙ:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/high16 v1, 0x41800000    # 16.0f

    :goto_0
    invoke-static {v1}, Ll/ۜۙܺ;->ۙ(F)I

    move-result v1

    const/high16 v2, 0x40c00000    # 6.0f

    invoke-static {v2}, Ll/ۜۙܺ;->ۙ(F)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1, v3, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 157
    iget-object v1, p0, Ll/᩶۠ۚ;->ۙ:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 158
    iget-object v0, p0, Ll/᩶۠ۚ;->ۤ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const/16 v2, 0xa

    if-eqz v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 159
    :cond_1
    iget-object v1, p0, Ll/᩶۠ۚ;->᩷:Landroid/content/Context;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method private ۙ(ILjava/lang/String;)V
    .locals 7

    if-eqz p2, :cond_0

    .line 163
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object p2, p0, Ll/᩶۠ۚ;->᩷:Landroid/content/Context;

    const v0, 0x7f120a02

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 164
    :cond_1
    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v1, p0, Ll/᩶۠ۚ;->᩷:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    .line 165
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 166
    invoke-direct {p0}, Ll/᩶۠ۚ;->᩸()Landroid/widget/TextView;

    move-result-object v2

    invoke-direct {p0}, Ll/᩶۠ۚ;->᩸()Landroid/widget/TextView;

    move-result-object v3

    .line 167
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(I)V

    const/high16 v4, 0x41400000    # 12.0f

    .line 168
    invoke-static {v4}, Ll/ۜۙܺ;->ۙ(F)I

    move-result v4

    invoke-virtual {v2, v1, v1, v4, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 169
    invoke-static {v3, p2}, Ll/ܳۤܺ;->ۙ(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 170
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const v5, 0x3ec28f5c    # 0.38f

    const/4 v6, -0x2

    invoke-direct {v4, v1, v6, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 171
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const v4, 0x3f1eb852    # 0.62f

    invoke-direct {v2, v1, v6, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/high16 v2, 0x40400000    # 3.0f

    .line 172
    invoke-static {v2}, Ll/ۜۙܺ;->ۙ(F)I

    move-result v3

    invoke-static {v2}, Ll/ۜۙܺ;->ۙ(F)I

    move-result v2

    invoke-virtual {v0, v1, v3, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 173
    iget-object v1, p0, Ll/᩶۠ۚ;->ۙ:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 174
    iget-object v0, p0, Ll/᩶۠ۚ;->᩷:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/᩶۠ۚ;->ۤ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method private ۙ(ILjava/util/List;)V
    .locals 3

    .line 135
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_5

    .line 136
    :cond_0
    invoke-direct {p0, p1}, Ll/᩶۠ۚ;->ۙ(I)V

    .line 137
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܶܺ֫;

    .line 138
    iget-object v0, p2, Ll/ܶܺ֫;->᩷:Ljava/lang/String;

    iget p2, p2, Ll/ܶܺ֫;->ۙ:I

    const v1, 0x7f120429

    if-ne p2, v1, :cond_2

    .line 139
    iget-object v1, p0, Ll/᩶۠ۚ;->᩷:Landroid/content/Context;

    const-string v2, "1"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f12042a

    goto :goto_1

    :cond_1
    const v0, 0x7f12042b

    :goto_1
    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_2
    const v1, 0x7f120437

    if-ne p2, v1, :cond_5

    .line 142
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    const/4 v1, 0x0

    goto :goto_2

    :pswitch_0
    const/16 v1, 0x5a

    goto :goto_2

    :pswitch_1
    const/16 v1, 0x10e

    goto :goto_2

    :pswitch_2
    const/16 v1, 0xb4

    .line 144
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\u00b0"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_4

    const/4 v2, 0x4

    if-eq v0, v2, :cond_4

    const/4 v2, 0x5

    if-eq v0, v2, :cond_4

    const/4 v2, 0x7

    if-ne v0, v2, :cond_3

    goto :goto_3

    :cond_3
    move-object v0, v1

    goto :goto_4

    :cond_4
    :goto_3
    const-string v0, " ("

    .line 0
    invoke-static {v1, v0}, Ll/ۗۚ֫;->ۙ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 146
    iget-object v1, p0, Ll/᩶۠ۚ;->᩷:Landroid/content/Context;

    const v2, 0x7f120434

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 148
    :cond_5
    :goto_4
    invoke-direct {p0, p2, v0}, Ll/᩶۠ۚ;->ۙ(ILjava/lang/String;)V

    goto :goto_0

    :cond_6
    :goto_5
    return-void

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private ۙ(Ll/ܳۧ֫;Ljava/lang/String;II)V
    .locals 5

    const v0, 0x7f120420

    .line 123
    invoke-direct {p0, v0}, Ll/᩶۠ۚ;->ۙ(I)V

    const v0, 0x7f120976

    .line 124
    iget-object v1, p0, Ll/᩶۠ۚ;->ۚ:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Ll/᩶۠ۚ;->ۙ(ILjava/lang/String;)V

    const v0, 0x7f120979

    .line 125
    iget-object v1, p0, Ll/᩶۠ۚ;->ۧ:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Ll/᩶۠ۚ;->ۙ(ILjava/lang/String;)V

    const v0, 0x7f120980

    .line 126
    invoke-direct {p0, v0, p2}, Ll/᩶۠ۚ;->ۙ(ILjava/lang/String;)V

    const/4 p2, 0x0

    if-lez p3, :cond_0

    if-lez p4, :cond_0

    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " \u00d7 "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_0
    move-object p3, p2

    :goto_0
    const p4, 0x7f120425

    invoke-direct {p0, p4, p3}, Ll/᩶۠ۚ;->ۙ(ILjava/lang/String;)V

    if-nez p1, :cond_1

    .line 128
    iget-wide p3, p0, Ll/᩶۠ۚ;->ᩴ:J

    goto :goto_1

    :cond_1
    iget-wide p3, p1, Ll/ܳۧ֫;->ۤ:J

    :goto_1
    if-nez p1, :cond_2

    .line 129
    iget-wide v0, p0, Ll/᩶۠ۚ;->ܳ:J

    goto :goto_2

    :cond_2
    iget-wide v0, p1, Ll/ܳۧ֫;->᩷:J

    :goto_2
    const-wide/16 v2, 0x0

    cmp-long p1, p3, v2

    if-ltz p1, :cond_3

    .line 130
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p3, p4}, Ll/۠֫ܺ;->᩷(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " ("

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " B)"

    .line 0
    invoke-static {p1, p3, p4, v4}, Ll/ۖܶ᩸;->ۙ(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_3
    move-object p1, p2

    :goto_3
    const p3, 0x7f12097d

    .line 130
    invoke-direct {p0, p3, p1}, Ll/᩶۠ۚ;->ۙ(ILjava/lang/String;)V

    cmp-long p1, v0, v2

    if-lez p1, :cond_4

    .line 131
    invoke-static {v0, v1}, Ll/᩸֫ܺ;->᩷(J)Ljava/lang/String;

    move-result-object p2

    :cond_4
    const p1, 0x7f12097f

    invoke-direct {p0, p1, p2}, Ll/᩶۠ۚ;->ۙ(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic ۙ(Ll/᩶۠ۚ;)V
    .locals 0

    .line 92
    iget-object p0, p0, Ll/᩶۠ۚ;->ۤ:Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩶᩷ۧ;->ۙ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private ۤ()V
    .locals 5

    .line 113
    iget-object v0, p0, Ll/᩶۠ۚ;->ۙ:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 114
    iget-object v0, p0, Ll/᩶۠ۚ;->ۤ:Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 115
    iget-object v0, p0, Ll/᩶۠ۚ;->᩻:Ll/᩹ܺ֫;

    iget-object v2, v0, Ll/᩹ܺ֫;->ܳ:Ll/ܳۧ֫;

    iget-object v3, v0, Ll/᩹ܺ֫;->ᩴ:Ljava/lang/String;

    iget v4, v0, Ll/᩹ܺ֫;->۫:I

    iget v0, v0, Ll/᩹ܺ֫;->᩷:I

    invoke-direct {p0, v2, v3, v4, v0}, Ll/᩶۠ۚ;->ۙ(Ll/ܳۧ֫;Ljava/lang/String;II)V

    .line 116
    iget-object v0, p0, Ll/᩶۠ۚ;->᩻:Ll/᩹ܺ֫;

    .line 54
    iget-object v0, v0, Ll/᩹ܺ֫;->ۙ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶܺ֫;

    .line 55
    iget v2, v2, Ll/ܶܺ֫;->ۙ:I

    const v3, 0x7f120433

    if-eq v2, v3, :cond_1

    const v3, 0x7f120435

    if-ne v2, v3, :cond_0

    :cond_1
    const v0, 0x7f120422

    goto :goto_0

    :cond_2
    const v0, 0x7f120426

    .line 116
    :goto_0
    iget-object v2, p0, Ll/᩶۠ۚ;->᩻:Ll/᩹ܺ֫;

    iget-object v2, v2, Ll/᩹ܺ֫;->ۙ:Ljava/util/List;

    invoke-direct {p0, v0, v2}, Ll/᩶۠ۚ;->ۙ(ILjava/util/List;)V

    .line 118
    iget-object v0, p0, Ll/᩶۠ۚ;->᩻:Ll/᩹ܺ֫;

    iget-object v0, v0, Ll/᩹ܺ֫;->ۤ:Ljava/util/List;

    const v2, 0x7f120431

    invoke-direct {p0, v2, v0}, Ll/᩶۠ۚ;->ۙ(ILjava/util/List;)V

    .line 119
    iget-object v0, p0, Ll/᩶۠ۚ;->᩻:Ll/᩹ܺ֫;

    iget v0, v0, Ll/᩹ܺ֫;->᩸:I

    if-eqz v0, :cond_3

    .line 178
    invoke-direct {p0}, Ll/᩶۠ۚ;->᩸()Landroid/widget/TextView;

    move-result-object v2

    .line 179
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(I)V

    const/high16 v0, 0x41800000    # 16.0f

    .line 180
    invoke-static {v0}, Ll/ۜۙܺ;->ۙ(F)I

    move-result v0

    invoke-virtual {v2, v1, v0, v1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 181
    iget-object v0, p0, Ll/᩶۠ۚ;->ۙ:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_3
    return-void
.end method

.method private ᩷(Ll/ۡ۫;)V
    .locals 7

    .line 52
    invoke-virtual {p1}, Ll/ۡ۫;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v0, v0, 0x30

    const/16 v1, 0x20

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 54
    :goto_0
    sget v1, Ll/۠ۖۧ;->᩶:I

    .line 192
    new-instance v1, Ll/ۖۖۧ;

    invoke-direct {v1, p1}, Ll/ۖۖۧ;-><init>(Landroid/content/Context;)V

    .line 56
    invoke-virtual {v1}, Ll/ۖۖۧ;->᩷()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ll/᩶۠ۚ;->᩷:Landroid/content/Context;

    .line 57
    new-instance p1, Landroid/widget/LinearLayout;

    iget-object v3, p0, Ll/᩶۠ۚ;->᩷:Landroid/content/Context;

    invoke-direct {p1, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Ll/᩶۠ۚ;->ۙ:Landroid/widget/LinearLayout;

    .line 58
    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/high16 p1, 0x41c00000    # 24.0f

    .line 59
    invoke-static {p1}, Ll/ۜۙܺ;->ۙ(F)I

    move-result p1

    .line 60
    iget-object v2, p0, Ll/᩶۠ۚ;->ۙ:Landroid/widget/LinearLayout;

    const/high16 v3, 0x41000000    # 8.0f

    invoke-static {v3}, Ll/ۜۙܺ;->ۙ(F)I

    move-result v4

    invoke-static {v3}, Ll/ۜۙܺ;->ۙ(F)I

    move-result v3

    invoke-virtual {v2, p1, v4, p1, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 61
    new-instance p1, Landroid/widget/ScrollView;

    iget-object v2, p0, Ll/᩶۠ۚ;->᩷:Landroid/content/Context;

    invoke-direct {p1, v2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Ll/᩶۠ۚ;->ܺ:Landroid/widget/ScrollView;

    .line 62
    iget-object v2, p0, Ll/᩶۠ۚ;->ۙ:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v2}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    const p1, 0x7f120439

    .line 63
    invoke-virtual {v1, p1}, Ll/ۖۖۧ;->᩷(I)V

    iget-object p1, p0, Ll/᩶۠ۚ;->ܺ:Landroid/widget/ScrollView;

    invoke-virtual {v1, p1}, Ll/ۖۖۧ;->ۙ(Landroid/view/View;)V

    const p1, 0x7f120424

    const/4 v2, 0x0

    .line 64
    invoke-virtual {v1, p1, v2}, Ll/ۖۖۧ;->ۤ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12018c

    .line 65
    invoke-virtual {v1, p1, v2}, Ll/ۖۖۧ;->᩸(ILandroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {v1}, Ll/ۖۖۧ;->ۙ()Ll/۠ۖۧ;

    move-result-object p1

    iput-object p1, p0, Ll/᩶۠ۚ;->᩸:Ll/۠ۖۧ;

    .line 66
    invoke-virtual {p1, v0}, Ll/۠ۖۧ;->᩷(I)V

    .line 67
    iget-object p1, p0, Ll/᩶۠ۚ;->᩸:Ll/۠ۖۧ;

    new-instance v0, Ll/᩺۠ۚ;

    invoke-direct {v0, p0}, Ll/᩺۠ۚ;-><init>(Ll/᩶۠ۚ;)V

    invoke-virtual {p1, v0}, Ll/۠ۖۧ;->ۙ(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 68
    iget-object p1, p0, Ll/᩶۠ۚ;->᩻:Ll/᩹ܺ֫;

    if-eqz p1, :cond_1

    invoke-direct {p0}, Ll/᩶۠ۚ;->ۤ()V

    return-void

    .line 70
    :cond_1
    iget-object p1, p0, Ll/᩶۠ۚ;->ۤ:Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 71
    iget-object p1, p0, Ll/᩶۠ۚ;->۫:Ll/ۡ֫֫;

    if-nez p1, :cond_2

    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    iget v1, p1, Ll/ۡ֫֫;->֫:I

    :goto_1
    if-nez p1, :cond_3

    const/4 v3, 0x0

    goto :goto_2

    :cond_3
    iget v3, p1, Ll/ۡ֫֫;->ۤ:I

    :goto_2
    if-eqz p1, :cond_4

    .line 72
    iget v4, p1, Ll/ۡ֫֫;->ᩴ:I

    const/4 v5, 0x5

    if-lt v4, v5, :cond_4

    move v6, v3

    move v3, v1

    move v1, v6

    :cond_4
    if-nez p1, :cond_5

    move-object v4, v2

    goto :goto_3

    .line 73
    :cond_5
    iget-object v4, p1, Ll/ۡ֫֫;->ۚ:Ll/ܳۧ֫;

    :goto_3
    if-nez p1, :cond_6

    goto :goto_4

    :cond_6
    iget-object v2, p1, Ll/ۡ֫֫;->᩸:Ljava/lang/String;

    :goto_4
    invoke-direct {p0, v4, v2, v1, v3}, Ll/᩶۠ۚ;->ۙ(Ll/ܳۧ֫;Ljava/lang/String;II)V

    .line 178
    invoke-direct {p0}, Ll/᩶۠ۚ;->᩸()Landroid/widget/TextView;

    move-result-object p1

    const v1, 0x7f12057b

    .line 179
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    const/high16 v1, 0x41800000    # 16.0f

    .line 180
    invoke-static {v1}, Ll/ۜۙܺ;->ۙ(F)I

    move-result v1

    invoke-virtual {p1, v0, v1, v0, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 181
    iget-object v0, p0, Ll/᩶۠ۚ;->ۙ:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic ᩷(Ll/᩶۠ۚ;)V
    .locals 0

    .line 67
    iget-object p0, p0, Ll/᩶۠ۚ;->֫:Ll/֫ۜۚ;

    invoke-virtual {p0}, Ll/֫ۜۚ;->run()V

    return-void
.end method

.method private ᩸()Landroid/widget/TextView;
    .locals 4

    .line 185
    iget-object v0, p0, Ll/᩶۠ۚ;->᩷:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x7f0d01e8

    invoke-virtual {v0, v3, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method


# virtual methods
.method public final ۙ()V
    .locals 1

    .line 95
    iget-object v0, p0, Ll/᩶۠ۚ;->᩸:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->dismiss()V

    return-void
.end method

.method public final ۙ(Ll/ۡ֫֫;)V
    .locals 1

    .line 104
    iput-object p1, p0, Ll/᩶۠ۚ;->۫:Ll/ۡ֫֫;

    .line 105
    iget-object v0, p0, Ll/᩶۠ۚ;->᩻:Ll/᩹ܺ֫;

    if-nez v0, :cond_0

    goto :goto_0

    .line 106
    :cond_0
    invoke-virtual {v0, p1}, Ll/᩹ܺ֫;->ۙ(Ll/ۡ֫֫;)Ll/᩹ܺ֫;

    move-result-object p1

    .line 107
    iget-object v0, p0, Ll/᩶۠ۚ;->᩻:Ll/᩹ܺ֫;

    if-ne p1, v0, :cond_1

    :goto_0
    return-void

    .line 108
    :cond_1
    iput-object p1, p0, Ll/᩶۠ۚ;->᩻:Ll/᩹ܺ֫;

    .line 109
    invoke-direct {p0}, Ll/᩶۠ۚ;->ۤ()V

    return-void
.end method

.method public final ۙ(Ll/ۡ۫;)V
    .locals 3

    .line 80
    iget-object v0, p0, Ll/᩶۠ۚ;->᩷:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-virtual {p1}, Ll/ۡ۫;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 81
    :cond_0
    iget-object v0, p0, Ll/᩶۠ۚ;->ܺ:Landroid/widget/ScrollView;

    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v0

    .line 82
    iget-object v1, p0, Ll/᩶۠ۚ;->᩸:Ll/۠ۖۧ;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/۠ۖۧ;->ۙ(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 83
    iget-object v1, p0, Ll/᩶۠ۚ;->᩸:Ll/۠ۖۧ;

    invoke-virtual {v1}, Ll/۠ۖۧ;->dismiss()V

    .line 84
    invoke-direct {p0, p1}, Ll/᩶۠ۚ;->᩷(Ll/ۡ۫;)V

    .line 85
    invoke-virtual {p0}, Ll/᩶۠ۚ;->᩷()V

    .line 86
    iget-object p1, p0, Ll/᩶۠ۚ;->ܺ:Landroid/widget/ScrollView;

    .line 87
    new-instance v1, Ll/ܰ۠ۚ;

    invoke-direct {v1, p1, v0}, Ll/ܰ۠ۚ;-><init>(Landroid/widget/ScrollView;I)V

    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ۙ(Ll/᩹ܺ֫;)V
    .locals 1

    .line 98
    iget-object v0, p0, Ll/᩶۠ۚ;->۫:Ll/ۡ֫֫;

    invoke-virtual {p1, v0}, Ll/᩹ܺ֫;->ۙ(Ll/ۡ֫֫;)Ll/᩹ܺ֫;

    move-result-object p1

    iput-object p1, p0, Ll/᩶۠ۚ;->᩻:Ll/᩹ܺ֫;

    .line 99
    invoke-direct {p0}, Ll/᩶۠ۚ;->ۤ()V

    return-void
.end method

.method public final ᩷()V
    .locals 2

    .line 91
    iget-object v0, p0, Ll/᩶۠ۚ;->᩸:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->ۚ()V

    .line 92
    iget-object v0, p0, Ll/᩶۠ۚ;->᩸:Ll/۠ۖۧ;

    invoke-virtual {v0}, Ll/۠ۖۧ;->᩸()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ۘ۠ۚ;

    invoke-direct {v1, p0}, Ll/ۘ۠ۚ;-><init>(Ll/᩶۠ۚ;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
