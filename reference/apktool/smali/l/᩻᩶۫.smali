.class public final synthetic Ll/᩻᩶۫;
.super Ljava/lang/Object;
.source "27JL"

# interfaces
.implements Ll/֨֨;


# instance fields
.field public final synthetic ۙ:I

.field public final synthetic ۤ:Ll/᩹ۖ᩸;

.field public final synthetic ᩷:Ll/᩹ۖ᩸;

.field public final synthetic ᩸:Ll/᩹ۖ᩸;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;Ll/᩹ۖ᩸;I)V
    .locals 0

    .line 0
    iput p4, p0, Ll/᩻᩶۫;->ۙ:I

    iput-object p1, p0, Ll/᩻᩶۫;->᩷:Ll/᩹ۖ᩸;

    iput-object p2, p0, Ll/᩻᩶۫;->ۤ:Ll/᩹ۖ᩸;

    iput-object p3, p0, Ll/᩻᩶۫;->᩸:Ll/᩹ۖ᩸;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/᩻᩶۫;->ۙ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/᩹۟۫;

    .line 223
    invoke-virtual {p1}, Ll/᩹۟۫;->ۙ()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩻᩶۫;->᩷:Ll/᩹ۖ᩸;

    invoke-virtual {v1, v0}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 224
    invoke-virtual {p1}, Ll/᩹۟۫;->ۤ()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩻᩶۫;->ۤ:Ll/᩹ۖ᩸;

    invoke-virtual {v1, v0}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 225
    invoke-virtual {p1}, Ll/᩹۟۫;->᩷()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/᩻᩶۫;->᩸:Ll/᩹ۖ᩸;

    invoke-virtual {v0, p1}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-void

    .line 0
    :pswitch_0
    check-cast p1, Ll/֫ܿ۫;

    .line 200
    invoke-virtual {p1}, Ll/֫ܿ۫;->ۙ()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩻᩶۫;->᩷:Ll/᩹ۖ᩸;

    invoke-virtual {v1, v0}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 201
    invoke-virtual {p1}, Ll/֫ܿ۫;->ۤ()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩻᩶۫;->ۤ:Ll/᩹ۖ᩸;

    invoke-virtual {v1, v0}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    .line 202
    invoke-virtual {p1}, Ll/֫ܿ۫;->᩷()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/᩻᩶۫;->᩸:Ll/᩹ۖ᩸;

    invoke-virtual {v0, p1}, Ll/᩹ۖ᩸;->᩷(Ljava/lang/CharSequence;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
