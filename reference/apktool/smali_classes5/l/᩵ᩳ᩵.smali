.class public final Ll/᩵ᩳ᩵;
.super Ll/ۛᩳ᩵;
.source "S6IE"

# interfaces
.implements Ljava/util/Iterator;


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 3

    .line 547
    invoke-virtual {p0}, Ll/ۛᩳ᩵;->ۙ()V

    .line 548
    invoke-virtual {p0}, Ll/ۛᩳ᩵;->᩷()I

    move-result v0

    invoke-virtual {p0}, Ll/ۛᩳ᩵;->᩸()Ll/ܰᩳ᩵;

    move-result-object v1

    invoke-static {v1}, Ll/ܰᩳ᩵;->ۤ(Ll/ܰᩳ᩵;)I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 549
    invoke-virtual {p0}, Ll/ۛᩳ᩵;->᩷()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1}, Ll/ۛᩳ᩵;->᩷(I)V

    invoke-virtual {p0, v0}, Ll/ۛᩳ᩵;->ۤ(I)V

    .line 550
    new-instance v0, Ll/ۨᩳ᩵;

    invoke-virtual {p0}, Ll/ۛᩳ᩵;->᩸()Ll/ܰᩳ᩵;

    move-result-object v1

    invoke-virtual {p0}, Ll/ۛᩳ᩵;->ۤ()I

    move-result v2

    invoke-direct {v0, v1, v2}, Ll/ۨᩳ᩵;-><init>(Ll/ܰᩳ᩵;I)V

    .line 551
    invoke-virtual {p0}, Ll/ۛᩳ᩵;->ᩴ()V

    return-object v0

    .line 548
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
