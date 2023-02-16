package better.loot.Items;

import better.loot.Main;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

import java.util.ArrayList;
import java.util.List;

public class CreateItems {
    public CreateItems() {
        //wood/leather stuff
            //Wooden sword
            Main.getInstance().getItemManager().createItem(new ItemAPI(Material.WOODEN_SWORD, "ARKINATOR" , genEnchantments(new EnchantmentAPI() {
                @Override
                public Enchantment getEnchantment() {
                    return Enchantment.DAMAGE_ALL;
                }

                @Override
                public int level() {
                    return 5;
                }
            },
                    new EnchantmentAPI() {
                @Override
                public Enchantment getEnchantment() {
                    return Enchantment.FIRE_ASPECT;
                }

                @Override
                public int level() {
                    return 1;
                }
            },
                    new EnchantmentAPI() {
                @Override
                public Enchantment getEnchantment() {
                    return Enchantment.KNOCKBACK;
                }

                @Override
                public int level() {
                    return 2;
                }
            }),
                    genLore("Ask Builder479.")).build());
            Main.getInstance().getItemManager().createItem(new ItemAPI(Material.LEATHER_HELMET, "Helmet of the real pro!", genEnchantments(new EnchantmentAPI() {
                                                                                                                                              @Override
                                                                                                                                              public Enchantment getEnchantment() {
                                                                                                                                                  return Enchantment.PROTECTION_ENVIRONMENTAL;
                                                                                                                                              }

                                                                                                                                              @Override
                                                                                                                                              public int level() {
                                                                                                                                                  return 2;
                                                                                                                                              }
                                                                                                                                          },
                    new EnchantmentAPI() {
                        @Override
                        public Enchantment getEnchantment() {
                            return Enchantment.PROTECTION_PROJECTILE;
                        }

                        @Override
                        public int level() {
                            return 3;
                        }
                    }),
                    genLore("The pro will winn in the end!")).build());
            Main.getInstance().getItemManager().createItem(new ItemAPI(Material.LEATHER_CHESTPLATE, "Chest plate of the real pro!", genEnchantments(new EnchantmentAPI() {
                                                                                                                                               @Override
                                                                                                                                               public Enchantment getEnchantment() {
                                                                                                                                                   return Enchantment.PROTECTION_ENVIRONMENTAL;
                                                                                                                                               }

                                                                                                                                               @Override
                                                                                                                                               public int level() {
                                                                                                                                                   return 2;
                                                                                                                                               }
                                                                                                                                           },
                    new EnchantmentAPI() {
                        @Override
                        public Enchantment getEnchantment() {
                            return Enchantment.PROTECTION_PROJECTILE;
                        }

                        @Override
                        public int level() {
                            return 3;
                        }
                    }),
                    genLore("The pro will winn in the end!")).build());
            Main.getInstance().getItemManager().createItem(new ItemAPI(Material.LEATHER_LEGGINGS, "Leggins of the real pro!", genEnchantments(new EnchantmentAPI() {
                                                                                                                                                                   @Override
                                                                                                                                                                   public Enchantment getEnchantment() {
                                                                                                                                                                       return Enchantment.PROTECTION_ENVIRONMENTAL;
                                                                                                                                                                   }

                                                                                                                                                                   @Override
                                                                                                                                                                   public int level() {
                                                                                                                                                                       return 2;
                                                                                                                                                                   }
                                                                                                                                                               },
                    new EnchantmentAPI() {
                        @Override
                        public Enchantment getEnchantment() {
                            return Enchantment.PROTECTION_PROJECTILE;
                        }

                        @Override
                        public int level() {
                            return 3;
                        }
                    }),
                    genLore("The pro will winn in the end!")).build());
            Main.getInstance().getItemManager().createItem(new ItemAPI(Material.LEATHER_BOOTS, "Boots of the real pro!", genEnchantments(new EnchantmentAPI() {
                                                                                                                                                             @Override
                                                                                                                                                             public Enchantment getEnchantment() {
                                                                                                                                                                 return Enchantment.PROTECTION_ENVIRONMENTAL;
                                                                                                                                                             }

                                                                                                                                                             @Override
                                                                                                                                                             public int level() {
                                                                                                                                                                 return 2;
                                                                                                                                                             }
                                                                                                                                                         },
                    new EnchantmentAPI() {
                        @Override
                        public Enchantment getEnchantment() {
                            return Enchantment.PROTECTION_PROJECTILE;
                        }

                        @Override
                        public int level() {
                            return 3;
                        }
                    }),
                    genLore("The pro will winn in the end!")).build());
        //Gold stuff
            //Swords
            Main.getInstance().getItemManager().createItem(new ItemAPI(Material.GOLDEN_SWORD, "King's sword" , genEnchantments(new EnchantmentAPI() {
                                                                                                                                @Override
                                                                                                                                public Enchantment getEnchantment() {
                                                                                                                                    return Enchantment.DAMAGE_ALL;
                                                                                                                                }

                                                                                                                                @Override
                                                                                                                                public int level() {
                                                                                                                                    return 5;
                                                                                                                                }
                                                                                                                            },
                    new EnchantmentAPI() {
                        @Override
                        public Enchantment getEnchantment() {
                            return Enchantment.FIRE_ASPECT;
                        }

                        @Override
                        public int level() {
                            return 1;
                        }
                    },
                    new EnchantmentAPI() {
                        @Override
                        public Enchantment getEnchantment() {
                            return Enchantment.KNOCKBACK;
                        }

                        @Override
                        public int level() {
                            return 2;
                        }
                    }),
                    genLore("Stolen from the king of the pigmans.")).build());
            //armor
            Main.getInstance().getItemManager().createItem(new ItemAPI(Material.GOLDEN_HELMET, "Crown", genEnchantments(new EnchantmentAPI() {
                                                                                                                                               @Override
                                                                                                                                               public Enchantment getEnchantment() {
                                                                                                                                                   return Enchantment.PROTECTION_ENVIRONMENTAL;
                                                                                                                                               }

                                                                                                                                               @Override
                                                                                                                                               public int level() {
                                                                                                                                                   return 2;
                                                                                                                                               }
                                                                                                                                           },
                    new EnchantmentAPI() {
                        @Override
                        public Enchantment getEnchantment() {
                            return Enchantment.PROTECTION_PROJECTILE;
                        }

                        @Override
                        public int level() {
                            return 3;
                        }
                    }),
                    genLore("Take this, king.")).build());
            Main.getInstance().getItemManager().createItem(new ItemAPI(Material.GOLDEN_CHESTPLATE, "Pigman-Protector-3000", genEnchantments(new EnchantmentAPI() {
                                                                                                                                                                   @Override
                                                                                                                                                                   public Enchantment getEnchantment() {
                                                                                                                                                                       return Enchantment.PROTECTION_ENVIRONMENTAL;
                                                                                                                                                                   }

                                                                                                                                                                   @Override
                                                                                                                                                                   public int level() {
                                                                                                                                                                       return 2;
                                                                                                                                                                   }
                                                                                                                                                               },
                    new EnchantmentAPI() {
                        @Override
                        public Enchantment getEnchantment() {
                            return Enchantment.PROTECTION_PROJECTILE;
                        }

                        @Override
                        public int level() {
                            return 3;
                        }
                    }),
                    genLore("Will protect you from any Pigman.")).build());
            Main.getInstance().getItemManager().createItem(new ItemAPI(Material.GOLDEN_LEGGINGS, "Pigman-Protector-3000", genEnchantments(new EnchantmentAPI() {
                                                                                                                                                             @Override
                                                                                                                                                             public Enchantment getEnchantment() {
                                                                                                                                                                 return Enchantment.PROTECTION_ENVIRONMENTAL;
                                                                                                                                                             }

                                                                                                                                                             @Override
                                                                                                                                                             public int level() {
                                                                                                                                                                 return 2;
                                                                                                                                                             }
                                                                                                                                                         },
                    new EnchantmentAPI() {
                        @Override
                        public Enchantment getEnchantment() {
                            return Enchantment.PROTECTION_PROJECTILE;
                        }

                        @Override
                        public int level() {
                            return 3;
                        }
                    }),
                    genLore("Will protect you from any Pigman.")).build());
            Main.getInstance().getItemManager().createItem(new ItemAPI(Material.GOLDEN_BOOTS, "Pigman-Protector-3000", genEnchantments(new EnchantmentAPI() {
                                                                                                                                                        @Override
                                                                                                                                                        public Enchantment getEnchantment() {
                                                                                                                                                            return Enchantment.PROTECTION_ENVIRONMENTAL;
                                                                                                                                                        }

                                                                                                                                                        @Override
                                                                                                                                                        public int level() {
                                                                                                                                                            return 2;
                                                                                                                                                        }
                                                                                                                                                    },
                    new EnchantmentAPI() {
                        @Override
                        public Enchantment getEnchantment() {
                            return Enchantment.PROTECTION_PROJECTILE;
                        }

                        @Override
                        public int level() {
                            return 3;
                        }
                    }),
                    genLore("Will protect you from any Pigman.")).build());
        //Gold stuff
        //Swords
        Main.getInstance().getItemManager().createItem(new ItemAPI(Material.GOLDEN_SWORD, "King's sword" , genEnchantments(new EnchantmentAPI() {
                                                                                                                               @Override
                                                                                                                               public Enchantment getEnchantment() {
                                                                                                                                   return Enchantment.DAMAGE_ALL;
                                                                                                                               }

                                                                                                                               @Override
                                                                                                                               public int level() {
                                                                                                                                   return 5;
                                                                                                                               }
                                                                                                                           },
                new EnchantmentAPI() {
                    @Override
                    public Enchantment getEnchantment() {
                        return Enchantment.FIRE_ASPECT;
                    }

                    @Override
                    public int level() {
                        return 1;
                    }
                },
                new EnchantmentAPI() {
                    @Override
                    public Enchantment getEnchantment() {
                        return Enchantment.KNOCKBACK;
                    }

                    @Override
                    public int level() {
                        return 2;
                    }
                }),
                genLore("Stolen from the king of the pigmans.")).build());
    }

    private List<EnchantmentAPI> genEnchantments(EnchantmentAPI enchantmentAPI1) {
        List<EnchantmentAPI> enchantmentAPIS = new ArrayList<>();
        enchantmentAPIS.add(enchantmentAPI1);
        return enchantmentAPIS;
    }

    private List<EnchantmentAPI> genEnchantments(EnchantmentAPI enchantmentAPI1, EnchantmentAPI enchantmentAPI2) {
        List<EnchantmentAPI> enchantmentAPIS = new ArrayList<>();
        enchantmentAPIS.add(enchantmentAPI1);
        enchantmentAPIS.add(enchantmentAPI2);
        return enchantmentAPIS;
    }
    private List<EnchantmentAPI> genEnchantments(EnchantmentAPI enchantmentAPI1, EnchantmentAPI enchantmentAPI2, EnchantmentAPI enchantmentAPI3) {
        List<EnchantmentAPI> enchantmentAPIS = new ArrayList<>();
        enchantmentAPIS.add(enchantmentAPI1);
        enchantmentAPIS.add(enchantmentAPI2);
        enchantmentAPIS.add(enchantmentAPI3);
        return enchantmentAPIS;
    }

    private List<String> genLore(String s) {
        List<String> strings = new ArrayList<>();
        strings.add(s);
        return strings;
    }
}

