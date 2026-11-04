.class public final synthetic Ll/ۧܺۘ;
.super Ljava/lang/Object;
.source "K7QT"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ܰ:I

.field public final synthetic ᩶:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۧܺۘ;->ܰ:I

    iput-object p2, p0, Ll/ۧܺۘ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۧܺۘ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۧܺۘ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast v0, Ljava/lang/String;

    .line 11
    check-cast p1, Ll/ܺ֨ۗ;

    .line 210
    instance-of v1, p1, Ll/ۗ֨ۗ;

    if-eqz v1, :cond_0

    .line 211
    check-cast p1, Ll/ۗ֨ۗ;

    invoke-interface {p1, v0}, Ll/ۗ֨ۗ;->setName(Ljava/lang/String;)V

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ۧܺۘ;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/ܿᩳۘ;

    check-cast p1, Ljava/io/Closeable;

    .line 160
    :try_start_0
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 227
    invoke-virtual {v0, p1}, Ll/ܿᩳۘ;->ۙ(Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۨۧۗ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
